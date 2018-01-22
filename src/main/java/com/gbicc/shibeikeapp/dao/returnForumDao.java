package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ReturnForum;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface returnForumDao {
	//增加回复
	public void insertreturnForum(ReturnForum returnforum);
	//显示所有回复
	public List<ReturnForum> showReturnForum(Map<String, Object> map);
	//查询出对应留言的所有回复
	public int returnforumCount(Map<String, Object> map);
	
}