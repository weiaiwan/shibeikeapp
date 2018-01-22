package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.PpaperTab;

import java.util.List;
import java.util.Map;


public interface PaperCenterDao {
	public List<String> showPaperType();
	public List<Integer> calPaperType();
	public List<String> showPaperLevel(String paperType);
	public List<Integer> calPaperLevel(String paperType);
	public List<PpaperTab> showPaper(Map map);
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
