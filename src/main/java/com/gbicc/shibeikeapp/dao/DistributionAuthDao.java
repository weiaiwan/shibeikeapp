package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.DistributionAuth;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value="distributionAuthDao")
public interface DistributionAuthDao {
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
