package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.PpaperTabDao;
import com.gbicc.shibeikeapp.entity.PpaperTab;
import com.gbicc.shibeikeapp.service.PpaperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("paperService")
public class PpaperServiceImpl implements PpaperService {
	
	@Resource
	private PpaperTabDao paperTabDao;
	
	public void setPaperTabDao(PpaperTabDao paperTabDao) {
		this.paperTabDao = paperTabDao;
	}

	@Override
	public PpaperTab getIdPager(String id) {
		// TODO Auto-generated method stub
		return paperTabDao.getIdPager(id);
	}

	@Override
	public List<PpaperTab> getChapPager(int chapId) {
		// TODO Auto-generated method stub
		return paperTabDao.getChapPager(chapId);
	}

	@Override
	public void savePager(PpaperTab paperTab) {
		// TODO Auto-generated method stub
		paperTabDao.savePager(paperTab);
	}

	@Override
	public void deltePager(int id) {
		// TODO Auto-generated method stub
		paperTabDao.deltePager(id);
	}

	@Override
	public List<PpaperTab> getPageChapPager(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return paperTabDao.getPageChapPager(map);
	}

	@Override
	public int getPageCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return paperTabDao.getPageCount(map);
	}

	@Override
	public void updatePaper(PpaperTab paperTab) {
		// TODO Auto-generated method stub
		paperTabDao.updatePaper(paperTab);
	}

	@Override
	public void updatePapergrade(Map<String, Object> map) {
		// TODO Auto-generated method stub
		paperTabDao.updatePapergrade(map);
	}

	@Override
	public void upPaperState(Map<String, Object> map) {
		// TODO Auto-generated method stub
		paperTabDao.upPaperState(map);
	}

	@Override
	public void delPaper(String paperId) {
		// TODO Auto-generated method stub
		paperTabDao.delPaper(paperId);
	}

	@Override
	public void delPapers(String paperId) {
		// TODO Auto-generated method stub
		paperTabDao.delPapers(paperId);
	}

	@Override
	public List<PpaperTab> getPageChapPager1(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return paperTabDao.getPageChapPager1(map);
	}

	@Override
	public void pupdateJurisType(Map<String, Object> map) {
		// TODO Auto-generated method stub
		paperTabDao.pupdateJurisType(map);
		
	}

}
