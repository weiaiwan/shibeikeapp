package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.ForumDao;
import com.gbicc.shibeikeapp.entity.Forum;
import com.gbicc.shibeikeapp.service.ForumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value="ForumService")
public class ForumServiceImpl implements ForumService {
	@Resource
	private ForumDao forumDao;

	public void insertForum(Forum forum) {
		forumDao.insertForum(forum);
	}

	public List<Forum> showForum(Map<String, Object> map) {
		return forumDao.showForum(map);
	}

	public int forumCount(Map<String, Object> map) {
		return forumDao.forumCount(map);
	}

	public void deleteForum(String forumId) {
		forumDao.deleteForum(forumId);
	}

	public String showForumDesc(String forumId) {
		return forumDao.showForumDesc(forumId);
	}

	@Override
	public List<Forum> showUserForum(Map<String, Object> map) {
		return forumDao.showUserForum(map);
	}

	@Override
	public int forumUserCount(Map<String, Object> map) {
		return forumDao.forumUserCount(map);
	}

	
}
