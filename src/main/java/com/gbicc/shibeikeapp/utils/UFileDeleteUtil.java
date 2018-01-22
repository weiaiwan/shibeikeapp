package com.gbicc.shibeikeapp.utils;

import org.apache.http.Header;
import ufile.UFileClient;
import ufile.UFileConfig;
import ufile.UFileRequest;
import ufile.UFileResponse;
import ufile.sender.DeleteSender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UFileDeleteUtil {
	public String toDelete(String name){
		// 读配置文件
				UseConfig use = new UseConfig();
				UFileConfig.getInstance().setUcloudPublicKey(use.getUCloudPublicKey());
				UFileConfig.getInstance().setUcloudPrivateKey(use.getUCloudPrivateKey());
				UFileConfig.getInstance().setProxySuffix(use.getProxySuffix());
				UFileConfig.getInstance().setDownloadProxySuffix(use.getDownloadProxySuffix());
				
				UFileRequest req = new UFileRequest();
				req.setBucketName(use.getBucketName());
				req.setKey(name);
				String a="";
				UFileClient ufileClient = null;
				try {
					ufileClient = new UFileClient();
					 a = deleteFile(ufileClient, req);
				} finally {
					ufileClient.shutdown();
				}
				return a;
	}
private static String deleteFile(UFileClient ufileClient, UFileRequest request) {
		String a = "";
		DeleteSender sender = new DeleteSender();
		sender.makeAuth(ufileClient, request);
		
		UFileResponse response = sender.send(ufileClient, request);
		if (response != null) {
			System.out.println("status line: " + response.getStatusLine());
			a=(response.getStatusLine()).toString();
			Header[] headers = response.getHeaders();
			for (int i = 0; i < headers.length; i++) {
				System.out.println("header " + headers[i].getName() + " : " + headers[i].getValue());
			}
		
			System.out.println("body length: " + response.getContentLength());
			
			if (response.getContent() != null) {
				BufferedReader br = null;
				try {
					br = new BufferedReader(new InputStreamReader(response.getContent()));
					String input;
					while((input = br.readLine()) != null) {
						System.out.println(input);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}	
			}
		}
		return a;
	}
	
}
