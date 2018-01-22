package ufile.sdk.test;

import org.apache.http.Header;
import ufile.UFileClient;
import ufile.UFileConfig;
import ufile.UFileRequest;
import ufile.UFileResponse;
import ufile.sender.GetSender;

import java.io.*;


public class UFileGetTest {
	public static void main(String args[]) {
		String bucketName = "px-gbicc";
		String key = "aw.swf";
		String saveAsPath = "F:\\MyDownloads\\Download\\"+key;
//		String configPath = "";
		
		//加载配置项
//		UFileConfig.getInstance().loadConfig(configPath);
		UFileConfig.getInstance().setUcloudPublicKey("PYfUCAzJ5jFDYl6dq1AKLmfOV6ZIMxmjakcmrlR+GB4XWTTm4EA/7w==");
		UFileConfig.getInstance().setUcloudPrivateKey("1b07ab4ed4f2a8762485ebff1cc499c454ec43ec");
		UFileConfig.getInstance().setProxySuffix(".cn-bj.ufileos.com");
		UFileConfig.getInstance().setDownloadProxySuffix(".ufile.ucloud.com.cn");
		
		UFileRequest request = new UFileRequest();
		request.setBucketName(bucketName);
		request.setKey(key);
		
		UFileClient ufileClient = null;
		try {
			ufileClient = new UFileClient();
			getFile(ufileClient, request, saveAsPath);
		} finally {
			ufileClient.shutdown();
		}
	}
	
	private static void getFile(UFileClient ufileClient, UFileRequest request, String saveAsPath) {
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
					outputStream = new BufferedOutputStream(new FileOutputStream(saveAsPath));
			        int bufSize = 1024 * 4;
			        byte[] buffer = new byte[bufSize];
			        int bytesRead;
			        while ((bytesRead = inputStream.read(buffer)) > 0) {
			        	outputStream.write(buffer, 0, bytesRead);
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
