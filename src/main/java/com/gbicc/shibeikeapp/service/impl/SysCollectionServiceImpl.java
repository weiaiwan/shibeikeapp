package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysCollectionDao;
import com.gbicc.shibeikeapp.entity.ChapterTab;
import com.gbicc.shibeikeapp.service.SysCollectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("sysCollectionService")
public class SysCollectionServiceImpl implements SysCollectionService {

	@Resource
	private SysCollectionDao sysCollectionDao;
	@Override
	public int getCollectionCount(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sysCollectionDao.getCollectionCount(map);
	}

	@Override
	public void insertCollection(Map<String, String> map) {
		// TODO Auto-generated method stub
		sysCollectionDao.insertCollection(map);
	}

	@Override
	public void deleteCollection(Map<String, String> map) {
		// TODO Auto-generated method stub
		sysCollectionDao.deleteCollection(map);
	}

	@Override
	public List<ChapterTab> getCollections(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sysCollectionDao.getCollections(map);
	}

	@Override
	public int getCollectionsCount(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sysCollectionDao.getCollectionCount(map);
	}

}
