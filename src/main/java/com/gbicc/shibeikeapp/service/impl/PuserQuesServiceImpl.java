package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.PuserQuesDao;
import com.gbicc.shibeikeapp.entity.PuserQuesTab;
import com.gbicc.shibeikeapp.service.PuserQuesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("puserQuesService")
public class PuserQuesServiceImpl implements PuserQuesService {
	@Resource
	private PuserQuesDao puserQuesDao;
	
	public PuserQuesDao getPuserQuesDao() {
		return puserQuesDao;
	}

	public void setPuserQuesDao(PuserQuesDao puserQuesDao) {
		this.puserQuesDao = puserQuesDao;
	}

	@Override
	public void AddUserQues(PuserQuesTab userques) {
		// TODO Auto-generated method stub
		puserQuesDao.AddUserQues(userques);
	}

	@Override
	public List<PuserQuesTab> getUserQues(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getUserQues(map);
	}

	@Override
	public PuserQuesTab getByUserQues(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getByUserQues(map);
	}


	@Override
	public void updateUserQues(PuserQuesTab userques) {
		// TODO Auto-generated method stub
		puserQuesDao.updateUserQues(userques);
	}

	@Override
	public PuserQuesTab getAnswerisOK(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getAnswerisOK(map);
	}

	@Override
	public List<PuserQuesTab> getScore(Map<String, Object> map) {
		return puserQuesDao.getScore(map);
	}

	@Override
	public void delUserQues(String paperId) {
		// TODO Auto-generated method stub
		puserQuesDao.delUserQues(paperId);
	}

	@Override
	public void delUserQuess(String paperId) {
		// TODO Auto-generated method stub
		puserQuesDao.delUserQuess(paperId);
	}

	@Override
	public List<PuserQuesTab> getContion(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getContion(map);
	}

	@Override
	public void updateUserType1(PuserQuesTab userques) {
		// TODO Auto-generated method stub
		puserQuesDao.updateUserType1(userques);
	}

	@Override
	public List<PuserQuesTab> getQues(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getQues(map);
	}

	@Override
	public void updateUserType0(PuserQuesTab userques) {
		// TODO Auto-generated method stub
		puserQuesDao.updateUserType0(userques);
	}

	@Override
	public int getQuesbyUser(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getQuesbyUser(map);
	}

	@Override
	public PuserQuesTab selectDa(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.selectDa(map);
	}

	@Override
	public int getScore1(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserQuesDao.getScore1(map);
	}
}
