package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.SysBM;

import java.util.List;
import java.util.Map;


public interface SysBMDao {
	//报名
	public void InsertSysBM(Map<String, Object> map);
	//根据姓名查看详细信息
	public List<SysBM> getFengHuiBaoMing(Map<String, Object> map);

}
