package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.CoursewareTab;

import java.util.List;
import java.util.Map;


public interface CoursewareService {
	public void AddCour(CoursewareTab coursewareTab);
	public List<CoursewareTab> getChapIdCour(String ChapterId);
	public void delCour(String CourId);
	public int getChapIdCourCount(String ChapterId);
	public List<CoursewareTab> findChapIdCour(Map<String, Object> map);
	public void  updateCourseware(String coursewareId);
	public CoursewareTab getCoursewareId(String coursewareId);
	public CoursewareTab getUrl(String coursewareUrl);
	
	public int getFuJianCount(String coursewareTitle);
	public void delFuJian(String coursewareUrl);
	public void setUfileUrl(Map<String, Object> map);
	public void delAllFuJian(String ChapterId);
	public List<CoursewareTab> getFHMV();
}
