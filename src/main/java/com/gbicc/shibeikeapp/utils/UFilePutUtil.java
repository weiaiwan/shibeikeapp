package com.gbicc.shibeikeapp.utils;

import org.apache.http.Header;
import ufile.UFileClient;
import ufile.UFileConfig;
import ufile.UFileRequest;
import ufile.UFileResponse;
import ufile.sender.PutSender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class UFilePutUtil {
	public void toPut(String key,String filePath){
			UseConfig use = new UseConfig();
			UFileConfig.getInstance().setUcloudPublicKey(use.getUCloudPublicKey());
			UFileConfig.getInstance().setUcloudPrivateKey(use.getUCloudPrivateKey());
			UFileConfig.getInstance().setProxySuffix(use.getProxySuffix());
			UFileConfig.getInstance().setDownloadProxySuffix(use.getDownloadProxySuffix());
			
			UFileRequest request = new UFileRequest();
			request.setBucketName(use.getBucketName());
			request.setKey(key);
			request.setFilePath(filePath);
			
			UFileClient ufileClient = null;
	/*
	 *     一个请求，使用一个UFileClient，亦即使用一个HTTPclient，发送请求，收到响应，关闭连接
	 */
			System.out.println("PutFile BEGIN ...");
			try {
				ufileClient = new UFileClient();
				putFile(ufileClient, request);
			} finally {
				ufileClient.shutdown();
			}
			System.out.println("PutFile END ...\n\n");
			
			
		}
	

	private static void putFile(UFileClient ufileClient, UFileRequest request) {
		PutSender sender = new PutSender();
		sender.makeAuth(ufileClient, request);
		
		UFileResponse response = sender.send(ufileClient, request);
		if (response != null) {
			
			System.out.println("status line: " + response.getStatusLine());
			
			Header[] headers = response.getHeaders();
			for (int i = 0; i < headers.length; i++) {
				System.out.println("header " + headers[i].getName() + " : " + headers[i].getValue());
			}
			
			System.out.println("body length: " + response.getContentLength());
			
			InputStream inputStream = response.getContent();
			if (inputStream != null) {
				try {
					BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
					String s = "";
					while ((s = reader.readLine()) != null) {
						System.out.println(s);
					}
					
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
				}
			}
		}
	}
}
