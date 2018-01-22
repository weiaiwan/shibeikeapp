package com.gbicc.shibeikeapp.entity;

import java.io.Serializable;

public class UserPostTab implements Serializable {
	
	private String upId;
	
	private String userId;
	
	private String postId;

	public String getUpId() {
		return upId;
	}

	public void setUpId(String upId) {
		this.upId = upId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}
	
	
}
