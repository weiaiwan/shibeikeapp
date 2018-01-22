package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SysMaterialTab;

import java.util.List;
import java.util.Map;


public interface SysMaterialService {
	/**
	 * 根据条件查询资料总数
	 * @param map
	 * @return
	 */
	public Integer getCount(Map<String, Object> map);
	/**
	 * 查询所有的资料
	 * @return
	 */
	public List<SysMaterialTab> getMaterial();

}
