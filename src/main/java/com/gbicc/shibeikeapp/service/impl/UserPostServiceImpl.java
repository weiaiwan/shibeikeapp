package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.UserPostDao;
import com.gbicc.shibeikeapp.entity.UserPostTab;
import com.gbicc.shibeikeapp.service.UserPostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value="userPostService")
public class UserPostServiceImpl implements UserPostService {
	@Resource
	private UserPostDao userPostDao;
	
	public void setUserPostDao(UserPostDao userPostDao) {
		this.userPostDao = userPostDao;
	}

	@Override
	public void addUserPost(UserPostTab up) {
		userPostDao.addUserPost(up);
	}

	@Override
	public void deleteUserPostByUserId(String userId) {
		userPostDao.deleteUserPostByUserId(userId);
	}

	@Override
	public void deleteUserPostByPostId(String postId) {
		userPostDao.deleteUserPostByPostId(postId);
	}

}
