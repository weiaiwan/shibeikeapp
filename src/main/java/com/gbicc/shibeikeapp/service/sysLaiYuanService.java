package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.sysLaiYuan;

import java.util.List;
import java.util.Map;


public interface sysLaiYuanService {
	public void insertLY(Map<String, String> map);
	public List<sysLaiYuan> selectLY(Map<String, String> map);
	public void deleteLY(Map<String, String> map);
	public List<String> selectLYName();
}
