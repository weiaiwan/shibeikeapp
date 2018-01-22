package ufile.sdk.test;

import org.apache.http.Header;
import ufile.UFileClient;
import ufile.UFileConfig;
import ufile.UFileRequest;
import ufile.UFileResponse;
import ufile.sender.DeleteSender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 删除文件测试
 * @author york
 *
 */
public class UFileDeleteTest {
	public static void main(String args[]) {
		String bucketName = "px-gbicc";
		String key = "WW.swf";
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
			deleteFile(ufileClient, request);
		} finally {
			ufileClient.shutdown();
		}
	}
	
	private static void deleteFile(UFileClient ufileClient, UFileRequest request) {
		
		DeleteSender sender = new DeleteSender();
		sender.makeAuth(ufileClient, request);
		
		UFileResponse response = sender.send(ufileClient, request);
		if (response != null) {
			System.out.println("status line: " + response.getStatusLine());
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
	}
}
