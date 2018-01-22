package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.ExpertwareDao;
import com.gbicc.shibeikeapp.entity.ExpertwareTab;
import com.gbicc.shibeikeapp.service.ExpertwareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("expertwareService")
public class ExpertwareServiceImpl implements ExpertwareService {
	@Resource
	private ExpertwareDao expertwareDao;
	

	public ExpertwareDao getExpertwareDao() {
		return expertwareDao;
	}

	public void setExpertwareDao(ExpertwareDao expertwareDao) {
		this.expertwareDao = expertwareDao;
	}


	@Override
	public void AddLec(ExpertwareTab expertwareTab) {
		// TODO Auto-generated method stub
		expertwareDao.AddLec(expertwareTab);
	}

	@Override
	public List<ExpertwareTab> getLectById(String id) {
		// TODO Auto-generated method stub
		return expertwareDao.getLectById(id);
	}

	@Override
	public void delLec(String expertwareId) {
		// TODO Auto-generated method stub
		expertwareDao.delLec(expertwareId);
	}
	
	@Override
	public String getname(String expertwareUrl) {
		// TODO Auto-generated method stub
		return expertwareDao.getname(expertwareUrl);
	}


}
