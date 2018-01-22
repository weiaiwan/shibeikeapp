package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.PuserPaper;

import java.util.Map;


public interface PuserPaperService {
	/**
	 * 添加用户考试记录
	 * @param paper
	 */
	public void AddPuserPaper(PuserPaper paper);
	/**
	 * 查询考试记录
	 * @param map
	 * @return
	 */
	public PuserPaper getuserPaper(Map<String, Object> map);
	/**
	 * 修改用户考试记录
	 * @param paper
	 */
	public void updatePuserPaper(PuserPaper paper);
	public void delUserPaper(String paperId);
	public void delUserPapers(String paperId);
	//查询是第几次考试
    public int getuserPapercount(Map<String, Object> map);
	//查询某人员具体的考试记录
	public int newgetuserPaper(Map<String, Object> map);
}
