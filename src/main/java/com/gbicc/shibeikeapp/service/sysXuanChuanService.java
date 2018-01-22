package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.sysXuanChuan;

import java.util.List;
import java.util.Map;


public interface sysXuanChuanService {
	List<sysXuanChuan> selectByName(Map<String, String> map);
	 int insertSelective(Map<String, String> map);
	 int updateByPrimaryKeySelective(Map<String, String> map);
	    int deleteByPrimaryKey(String xcId);
	    sysXuanChuan selectByPrimaryKey(String xcId);
}
