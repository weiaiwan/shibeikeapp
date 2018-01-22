package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.sysLaiYuanDao;
import com.gbicc.shibeikeapp.entity.sysLaiYuan;
import com.gbicc.shibeikeapp.service.sysLaiYuanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sysLaiYuanService")
public class sysLaiYuanServiceImpl implements sysLaiYuanService {

	@Resource
	private sysLaiYuanDao dao;
	
	@Override
	public void insertLY(Map<String, String> map) {
		// TODO Auto-generated method stub
		dao.insertLY(map);
	}

	@Override
	public List<sysLaiYuan> selectLY(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.selectLY(map);
	}

	@Override
	public void deleteLY(Map<String, String> map) {
		// TODO Auto-generated method stub
		dao.deleteLY(map);
	}

	@Override
	public List<String> selectLYName() {
		// TODO Auto-generated method stub
		return dao.selectLYName();
	}

}
