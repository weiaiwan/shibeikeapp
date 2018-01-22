package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysMenuDao;
import com.gbicc.shibeikeapp.entity.SysMenuTab;
import com.gbicc.shibeikeapp.service.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
	@Resource
	public SysMenuDao sysMenuDao;

	public void setSysMenuDao(SysMenuDao sysMenuDao) {
		this.sysMenuDao = sysMenuDao;
	}

	@Override
	public List<SysMenuTab> getMenuByRoleId(Map<String, Object> map) {
		return sysMenuDao.getMenuByRoleId(map);
	}

	@Override
	public void insertMenu(SysMenuTab menuTab) {
		Integer max = sysMenuDao.getMaxSorts();
		if (max == null) {
			max = 0;
		}
		max ++;
		menuTab.setSorts(max);
		sysMenuDao.insertMenu(menuTab);
	}

	@Override
	public void deleteMenuById(String menuId) {
		sysMenuDao.deleteMenuById(menuId);
	}

	@Override
	public void updateMenu(SysMenuTab menuTab) {
		sysMenuDao.updateMenu(menuTab);
	}

	@Override
	public Integer getCount(Map<String, Object> map) {
		return sysMenuDao.getCount(map);
	}

	@Override
	public SysMenuTab getSysMenuById(String menuId) {
		return sysMenuDao.getSysMenuById(menuId);
	}

	@Override
	public List<SysMenuTab> getParentMenu(String roleId) {
		return sysMenuDao.getParentMenu(roleId);
	}

	@Override
	public List<SysMenuTab> getChildMenuById(String parent_id) {
		return sysMenuDao.getChildMenuById(parent_id);
	}

	@Override
	public boolean exitsCode(String code) {
		Integer isExits = sysMenuDao.getCountByCode(code);
		if (isExits == null) {
			return true;
		}
		if (isExits > 0) {
			return false;
		}
		return true;
	}

	@Override
	public SysMenuTab getMenuByCode(String code) {
		return sysMenuDao.getMenuByCode(code);
	}

	@Override
	public List<SysMenuTab> getMenuByRole(String roleId) {
		return sysMenuDao.getMenuByRole(roleId);
	}

	@Override
	public List<SysMenuTab> getAll() {
		return sysMenuDao.getAll();
	}
	
}
