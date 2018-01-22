package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.ChapterTab;

import java.util.List;
import java.util.Map;


public interface ChapterTabService {
	//根据地址查找名称
	public String getname(String urls);

	public List<ChapterTab> getChapName();
	public List<ChapterTab> getChap(Map<String, Object> map);
	public List<ChapterTab> getChapup(Map<String, Object> map);
	public List<ChapterTab> getChapTrain(Map<String, Object> map);
	public List<ChapterTab> getChapTrains(Map<String, Object> map);
	public void AddChap(ChapterTab chapterTab);
	public int countChap(Map<String, Object> map);
	public List<ChapterTab> getcourseType();
	public List<ChapterTab> getprofessionalName();
	public List<ChapterTab> getcourseName();
	public List<ChapterTab> getChapTrainByoffice(Map<String, Object> map);
	public int countChapByoffice(Map<String, Object> map);
	public List<ChapterTab> getTenCourse(Map<String, Object> map);
	/**
	 * 把审核中的数据变成已审核或者驳回
	 */
	public void updateChap(ChapterTab chap)throws RuntimeException;
	/**
	 * 根据id查询
	 */
	public ChapterTab getIdChaper(String paperId)throws RuntimeException;
	public void updateChaper(ChapterTab chapterTab);
	public void updateChaperSta(Map<String, Object> map);
	public List<ChapterTab>  getPageChaper(Map<String, Object> map);
	/**
	 * 管理员分页查询条数
	 * @param map
	 * @return
	 */
	public int findChap(Map<String, Object> map);
	public List<ChapterTab> getChaperName(Map map);
	public int countChapTrain(Map<String, Object> map);
	//删除课程
	public void deleteChapter(String chapterId);
	public void deleteChaps(String chapterId);
	//个人学习记录
	public List<ChapterTab> getRecode(Map<String, Object> map);
	public int getRecodecount(Map<String, Object> map);
	public void updateJurisType(Map<String, Object> map);
	
	public List<ChapterTab> getFH(Map<String, Object> map);
	public List<ChapterTab> getGK(Map<String, Object> map);
	public List<ChapterTab> getLieBieCourse(Map<String, Object> map);
	public List<String> selectTrainerPhone();
	public int selectLYCount(Map<String, String> map);
	public List<ChapterTab> selectNeiBu(Map<String, Object> map);
	
	public int selectNBCount(Map<String, String> map);
	public List<String> selectChapterOffice();
	public int selectCountNeiBu(Map<String, Object> map);
	
	public int getRecodecount2(Map<String, Object> map);
	public List<ChapterTab> getRecode2(Map<String, Object> map);
}
