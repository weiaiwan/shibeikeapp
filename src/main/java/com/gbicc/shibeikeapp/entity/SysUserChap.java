package com.gbicc.shibeikeapp.entity;

public class SysUserChap {
	/*
	 * user_chap_id用户与章节表ID
	 */
	private String userChapId;
	/*
	 * user_id用户ID
	 */
	private String userId;
	/*
	 * chap_id章节表ID
	 */
	private String chapId;
	/*
	 * user_chap_type用户与章节表类型
	 */
	private String userChapType;
	/**
	 * 下载次数     db_column: up_number
	 */	
	private int upNumber;
	/**
	 * 预览量
	 */
	private int previewNumber;
	
	public int getUpNumber() {
		return upNumber;
	}
	public void setUpNumber(int upNumber) {
		this.upNumber = upNumber;
	}
	public int getPreviewNumber() {
		return previewNumber;
	}
	public void setPreviewNumber(int previewNumber) {
		this.previewNumber = previewNumber;
	}
	public String getUserChapId() {
		return userChapId;
	}
	public void setUserChapId(String userChapId) {
		this.userChapId = userChapId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserChapType() {
		return userChapType;
	}
	public void setUserChapType(String userChapType) {
		this.userChapType = userChapType;
	}
	public String getChapId() {
		return chapId;
	}
	public void setChapId(String chapId) {
		this.chapId = chapId;
	}
	
}
