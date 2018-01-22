package com.gbicc.shibeikeapp.utils;

import java.util.ResourceBundle;

public class UseConfig {
	public String UCloudPublicKey = "";
	public String UCloudPrivateKey = "";
	public String ProxySuffix = "";
	public String DownloadProxySuffix = "";
	public String bucketName = "";
	public UseConfig(){
		ResourceBundle rb = ResourceBundle.getBundle("config"); 
		this.UCloudPublicKey = rb.getString("UCloudPublicKey");
		this.UCloudPrivateKey = rb.getString("UCloudPrivateKey");
		this.ProxySuffix = rb.getString("ProxySuffix");
		this.DownloadProxySuffix = rb.getString("DownloadProxySuffix");
		this.bucketName = rb.getString("bucketName");
	}
	public String getUCloudPublicKey() {
		return UCloudPublicKey;
	}
	public void setUCloudPublicKey(String uCloudPublicKey) {
		UCloudPublicKey = uCloudPublicKey;
	}
	public String getUCloudPrivateKey() {
		return UCloudPrivateKey;
	}
	public void setUCloudPrivateKey(String uCloudPrivateKey) {
		UCloudPrivateKey = uCloudPrivateKey;
	}
	public String getProxySuffix() {
		return ProxySuffix;
	}
	public void setProxySuffix(String proxySuffix) {
		ProxySuffix = proxySuffix;
	}
	public String getDownloadProxySuffix() {
		return DownloadProxySuffix;
	}
	public void setDownloadProxySuffix(String downloadProxySuffix) {
		DownloadProxySuffix = downloadProxySuffix;
	}
	public String getBucketName() {
		return bucketName;
	}
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}
	
}
