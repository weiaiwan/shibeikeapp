package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ChapterTab;

import java.util.List;
import java.util.Map;


public interface SysBuyDao {
	public int getBuyCount(Map<String, String> map);
	public void insertBuy(Map<String, String> map);
	public void deleteBuy(Map<String, String> map);
	public List<ChapterTab> getBuys(Map<String, String> map);
	public int getBuysCount(Map<String, String> map);
}
