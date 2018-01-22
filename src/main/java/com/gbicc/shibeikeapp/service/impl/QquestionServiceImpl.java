package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.QquestionDao;
import com.gbicc.shibeikeapp.entity.QquestionTab;
import com.gbicc.shibeikeapp.service.QquestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="questionService")
public class QquestionServiceImpl implements QquestionService {
	@Resource
	private QquestionDao questionDao;
	
	public void setQuestionDao(QquestionDao questionDao) {
		this.questionDao = questionDao;
	}

	@Override
	public List<QquestionTab> getPageQues(Map<String, Object> map) {
		return questionDao.getPageQues(map);
	}

	@Override
	public void saveQues(QquestionTab Ques) {
		questionDao.saveQues(Ques);
	}

	@Override
	public void deleteQues(int id) {
		// TODO Auto-generated method stub
		questionDao.deleteQues(id);
	}

	@Override
	public QquestionTab getIDQues(String id) {
		// TODO Auto-generated method stub
		return questionDao.getIDQues(id);
	}

	@Override
	public void updateQues(QquestionTab Ques) {
		// TODO Auto-generated method stub
		questionDao.updateQues(Ques);
	}

	@Override
	public List<QquestionTab> getChapterIDQues(int id) {
		// TODO Auto-generated method stub
		return questionDao.getChapterIDQues(id);
	}

	@Override
	public List<QquestionTab> getPaperIdques(String id) {
		// TODO Auto-generated method stub
		return questionDao.getPaperIdques(id);
	}

	@Override
	public QquestionTab getques(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return questionDao.getques(map);
	}

	@Override
	public List<QquestionTab> getSerial(String paperId) {
		// TODO Auto-generated method stub
		return questionDao.getSerial(paperId);
	}
	
	@Override
	public int getAllRestlt(String paperId) {
		// TODO Auto-generated method stub
		return questionDao.getAllRestlt(paperId);
	}

	@Override
	public List<QquestionTab> getSerial1(String paperId) {
		// TODO Auto-generated method stub
		return questionDao.getSerial1(paperId);
	}

}
