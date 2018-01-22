package com.gbicc.shibeikeapp.utils;

import ufile.DownloadUrl;
import ufile.UFileClient;
import ufile.UFileConfig;
import ufile.UFileRequest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class UFileDownloadUrlUtil {
	public String getUrl(String theName){
		UseConfig use = new UseConfig();
		UFileConfig.getInstance().setUcloudPublicKey(use.getUCloudPublicKey());
		UFileConfig.getInstance().setUcloudPrivateKey(use.getUCloudPrivateKey());
		UFileConfig.getInstance().setProxySuffix(use.getProxySuffix());
		UFileConfig.getInstance().setDownloadProxySuffix(use.getDownloadProxySuffix());
		
		UFileRequest request = new UFileRequest();
		request.setBucketName(use.getBucketName());
		request.setKey(theName);
		
		System.out.println("DownloadUrl Test BEGIN ...");
		// url链接的有效期为一天，从当前unix时间戳开始，86400秒后结束
		boolean isPrivate = true;
		UFileClient ufileClient = new UFileClient();
		int ttl = 5;
		/*
		 * 针对私有的Bucket，为了防止盗链，建议生成的链接的有效期为ttl > 0; 如果 ttl == 0, 那么生成的链接永久有效
		 */
		String url = downloadUrl(ufileClient, request, ttl, isPrivate);
		System.out.println(url);

//		downloadFileFromUrl(url, saveAsPath);

		System.out.println("DownloadUrl Test END ...\n\n");
		
		return url;
	}
	private static void downloadFileFromUrl(String urlStr, String saveAsPath) {
		URL url;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			inputStream = conn.getInputStream();
			outputStream = new BufferedOutputStream(new FileOutputStream(
					saveAsPath));
			int bufSize = 1024 * 4;
			byte[] buffer = new byte[bufSize];
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, bytesRead);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static String downloadUrl(UFileClient ufileClient,
			UFileRequest request, int ttl, boolean isPrivate) {
		DownloadUrl downloadUrl = new DownloadUrl();
		return downloadUrl.getUrl(ufileClient, request, ttl, isPrivate);
	}
}
