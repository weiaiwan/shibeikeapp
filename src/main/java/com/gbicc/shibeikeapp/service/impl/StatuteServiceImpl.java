package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.StatuteDao;
import com.gbicc.shibeikeapp.entity.Statute;
import com.gbicc.shibeikeapp.service.StatuteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service(value="statute")
public class StatuteServiceImpl implements StatuteService {
	@Resource
	private StatuteDao statuteDao;

	@Override
	public List<Statute> getStaDesc() {
		// TODO Auto-generated method stub
		return statuteDao.getStaDesc();
	}
	@Override
	public void updateSta(Statute sta) {
		// TODO Auto-generated method stub
		statuteDao.updateSta(sta);
	}
	@Override
	public void insertSta(Statute sta) {
		// TODO Auto-generated method stub
		statuteDao.insertSta(sta);
	}
	
}
