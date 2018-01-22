/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SysPostTab;
import com.gbicc.shibeikeapp.entity.SysUserTab;

import java.util.List;
import java.util.Map;


/**
 * @author chaiyalong 
 * @version 1.0
 * @since 1.0
 */

public interface SysuserService{
	/**
	 * 添加一个用户
	 * @param sysUserTab
	 */
	public void insertSysUser(SysUserTab sysUserTab);
	public void insertSysUser2(SysUserTab sysUserTab);
	/**
	 * 修改用户信息
	 * @param sysUserTab
	 */
	public void updateSysUser(SysUserTab sysUserTab);
	/**
	 * 根据ID删除用户
	 * @param id
	 */
	public void deleteSysUser(String id);
	/**
	 * 根据条件获得用户信息
	 * @param map
	 * @return
	 */
	public List<SysUserTab> getSysUser(Map<String, Object> map);
	/**
	 * 根据用户ID获得用户信息
	 * @param id
	 * @return
	 */
	public SysUserTab getSysUserById(String id);
	/**
	 * 根据条件查询用户总数
	 * @param map
	 * @return
	 */
	public Integer getCount(Map<String, Object> map);
	/**
	 * 登陆
	 * @param sysUserTab
	 * @return
	 */
	public SysUserTab login(SysUserTab sysUserTab);
	/**
	 * 重置密码
	 * @param sysUserTab 参数内必须封装两个参数   userid 和 userPass
	 */
	public void updatePwd(SysUserTab sysUserTab);
	/**
	 * 根据岗位获得用户信息
	 * @param post 可封装（单位编号、处室编号、岗位编号）
	 * @return 返回 用户ID和用户Name
	 */
	public List<SysUserTab> getUserByPost(SysPostTab post);
	/**
	 * 根据序号将大于等于序号的用户序号加1
	 * @param sorting
	 */
	public void updaateSortingByEdit(Integer sorting);
	/**
	 * 根据序号将大于等于序号的用户序号减1
	 * @param sorting
	 */
	public void updaateSortingByDel(Integer sorting);
	/**
	 * 登录时更新用户的sessionId
	 */
	public void updateSession(SysUserTab sysUserTab);
	/**
	 *退出时更新用户的sessionId为""
	 */
	public void updateSession1(String id);
	 /**
     * 获得user的姓名和职务
     */
	public List<SysUserTab> getUserNP(Map<String, Object> map);
	/**
	 * 判断用户名是否存在
	 */
	public SysUserTab selectloginName(String loginName);
	/**
	 * 将错误次数加1
	 */
	public void updateWrongCount(SysUserTab sysUserTab);
	/**
	 * 将错误次数变为0
	 */
	public void updateWrongCount0(SysUserTab sysUserTab);
	
	/**
	 * 查询该用户名是否已经存在
	 */
	public Integer getUserLoginName(String loginName);
}
