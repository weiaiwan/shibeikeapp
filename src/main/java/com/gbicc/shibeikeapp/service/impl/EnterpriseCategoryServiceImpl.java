package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.EnterpriseCategoryDao;
import com.gbicc.shibeikeapp.entity.EnterpriseCategory;
import com.gbicc.shibeikeapp.service.EnterpriseCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 下属企业类别服务层实现类
 * @author Colin
 *
 */
@Service(value="enterpriseCategoryService")
public class EnterpriseCategoryServiceImpl implements EnterpriseCategoryService {
	@Resource
	private EnterpriseCategoryDao enterpriseCategoryDao;
	
	public void setEnterpriseCategoryDao(EnterpriseCategoryDao enterpriseCategoryDao) {
		this.enterpriseCategoryDao = enterpriseCategoryDao;
	}


	@Override
	public List<EnterpriseCategory> getAll() {
		return enterpriseCategoryDao.getAll();
	}

}
