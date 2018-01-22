package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysTrainMaterialTabDao;
import com.gbicc.shibeikeapp.entity.SysTrainMaterialTab;
import com.gbicc.shibeikeapp.service.SysTrainMaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service(value="systrainMaterialService")
public class SystrainMaterialServiceImpl implements SysTrainMaterialService {
	@Resource
	private SysTrainMaterialTabDao sysTrainMaterialTabDao;
	@Override
	public Integer getCount() {
		return sysTrainMaterialTabDao.getCount();
	}

	@Override
	public List<SysTrainMaterialTab> getMaterial() {
		return sysTrainMaterialTabDao.getMaterial();
	}

	@Override
	public String getUrlByTrainMaterialId(String trainMaterialId) {
		 
		return sysTrainMaterialTabDao.getUrlByTrainMaterialId(trainMaterialId);
	}

	@Override
	public String getFileNameByTrainMaterialId(String trainMaterialId) {
		 
		return sysTrainMaterialTabDao.getFileNameByTrainMaterialId(trainMaterialId);
	}

}
