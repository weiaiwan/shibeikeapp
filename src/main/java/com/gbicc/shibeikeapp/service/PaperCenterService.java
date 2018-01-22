package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.PpaperTab;

import java.util.List;
import java.util.Map;


public interface PaperCenterService {
	/**
	 * 查询出试卷类型
	 * @return
	 */
	public List<String> showPaperType();
	/**
	 * 查询出试卷类型数量
	 * @return
	 */
	public List<Integer> calPaperType();
	/**
	 * 查询出不同试卷类型和等级试卷
	 * @return
	 */
	public List<String> showPaperLevel(String paperType);
	/**
	 * 查询出不同试卷类型和等级试卷的数量
	 * @return
	 */
	public List<Integer> calPaperLevel(String paperType);
	/**
	 * 根据试卷类型，试卷等级，试卷名称进行多条件查询
	 * @return
	 */
	public List<PpaperTab> showPaper(Map map);
	/**
	 * 根据试卷类型，试卷等级，试卷名称进行多条件查询，查询出试卷数量
	 * @return
	 */
	public int calPaper(Map map);
	
	public List<PpaperTab> showPaperByFlfg(Map map);
	public int calPaperByFlfg(Map map);
	
	public List<PpaperTab> showPaperByZytj(Map map);
	public int calPaperByZytj(Map map);
	
	public List<PpaperTab> showPaperByDgdj(Map map);
	public int calPaperByDgdj(Map map);
	
	public List<PpaperTab> getPaperS(Map map);
	public int getPaperSCount(Map map);
	
	public List<PpaperTab> showPaperByzc(Map map);
	public int calPaperByzc(Map map);
	
	public List<PpaperTab> showPaperBypcdc(Map map);
	public int calPaperBypcdc(Map map);
	
	public List<PpaperTab> showPaperBytjjm(Map map);
	public int calPaperBytjjm(Map map);

}
