package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.QpaperQuestion;

import java.util.Map;


public interface QpaperQuestionService {
	/*
	 * 添加
	 */
	public void saveQaperQues(QpaperQuestion qpaperQuestion);
	/*
	 * 查询
	 */
	public int getSerial(Map<String, Object> map);
	public void delPaperQues(String paperId);
	public void delPapersQues(String paperId);
}
