package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysBuyDao;
import com.gbicc.shibeikeapp.entity.ChapterTab;
import com.gbicc.shibeikeapp.service.SysBuyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("sysBuyService")
public class SysBuyServiceImpl implements SysBuyService {

	@Resource
	private SysBuyDao dao;

	@Override
	public int getBuyCount(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.getBuyCount(map);
	}

	@Override
	public void insertBuy(Map<String, String> map) {
		// TODO Auto-generated method stub
		dao.insertBuy(map);
	}

	@Override
	public void deleteBuy(Map<String, String> map) {
		// TODO Auto-generated method stub
		dao.deleteBuy(map);
	}

	@Override
	public List<ChapterTab> getBuys(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.getBuys(map);
	}

	@Override
	public int getBuysCount(Map<String, String> map) {
		// TODO Auto-generated method stub
		return dao.getBuysCount(map);
	}
	
	
}
