package com.gbicc.shibeikeapp.entity;

import java.io.Serializable;

public class ReturnForum implements Serializable {
	private String returnforumId;
	private String returnuserCode;
	private String returnforumDesc;
	private String returnTime;
	private String forumCode;
	private String returnuserName;
	private String forumuserCode;
	
	
	public String getForumuserCode() {
		return forumuserCode;
	}
	public void setForumuserCode(String forumuserCode) {
		this.forumuserCode = forumuserCode;
	}
	public String getReturnforumId() {
		return returnforumId;
	}
	public void setReturnforumId(String returnforumId) {
		this.returnforumId = returnforumId;
	}
	public String getReturnuserCode() {
		return returnuserCode;
	}
	public void setReturnuserCode(String returnuserCode) {
		this.returnuserCode = returnuserCode;
	}
	public String getReturnforumDesc() {
		return returnforumDesc;
	}
	public void setReturnforumDesc(String returnforumDesc) {
		this.returnforumDesc = returnforumDesc;
	}
	public String getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}
	public String getForumCode() {
		return forumCode;
	}
	public void setForumCode(String forumCode) {
		this.forumCode = forumCode;
	}
	public String getReturnuserName() {
		return returnuserName;
	}
	public void setReturnuserName(String returnuserName) {
		this.returnuserName = returnuserName;
	}
	
}
