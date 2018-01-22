package com.gbicc.shibeikeapp.entity;

import java.util.Date;

public class SysBuy {
	private String buyId;
	private String userId;
	private String chapterId;
	private Date update;
	
	private String dingdanId;
	private String payType;
	
	public String getDingdanId() {
		return dingdanId;
	}
	public void setDingdanId(String dingdanId) {
		this.dingdanId = dingdanId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getBuyId() {
		return buyId;
	}
	public void setBuyId(String buyId) {
		this.buyId = buyId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getChapterId() {
		return chapterId;
	}
	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	
}
