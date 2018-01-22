package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.SysMenuTab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository(value="sysMenuDao")
public interface SysMenuDao {
	/**
	 * 根据角色ID获得资源，如果角色ID为空，则查询全部
	 * @param roleId
	 * @return
	 */
	public List<SysMenuTab> getMenuByRoleId(Map<String, Object> map);
	/**
	 * 添加一个资源
	 * @param menuTab
	 */
	public void insertMenu(SysMenuTab menuTab);
	/**
	 * 删除一个资源
	 * @param menuId
	 */
	public void deleteMenuById(String menuId);
	/**
	 * 修改一个资源
	 * @param menuTab
	 */
	public void updateMenu(SysMenuTab menuTab);
	/**
	 * 根据条件获得总数
	 * @param map
	 * @return
	 */
	public Integer getCount(Map<String, Object> map);
	/**
	 * 根据资源ID获得资源
	 * @param menuId
	 * @return
	 */
	public SysMenuTab getSysMenuById(String menuId);
	/**
	 * 获得所有级别为1的资源
	 * @return
	 */
	public List<SysMenuTab> getParentMenu(String roleIdss);
	/**
	 * 根据id查询子资源
	 * @return
	 */
	public List<SysMenuTab> getChildMenuById(String parent_id);
	/**
	 * 查询当前编号的数据条数
	 * @param code
	 * @return
	 */
	public Integer getCountByCode(String code);
	/**
	 * 根据编号获得资源
	 * @return
	 */
	public SysMenuTab getMenuByCode(String code);
	/**
	 * 根据角色获得获得资源
	 * @return
	 */
	public List<SysMenuTab> getMenuByRole(String roleId);
	/**
	 * 获得当前最大序号
	 * @return
	 */
	public Integer getMaxSorts();
	/**
	 * 获得所有的资源
	 * @return
	 */
	public List<SysMenuTab> getAll();
}
