package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.QpaperQuestionDao;
import com.gbicc.shibeikeapp.entity.QpaperQuestion;
import com.gbicc.shibeikeapp.service.QpaperQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;


@Service("paperQuesService")
public class QpaperQuestionServiceImpl implements QpaperQuestionService {
	@Resource
	private QpaperQuestionDao paperQuestionDao;

	public void setPaperQuestionDao(QpaperQuestionDao paperQuestionDao) {
		this.paperQuestionDao = paperQuestionDao;
	}

	@Override
	public void saveQaperQues(QpaperQuestion qpaperQuestion) {
		paperQuestionDao.saveQaperQues(qpaperQuestion);
	}
	@Override
	public int getSerial(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return paperQuestionDao.getSerial(map);
	}

	@Override
	public void delPaperQues(String paperId) {
		paperQuestionDao.delPaperQues(paperId);
		
	}

	@Override
	public void delPapersQues(String paperId) {
		// TODO Auto-generated method stub
		paperQuestionDao.delPapersQues(paperId);
	}
}
