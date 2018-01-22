/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SysRoleTab;

import java.util.List;


/**
 * @author chaiyalong 
 * @version 1.0
 * @since 1.0
 */

public interface SysroleService{
	/**
	 * 获得全部角色信息
	 * @return
	 */
	public List<SysRoleTab> getAllRoleTabs();
	/**
	 * 添加一个角色信息
	 * @param sysRoleTab
	 */
	public void insertSysRole(SysRoleTab sysRoleTab);
	/**
	 * 修改一个角色信息
	 * @param sysRoleTab
	 */
	public void updeteSysRole(SysRoleTab sysRoleTab);
	/**
	 * 根据角色ID删除角色
	 * @param id
	 */
	public void deleteSysRoleById(String id);
	/**
	 * 根据角色ID获得角色信息
	 * @param id
	 */
	public SysRoleTab getSysRoleById(String id);
	/**
	 * 查询包含资源编号的角色
	 * @param menuCode
	 * @return
	 */
	public List<SysRoleTab> getRoleByMenuCode(String menuCode);
	
}
