package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.sysLaiYuan;

import java.util.List;
import java.util.Map;


public interface sysLaiYuanDao {
	public void insertLY(Map<String, String> map);
	public List<sysLaiYuan> selectLY(Map<String, String> map);
	public void deleteLY(Map<String, String> map);
	public List<String> selectLYName();
}
