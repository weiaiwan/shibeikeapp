package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.CoursewareDao;
import com.gbicc.shibeikeapp.entity.CoursewareTab;
import com.gbicc.shibeikeapp.service.CoursewareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("coursewareService")
public class CoursewareServiceImpl implements CoursewareService {
	@Resource
	private CoursewareDao coursewareDao;

	public CoursewareDao getCoursewareDao() {
		return coursewareDao;
	}

	public void setCoursewareDao(CoursewareDao coursewareDao) {
		this.coursewareDao = coursewareDao;
	}

	@Override
	public void AddCour(CoursewareTab coursewareTab) {
		coursewareDao.AddCour(coursewareTab);
	}

	@Override
	public List<CoursewareTab> getChapIdCour(String ChapterId) {
		// TODO Auto-generated method stub
		return coursewareDao.getChapIdCour(ChapterId);
	}

	@Override
	public void delCour(String CourId) {
		// TODO Auto-generated method stub
		coursewareDao.delCour(CourId);
	}

	@Override
	public int getChapIdCourCount(String ChapterId) {
		// TODO Auto-generated method stub
		return coursewareDao.getChapIdCourCount(ChapterId);
	}

	@Override
	public List<CoursewareTab> findChapIdCour(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return coursewareDao.findChapIdCour(map);
	}

	@Override
	public void updateCourseware(String coursewareId) {
		// TODO Auto-generated method stub
		coursewareDao.updateCourseware(coursewareId);
	}

	@Override
	public CoursewareTab getCoursewareId(String coursewareUrl) {
		// TODO Auto-generated method stub
		return coursewareDao.getCoursewareId(coursewareUrl);
	}

	@Override
	public CoursewareTab getUrl(String coursewareUrl) {
		// TODO Auto-generated method stub
		return coursewareDao.getUrl(coursewareUrl);
	}

	@Override
	public int getFuJianCount(String coursewareTitle) {
		// TODO Auto-generated method stub
		return coursewareDao.getFuJianCount(coursewareTitle);
	}

	@Override
	public void delFuJian(String coursewareUrl) {
		// TODO Auto-generated method stub
		coursewareDao.delFuJian(coursewareUrl);
	}

	@Override
	public void setUfileUrl(Map<String, Object> map) {
		// TODO Auto-generated method stub
		coursewareDao.setUfileUrl(map);
	}

	@Override
	public void delAllFuJian(String ChapterId) {
		// TODO Auto-generated method stub
		coursewareDao.delAllFuJian(ChapterId);
	}

	@Override
	public List<CoursewareTab> getFHMV() {
		// TODO Auto-generated method stub
		return coursewareDao.getFHMV();
	}
	
}
