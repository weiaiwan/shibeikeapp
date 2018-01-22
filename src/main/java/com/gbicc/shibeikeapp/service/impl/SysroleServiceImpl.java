package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysRoleTabDao;
import com.gbicc.shibeikeapp.entity.SysRoleTab;
import com.gbicc.shibeikeapp.service.SysroleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service(value="sysroleService")
public class SysroleServiceImpl implements SysroleService {

	@Resource
	private SysRoleTabDao sysRoleTabDao;
	
	
	public void setSysRoleTabDao(SysRoleTabDao sysRoleTabDao) {
		this.sysRoleTabDao = sysRoleTabDao;
	}

	@Override
	public List<SysRoleTab> getAllRoleTabs() {
		return sysRoleTabDao.getAllRoleTabs();
	}

	@Override
	public void insertSysRole(SysRoleTab sysRoleTab) {
		sysRoleTabDao.insertSysRole(sysRoleTab);
	}

	@Override
	public void updeteSysRole(SysRoleTab sysRoleTab) {
		sysRoleTabDao.updeteSysRole(sysRoleTab);
	}

	@Override
	public void deleteSysRoleById(String id) {
		sysRoleTabDao.deleteSysRoleById(id);
	}

	@Override
	public SysRoleTab getSysRoleById(String id) {
		return sysRoleTabDao.getSysRoleById(id);
	}

	@Override
	public List<SysRoleTab> getRoleByMenuCode(String menuCode) {
		if (menuCode != null && !menuCode.equals("")) {
			menuCode = "%"+menuCode+"%";
		}
		return sysRoleTabDao.getRoleByMenuCode(menuCode);
	}

}
