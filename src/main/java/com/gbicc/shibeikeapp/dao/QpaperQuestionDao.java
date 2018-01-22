package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.QpaperQuestion;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@RequestMapping("paperQuestionDao")
public interface QpaperQuestionDao {
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
