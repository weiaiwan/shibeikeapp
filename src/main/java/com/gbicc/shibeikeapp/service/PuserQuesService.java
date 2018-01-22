package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.PuserQuesTab;

import java.util.List;
import java.util.Map;


public interface PuserQuesService {
	/**
	 * 添加用户与表关系
	 * @param userques
	 */
	public void AddUserQues(PuserQuesTab userques);
	/**
	 * 查询考试用户答题情况 list
	 * @param map
	 * @return
	 */
	public List<PuserQuesTab> getUserQues(Map<String, Object> map);
	/**
	 * 查询考试用户答题情况 entity
	 * @param map
	 * @return
	 */
	public PuserQuesTab getByUserQues(Map<String, Object> map);
	/**
	 * 判断用户是否以答题
	 */
	public PuserQuesTab getAnswerisOK(Map<String, Object> map);
	/**
	 * 修改用户与表关系
	 * @param userques
	 */
	public void updateUserQues(PuserQuesTab userques);
	/**
	 * 统计用户的成绩
	 */
	public List<PuserQuesTab> getScore(Map<String, Object> map);
	/**
	 * 统计用户的成绩
	 */
	public int getScore1(Map<String, Object> map);
	 
	public void delUserQues(String paperId);
	public void delUserQuess(String paperId);
	//查看答题之后的正确错误情况
	public List<PuserQuesTab> getContion(Map<String, Object> map);
	/**
	 * 修改type=1
	 */
	public void updateUserType1(PuserQuesTab userques);
	/**
	 * 修改type=0
	 */
	public void updateUserType0(PuserQuesTab userques);
	/*
	 * 获得指定试题
	 */
	public List<PuserQuesTab> getQues(Map<String, Object> map);
	/*
	 * 判断指定用户是否答题
	 */
	public int getQuesbyUser(Map<String, Object> map);
	/**
	 * 查询成绩点击题号显示对应题目
	 */
	public PuserQuesTab selectDa(Map<String, Object> map);
}
