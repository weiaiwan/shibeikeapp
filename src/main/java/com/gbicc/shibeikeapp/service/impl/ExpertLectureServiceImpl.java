package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.ExpertLectureDao;
import com.gbicc.shibeikeapp.entity.ExpertLecture;
import com.gbicc.shibeikeapp.service.ExpertLectureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="expertLectureService")
public class ExpertLectureServiceImpl implements ExpertLectureService {
	@Resource
	private ExpertLectureDao expertLectureDao;
	
	public ExpertLectureDao getExpertLectureDao() {
		return expertLectureDao;
	}

	public void setExpertLectureDao(ExpertLectureDao expertLectureDao) {
		this.expertLectureDao = expertLectureDao;
	}

	@Override
	public List<ExpertLecture> getLecture(Map map) {
		// TODO Auto-generated method stub
		return expertLectureDao.getLecture(map);
	}

	@Override
	public void AddLecture(ExpertLecture expertLecture) {
		// TODO Auto-generated method stub
		expertLectureDao.AddLecture(expertLecture);
	}

	@Override
	public void updateLecture(ExpertLecture expertLecture) {
		// TODO Auto-generated method stub
		expertLectureDao.updateLecture(expertLecture);
	}

	@Override
	public void deleteLecture(String id) {
		// TODO Auto-generated method stub
		expertLectureDao.deleteLecture(id);
	}

	@Override
	public ExpertLecture getLectureById(String id) {
		// TODO Auto-generated method stub
		return expertLectureDao.getLectureById(id);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return expertLectureDao.getCount();
	}
	
	

}
