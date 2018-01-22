package com.gbicc.shibeikeapp.entity;

import java.util.Date;

public class SiteIntroTab implements java.io.Serializable{

	/**
	 * 网站介绍 
	 * id 字段
	 */
	private String introid;
	/**
	 * 网站介绍内容
	 */
	private String introContext;
	/**
	 * 发布日期
	 */
	private Date postDate;
	
	public String getIntroid() {
		return introid;
	}
	public void setIntroid(String introid) {
		this.introid = introid;
	}
	public String getIntroContext() {
		return introContext;
	}
	public void setIntroContext(String introContext) {
		this.introContext = introContext;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	
}
