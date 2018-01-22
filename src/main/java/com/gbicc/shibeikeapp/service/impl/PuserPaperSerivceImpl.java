package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.PuserPaperDao;
import com.gbicc.shibeikeapp.entity.PuserPaper;
import com.gbicc.shibeikeapp.service.PuserPaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("puserPaperService")
public class PuserPaperSerivceImpl implements PuserPaperService {
	@Resource
	private PuserPaperDao puserPaperDao;
	
	public PuserPaperDao getPuserPaperDao() {
		return puserPaperDao;
	}

	public void setPuserPaperDao(PuserPaperDao puserPaperDao) {
		this.puserPaperDao = puserPaperDao;
	}

	@Override
	public void AddPuserPaper(PuserPaper paper) {
		// TODO Auto-generated method stub
		puserPaperDao.AddPuserPaper(paper);
	}

	@Override
	public PuserPaper getuserPaper(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserPaperDao.getuserPaper(map);
	}

	@Override
	public void updatePuserPaper(PuserPaper paper) {
		// TODO Auto-generated method stub
		puserPaperDao.updatePuserPaper(paper);
	}

	@Override
	public void delUserPaper(String paperId) {
		// TODO Auto-generated method stub
		puserPaperDao.delUserPaper(paperId);
	}

	@Override
	public void delUserPapers(String paperId) {
		// TODO Auto-generated method stub
		puserPaperDao.delUserPapers(paperId);
	}

	@Override
	public int getuserPapercount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserPaperDao.getuserPapercount(map);
	}

	@Override
	public int newgetuserPaper(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return puserPaperDao.newgetuserPaper(map);
	}

}
