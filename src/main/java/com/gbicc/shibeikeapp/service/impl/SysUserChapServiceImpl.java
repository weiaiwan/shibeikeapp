package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysUserChapDao;
import com.gbicc.shibeikeapp.entity.SysUserChap;
import com.gbicc.shibeikeapp.service.SysUserChapService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;


@Service("sysUserChapService")
public class SysUserChapServiceImpl implements SysUserChapService {
	@Resource
	private SysUserChapDao sysUserChapDao;

	public SysUserChapDao getSysUserChapDao() {
		return sysUserChapDao;
	}

	public void setSysUserChapDao(SysUserChapDao sysUserChapDao) {
		this.sysUserChapDao = sysUserChapDao;
	}

	@Override
	public void addUserChap(SysUserChap userChap) {
		sysUserChapDao.addUserChap(userChap);
	}

	@Override
	public SysUserChap getChapUser(Map map) {
		// TODO Auto-generated method stub
		return sysUserChapDao.getChapUser(map);
	}

	@Override
	public void updateUserChap(SysUserChap userChap) {
		// TODO Auto-generated method stub
		sysUserChapDao.updateUserChap(userChap);
	}
	
}
