package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.sysXuanChuanDao;
import com.gbicc.shibeikeapp.entity.sysXuanChuan;
import com.gbicc.shibeikeapp.service.sysXuanChuanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value="sysXuanChuanService")
public class sysXuanChuanServiceImpl implements sysXuanChuanService {
	@Resource
	private sysXuanChuanDao dao;
	
	@Override
	public List<sysXuanChuan> selectByName(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.selectByName(map);
	}

	@Override
	public int insertSelective(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.insertSelective(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(map);
	}

	@Override
	public int deleteByPrimaryKey(String xcId) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(xcId);
	}

	@Override
	public sysXuanChuan selectByPrimaryKey(String xcId) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(xcId);
	}

}
