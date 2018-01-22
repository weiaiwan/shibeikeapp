/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.entity;

import java.util.*;
/**
 * @author easyloan 
 * @version 1.0
 * @since 1.0
 */


public class Statute implements java.io.Serializable{
	/**
	 * 法规ID 
	 */
	private String staId;
	/**
	 * 法规内容
	 */
	private String staDesc;
	public String getStaId() {
		return staId;
	}
	public void setStaId(String staId) {
		this.staId = staId;
	}
	public String getStaDesc() {
		return staDesc;
	}
	public void setStaDesc(String staDesc) {
		this.staDesc = staDesc;
	}
	
	
}

