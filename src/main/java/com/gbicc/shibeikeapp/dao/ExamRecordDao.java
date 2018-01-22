package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ExamRecord;

import java.util.List;
import java.util.Map;



public interface ExamRecordDao {
	/**
	 * 查询userId的考试记录总条数
	 * @param
	 * @return
	 */
	public Integer getCount(String userId);
	/**
	 * 查询userId 的 第a条到第b条之间的所有考试记录
	 * @return
	 */
	public List<ExamRecord> getExamRecord(Map<String, Object> map);
	

}
