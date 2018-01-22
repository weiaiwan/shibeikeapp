package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.EnterpriseCategory;

import java.util.List;


/**
 * 下属企业类别服务层接口
 * @author Colin
 *
 */
public interface EnterpriseCategoryService {
	/**
	 * 获得全部类别
	 * @return
	 */
	public List<EnterpriseCategory> getAll();
}
