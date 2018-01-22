package com.gbicc.shibeikeapp.entity;

import java.io.Serializable;

public class Forum implements Serializable {
	private String forumId;
	private String forumDesc;
	private String addTime;
	private String forumTitle;
	private String forumPerson;
	private String userCode;
	private String chapterCode;
	
	
	
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getChapterCode() {
		return chapterCode;
	}
	public void setChapterCode(String chapterCode) {
		this.chapterCode = chapterCode;
	}
	public String getForumPerson() {
		return forumPerson;
	}
	public void setForumPerson(String forumPerson) {
		this.forumPerson = forumPerson;
	}
	public String getForumTitle() {
		return forumTitle;
	}
	public void setForumTitle(String forumTitle) {
		this.forumTitle = forumTitle;
	}
	public String getForumId() {
		return forumId;
	}
	public void setForumId(String forumId) {
		this.forumId = forumId;
	}
	public String getForumDesc() {
		return forumDesc;
	}
	public void setForumDesc(String forumDesc) {
		this.forumDesc = forumDesc;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	
	
}
