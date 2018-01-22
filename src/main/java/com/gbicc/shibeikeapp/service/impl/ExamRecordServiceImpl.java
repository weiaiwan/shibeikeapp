package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.ExamRecordDao;
import com.gbicc.shibeikeapp.entity.ExamRecord;
import com.gbicc.shibeikeapp.service.ExamRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value="examRecordService")
public class ExamRecordServiceImpl implements ExamRecordService {
	@Resource
	private ExamRecordDao examRecordDao;
	 
	@Override
	public Integer getCount(String userId) {
		 
		return examRecordDao.getCount(userId);
	}

	@Override
	public List<ExamRecord> getExamRecord(Map<String, Object> map) {
		 
		return examRecordDao.getExamRecord(map);
	}

}
