package com.gbicc.shibeikeapp.service.impl;


import com.gbicc.shibeikeapp.dao.SysBMDao;
import com.gbicc.shibeikeapp.entity.SysBM;
import com.gbicc.shibeikeapp.service.SysBMService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class SysBMServiceImpl implements SysBMService {
	@Resource
	private SysBMDao dao;

	@Override
	public void InsertSysBM(Map<String,Object> map) {
		 dao.InsertSysBM(map);
	}

	@Override
	public List<SysBM> getFengHuiBaoMing(Map<String, Object> map) {
		return dao.getFengHuiBaoMing(map);
	}

}
