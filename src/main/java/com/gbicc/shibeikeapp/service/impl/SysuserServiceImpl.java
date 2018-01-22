/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysUserTabDao;
import com.gbicc.shibeikeapp.entity.SysPostTab;
import com.gbicc.shibeikeapp.entity.SysUserTab;
import com.gbicc.shibeikeapp.service.SysuserService;
import com.gbicc.shibeikeapp.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * @author easyloan 
 * @version 1.0
 * @since 1.0
 */

@Service(value="sysuserService")
public class SysuserServiceImpl implements SysuserService {

	/**增加@Resource注解,spring就可以通过autowire自动设置对象属性,请注意大小写*/
	@Resource
	private SysUserTabDao sysUserTabDao;

	public void setSysUserTabDao(SysUserTabDao sysUserTabDao) {
		this.sysUserTabDao = sysUserTabDao;
	}

	@Override
	public void insertSysUser(SysUserTab sysUserTab) {
		if (sysUserTab != null) {
			sysUserTab.setUserPass(MD5Util.getMD5("123456"));
		}
		Integer sort = sysUserTabDao.getMaxSorting() + 1;
		sysUserTab.setSorting(sort.toString());
		sysUserTabDao.insertSysUser(sysUserTab);
	}

	@Override
	public void updateSysUser(SysUserTab sysUserTab) {
		sysUserTabDao.updateSysUser(sysUserTab);
	}

	@Override
	public void deleteSysUser(String id) {
		sysUserTabDao.deleteSysUser(id);
	}

	@Override
	public List<SysUserTab> getSysUser(Map<String, Object> map) {
		return sysUserTabDao.getSysUser(map);
	}

	@Override
	public SysUserTab getSysUserById(String id) {
		return sysUserTabDao.getSysUserById(id);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		
		return sysUserTabDao.getCount(map);
	}

	@Override
	public SysUserTab login(SysUserTab sysUserTab) {
		return sysUserTabDao.login(sysUserTab);
	}

	@Override
	public void updatePwd(SysUserTab sysUserTab) {
		sysUserTabDao.reSetPwd(sysUserTab);
	}

	@Override
	public List<SysUserTab> getUserByPost(SysPostTab post) {
		return sysUserTabDao.getUserByPost(post);
	}

	@Override
	public void updaateSortingByEdit(Integer sorting) {
		sysUserTabDao.updaateSortingByEdit(sorting);
	}

	@Override
	public void updaateSortingByDel(Integer sorting) {
		sysUserTabDao.updaateSortingByDel(sorting);
	}

	@Override
	public void updateSession(SysUserTab sysUserTab) {
		// TODO Auto-generated method stub
		sysUserTabDao.updateSession(sysUserTab);
	}

	@Override
	public void updateSession1(String id) {
		// TODO Auto-generated method stub
		sysUserTabDao.updateSession1(id);
	}

	@Override
	public List<SysUserTab> getUserNP(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return sysUserTabDao.getUserNP(map);
	}

	@Override
	public SysUserTab selectloginName(String loginName) {
		// TODO Auto-generated method stub
		return sysUserTabDao.selectloginName(loginName);
	}

	@Override
	public void updateWrongCount(SysUserTab sysUserTab) {
		// TODO Auto-generated method stub
		sysUserTabDao.updateWrongCount(sysUserTab);
	}

	@Override
	public void updateWrongCount0(SysUserTab sysUserTab) {
		// TODO Auto-generated method stub
		sysUserTabDao.updateWrongCount0(sysUserTab);
	}

	@Override
	public Integer getUserLoginName(String loginName) {
		// TODO Auto-generated method stub
		return sysUserTabDao.getUserLoginName(loginName);
	}

	@Override
	public void insertSysUser2(SysUserTab sysUserTab) {
		// TODO Auto-generated method stub
		Integer sort = sysUserTabDao.getMaxSorting() + 1;
		sysUserTab.setSorting(sort.toString());
		sysUserTabDao.insertSysUser(sysUserTab);
	}
	
}
