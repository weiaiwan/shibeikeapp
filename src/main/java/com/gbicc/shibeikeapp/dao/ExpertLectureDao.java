package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ExpertLecture;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("expertLectureDao")
public interface ExpertLectureDao {
	/**
	 * 查看全部讲座
	 * @param
	 */
	public List<ExpertLecture> getLecture(Map map);
	public int getCount();

	/**
	 * 添加讲座
	 * @param expertLecture
	 */
	public void AddLecture(ExpertLecture expertLecture);
	/**
	 *修改讲座 
	 * @param expertLecture
	 */
	public void updateLecture(ExpertLecture expertLecture);
	/**
	 * 删除讲座
	 * @param
	 */
	public void deleteLecture(String id);
	/**
	 * 根据ID查看详情
	 * @param
	 */
	public ExpertLecture getLectureById(String id);
	
}
