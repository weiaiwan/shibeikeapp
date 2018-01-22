package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.returnForumDao;
import com.gbicc.shibeikeapp.entity.ReturnForum;
import com.gbicc.shibeikeapp.service.returnForumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value="returnForumService")
public class returnForumServiceImpl implements returnForumService {
	@Resource
	private returnForumDao returnforumDao;

	public void insertreturnForum(ReturnForum returnforum) {
		returnforumDao.insertreturnForum(returnforum);
	}

	@Override
	public List<ReturnForum> showReturnForum(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return returnforumDao.showReturnForum(map);
	}

	@Override
	public int returnforumCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return returnforumDao.returnforumCount(map);
	}
}
	
