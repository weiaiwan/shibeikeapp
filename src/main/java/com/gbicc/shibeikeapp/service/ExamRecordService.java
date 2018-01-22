package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.ExamRecord;

import java.util.List;
import java.util.Map;


public interface ExamRecordService {
	/**
	 * 查询考试记录总条数
	 * @param 
	 * @return
	 */
	public Integer getCount(String userId);
	/**
	 * 查询第a条到第b条之间的所有考试记录
	 * @return
	 */
	public List<ExamRecord> getExamRecord(Map<String, Object> map);
}
