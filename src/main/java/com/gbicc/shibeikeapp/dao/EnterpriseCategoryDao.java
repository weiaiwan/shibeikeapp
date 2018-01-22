package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.EnterpriseCategory;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 下属企业类别dao接口
 * @author Colin
 *
 */
@Repository(value="enterpriseCategoryDao")
public interface EnterpriseCategoryDao {
	/**
	 * 获得全部类别
	 * @return
	 */
	public List<EnterpriseCategory> getAll();
}
