package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.DistributionAuthDao;
import com.gbicc.shibeikeapp.entity.DistributionAuth;
import com.gbicc.shibeikeapp.service.DistrbutionAuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service( value="distrbutionAuthService")
public class DistrbutionAuthServiceImpl implements DistrbutionAuthService {
	@Resource
	DistributionAuthDao distributionAuthDao;

	public void setDistributionAuthDao(DistributionAuthDao distributionAuthDao) {
		this.distributionAuthDao = distributionAuthDao;
	}

	@Override
	public List<DistributionAuth> getDAuthByUserID(String userId) {
		return distributionAuthDao.getDAuthByUserID(userId);
	}

	@Override
	public void deleteDAuthByUserID(String userId) {
		distributionAuthDao.deleteDAuthByUserID(userId);
	}

	@Override
	public void addDAuth(DistributionAuth dAuth) {
		distributionAuthDao.addDAuth(dAuth);
	}

}
