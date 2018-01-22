package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ChapterTab;

import java.util.List;
import java.util.Map;


public interface SysCollectionDao {
	public int getCollectionCount(Map<String, String> map);
	public void insertCollection(Map<String, String> map);
	public void deleteCollection(Map<String, String> map);
	public List<ChapterTab> getCollections(Map<String, String> map);
	public int getCollectionsCount(Map<String, String> map);
}
