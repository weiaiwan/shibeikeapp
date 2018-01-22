package com.gbicc.shibeikeapp.entity;

import java.util.Date;

public class Logs {
	
	private String id;
	/**
	 * 操作人ID
	 */
	private String userid;
	/**
	 * 操作人名称
	 */
	private String userName;
	/**
	 * 操作时间
	 */
	private String time;
	/**
	 * 操作类型			1为登录
	 */
	private String operatetype;
	/**
	 * 操作对象
	 */
	private String operatetObject;
	/**
	 * 客户端ip地址
	 */
	private String ipAddr;
	
	

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getOperatetype() {
		return operatetype;
	}

	public void setOperatetype(String operatetype) {
		this.operatetype = operatetype;
	}

	public String getOperatetObject() {
		return operatetObject;
	}

	public void setOperatetObject(String operatetObject) {
		this.operatetObject = operatetObject;
	}
	
	
}
