package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.ReturnForum;

import java.util.List;
import java.util.Map;


public interface returnForumService {
	//增加评论
	public void insertreturnForum(ReturnForum returnforum);
	//显示所有回复
    public List<ReturnForum> showReturnForum(Map<String, Object> map);
    //查询出对应留言的所有回复
  	public int returnforumCount(Map<String, Object> map);
}
