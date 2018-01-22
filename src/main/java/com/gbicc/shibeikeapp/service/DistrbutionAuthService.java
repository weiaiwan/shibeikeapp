package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.DistributionAuth;

import java.util.List;


public interface DistrbutionAuthService {
	/**
	 * 根据用户ID获得分管部门
	 * @return
	 */
	public List<DistributionAuth> getDAuthByUserID(String userId);
	/***
	 * 根据用户ID删除分管部门
	 * @param userId
	 */
	public void deleteDAuthByUserID(String userId);
	/**
	 * 添加分管部门
	 * @param dAuth
	 */
	public void addDAuth(DistributionAuth dAuth);
}
