package com.gbicc.shibeikeapp.entity;

import java.io.Serializable;

public class EnterpriseCategory implements Serializable {
	/**
	 * 类别ID
	 */
	private String ec_id;
	/**
	 * 企业类别名称
	 */
	private String ec_name;
	public String getEc_id() {
		return ec_id;
	}
	public void setEc_id(String ec_id) {
		this.ec_id = ec_id;
	}
	public String getEc_name() {
		return ec_name;
	}
	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}
	
	
}
