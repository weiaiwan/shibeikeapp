package com.gbicc.shibeikeapp.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPUtil {
	public static String getIP(){
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost("http://pv.sohu.com/cityjson?ie=utf-8");
		httpPost.setHeader("Cache-Control", "max-age=0");
		httpPost.setHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		httpPost.setHeader("Accept-Encoding", "gzip,deflate,sdch");
		httpPost.setHeader("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.3");
		httpPost.setHeader("Accept-Language", "en-US,en;q=0.8");
		httpPost.setHeader("Accept-Encoding", "gzip,deflate,sdch");
		HttpResponse response;
		String sb1 = null;
		try {
			response = httpclient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				java.io.InputStream instreams = entity.getContent();
				BufferedReader bf = new BufferedReader(new InputStreamReader(
						instreams, "utf-8"));
				// 文件处理方式
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = bf.readLine()) != null) {
					sb.append(line + "\n");
				}
				sb1 = sb.toString();
				httpPost.abort();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				return sb1;
	}
}
