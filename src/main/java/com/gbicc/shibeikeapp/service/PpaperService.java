package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.PpaperTab;

import java.util.List;
import java.util.Map;


public interface PpaperService {
	/**
	 * 根据Id查询试卷信息
	 * @param id
	 * @return
	 */
	public PpaperTab getIdPager(String id);
	/**
	 * 分页查询试卷信息
	 * @param chapId
	 * @return
	 */
	public List<PpaperTab> getPageChapPager(Map<String, Object> map);
	public List<PpaperTab> getPageChapPager1(Map<String, Object> map);
	/**
	 * 根据章节Id查询试卷信息
	 * @param chapId
	 * @return
	 */
	public List<PpaperTab> getChapPager(int chapId);
	/**
	 * 添加试卷
	 * @param paperTab
	 */
	public void savePager(PpaperTab paperTab);
	/**
	 * 删除试卷
	 * @param id
	 */
	public void deltePager(int id);
	/**
	 * 查看条数
	 * @param chapId
	 * @return
	 */
	public int getPageCount(Map<String, Object> map);
	/**
	 * 修改试题
	 * @param paperId
	 */
	public void updatePaper(PpaperTab paperTab);
	/**
	 * 修改分数
	 * @param paperId
	 */
	public void updatePapergrade(Map<String, Object> map);
	/**
	 *再次上传 
	 */
	public void upPaperState(Map<String, Object> map);
	public void delPaper(String paperId);
	public void delPapers(String paperId);
	public void pupdateJurisType(Map<String, Object> map);
	
}
