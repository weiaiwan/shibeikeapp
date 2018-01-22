package com.gbicc.shibeikeapp.entity;

import java.util.Date;

public class WebIntroduce implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 网站介绍ID db_column: web_introd_id
	 */
	private String webIntrodId;
	/**
	 * 网站介绍内容 db_column: web_introd_con
	 */
	private String webIntrodCon;
	/**
	 * 网站介绍编辑人 db_column: user_name
	 */
	private String userName;
	/**
	 * 网站介绍 db_column: web_introd_date
	 */
	String webIntrodDate;
	//end
	public WebIntroduce(String webIntrodId) {
		
		this.webIntrodId = webIntrodId;
	}
	public WebIntroduce() {}
	
	public String getWebIntrodId() {
		return webIntrodId;
	}

	public void setWebIntrodId(String webIntrodId) {
		this.webIntrodId = webIntrodId;
	}
	public String getWebIntrodCon() {
		return webIntrodCon;
	}
	public void setWebIntrodCon(String webIntrodCon) {
		this.webIntrodCon = webIntrodCon;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getWebIntrodDate() {
		return webIntrodDate;
	}
	public void setWebIntrodDate(String webIntrodDate) {
		this.webIntrodDate = webIntrodDate;
	}
	
}
