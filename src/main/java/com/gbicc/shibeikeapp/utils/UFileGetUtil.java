package com.gbicc.shibeikeapp.utils;

import org.apache.http.Header;
import ufile.UFileClient;
import ufile.UFileConfig;
import ufile.UFileRequest;
import ufile.UFileResponse;
import ufile.sender.GetSender;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

public class UFileGetUtil {
	public void toGet(String name,String saveAsPath,HttpServletResponse response,String theName){
		/*ServletOutputStream path = null;
		try {
			path = response.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String saveAsPath = path.toString();*/
//		saveAsPath = saveAsPath+name;
		UseConfig use = new UseConfig();
		UFileConfig.getInstance().setUcloudPublicKey(use.getUCloudPublicKey());
		UFileConfig.getInstance().setUcloudPrivateKey(use.getUCloudPrivateKey());
		UFileConfig.getInstance().setProxySuffix(use.getProxySuffix());
		UFileConfig.getInstance().setDownloadProxySuffix(use.getDownloadProxySuffix());
		
		UFileRequest request = new UFileRequest();
		request.setBucketName(use.getBucketName());
		request.setKey(name);
		
		UFileClient ufileClient = null;
		try {
			ufileClient = new UFileClient();
			getFile(ufileClient, request, saveAsPath,response,theName);
		} finally {
			ufileClient.shutdown();
		}
	}
	
	private static void getFile(UFileClient ufileClient, UFileRequest request,
			String saveAsPath,HttpServletResponse res,String theName) {
		GetSender sender = new GetSender();
		sender.makeAuth(ufileClient, request);
		
		UFileResponse response = sender.send(ufileClient, request);
		if (response != null) {
			
			System.out.println("status line: " + response.getStatusLine());
		
			Header[] headers = response.getHeaders();
			for (int i = 0; i < headers.length; i++) {
				System.out.println("header " + headers[i].getName() + " : " + headers[i].getValue());
			}
		
			System.out.println("body length: " + response.getContentLength());
			
			//handler error response 
			if (response.getStatusLine().getStatusCode() != 200 && response.getContent() != null) {
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
					if (response.getContent() != null) {
						try {
							response.getContent().close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			} else {
				InputStream inputStream = null;
				OutputStream outputStream = null;
				try {
					inputStream = response.getContent();
					OutputStream os = res.getOutputStream();
			        int bufSize = 1024 * 4;
			        byte[] buffer = new byte[bufSize];
			        int bytesRead;
			        res.setCharacterEncoding("UTF-8"); 
			        res.setContentType("application/octet-stream;charset=utf-8");// 设置response内容的类型
	                res.setHeader("Content-disposition","attachment;filename=\"" + URLEncoder.encode(theName, "UTF-8")+"\"");
	                ServletOutputStream aaa = res.getOutputStream();
	                outputStream = new BufferedOutputStream(res.getOutputStream());
			        while ((bytesRead = inputStream.read(buffer)) > 0) {
				        outputStream.write(buffer, 0, bytesRead);
//				        outputStream.write(new byte[inputStream.read(buffer)]);
			        }
			        outputStream.flush();
					
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
		}
	}
	
	
}
