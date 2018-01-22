package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysMaterialTabDao;
import com.gbicc.shibeikeapp.entity.SysMaterialTab;
import com.gbicc.shibeikeapp.service.SysMaterialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="sysmaterialService")
public class SysMaterialServiceImpl implements SysMaterialService {
	@Resource
	private SysMaterialTabDao sysMaterialTabDao;
	@Override
	public Integer getCount(Map<String, Object> map) {
	 
		return sysMaterialTabDao.getCount(map);
	}

	@Override
	public List<SysMaterialTab> getMaterial() {
		 
		return sysMaterialTabDao.getMaterial();
	}

}
