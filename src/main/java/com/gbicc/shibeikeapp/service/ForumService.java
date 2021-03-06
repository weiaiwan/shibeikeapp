package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.Forum;

import java.util.List;
import java.util.Map;


public interface ForumService {
	//增加评论
	public void insertForum(Forum forum);
	//显示所有评论
	public List<Forum> showForum(Map<String, Object> map);
	//查询出论坛总数
	public int forumCount(Map<String, Object> map);
	//根据论坛Id查询出论坛内容
	public String showForumDesc(String forumId);
	//删除论坛
	public void deleteForum(String forumId);
	 //查询出对应课程登陆者的所有留言
  	public List<Forum> showUserForum(Map<String, Object> map);
  	//查询出对应课程登陆者的所有留言条数
  	public int forumUserCount(Map<String, Object> map);
}
