package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ChapterTab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("chapterTabDao")
public interface ChapterTabDao {
	public List<ChapterTab> getChapName();
	public List<ChapterTab> getcourseType();
	public List<ChapterTab> getprofessionalName();
	public List<ChapterTab> getcourseName();
	public List<ChapterTab> getChap(Map<String, Object> map);
	public List<ChapterTab> getChapup(Map<String, Object> map);
	public List<ChapterTab> getChapTrain(Map<String, Object> map);
	public List<ChapterTab> getChapTrains(Map<String, Object> map);
	public List<ChapterTab> getChapTrainByoffice(Map<String, Object> map);
	public void AddChap(ChapterTab chapterTab);
	public int countChap(Map<String, Object> map);
	public int countChapByoffice(Map<String, Object> map);
	public int countChapTrain(Map<String, Object> map);
	//根据地址查找名称
	public String getname(String urls);
	/**
	 * 通过审核
	 */
	public void updateChap(ChapterTab chap);
	/**
	 * 根据id查询
	 */
	public ChapterTab getIdChaper(String paperId);
	public void updateChaper(ChapterTab chapterTab);
	public void updateChaperSta(Map<String, Object> map);
	public List<ChapterTab>  getPageChaper(Map<String, Object> map);
	public void updateChaperNum(Map<String, Object> map);
	public List<ChapterTab> getChaperName(Map map);
	/**
	 * 审核中分页
	 */
	public int findChap(Map<String, Object> map);
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
	public List<ChapterTab> getTenCourse(Map<String, Object> map);
}
