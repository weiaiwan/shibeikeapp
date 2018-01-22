package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.SysPostTab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SysPostTabDao {
	/**
	 * 根据岗位ID获得岗位
	 * @param id岗位
	 * @return
	 */
	public SysPostTab getSysPostById(String id);
	/**
	 * 根据岗位ID删除岗位
	 * @param id
	 */
	public void deleteSysPostById(String id);
	/**
	 * 查询所偶的科室编号和处室名称
	 * @return
	 */
	public List<SysPostTab> getAllUnit(String unitName);
	/**
	 * 根据科室编号查询处室
	 * @return
	 */
	public List<SysPostTab> getAllSectionsByUnit(String unitCode);
	/**
	 * 根据条件获得岗位信息
	 * @return
	 */
	public List<SysPostTab> getPost(Map<String, Object> map);
	/**
	 * 获得处室信息
	 * @return
	 */
	public List<SysPostTab> getGroupSection();
	/**
	 * 根据单位编号获得总数
	 * @return
	 */
	public Integer getCountByUnitcode(String unidCode);
	/**
	 * 根据处室编号获得总数
	 * @return
	 */
	public Integer getCountBySectionscode(String sectionsCode);
	/**
	 * 添加单位
	 * @param sysPostTab
	 */
	public void addUnit(SysPostTab sysPostTab);
	/**
	 * 添加处室
	 * @param sysPostTab
	 */
	public void addSection(SysPostTab sysPostTab);
	/**
	 * 根据单位编号修改单位名称
	 * @param sysPostTab
	 */
	public void updateUnitByCode(SysPostTab sysPostTab);
	/**
	 * 修改处室名称，且postID不能为null
	 * @param sysPostTab
	 */
	public void updateSectionsByCode(SysPostTab sysPostTab);
	/**
	 * 根据单位编号删除所有单位岗位
	 */
	public void deleteUnitByCode(String unitCode);
	/**
	 * 根据id修改岗位名称和岗位描述，这个方法只修改岗位名称和岗位描述，
	 * @param sysPostTab 对象中只要三个参数，postId,postName,postDesc
	 */
	public void updatePostById(SysPostTab sysPostTab);
	/**
	 * 获得处室名称，返回的集合对象中只有sections_name有值
	 * @return
	 */
	public List<SysPostTab> getSectionsName();
	/**
	 * 根据unitcode查询
	 */
	public List<SysPostTab> findUintCode(String unitCode);
	/**
	 * 根据ID查询
	 */
	public SysPostTab findByPostId(String PostId);
	/**
	 * 根据单位名称和处室名称 获得岗位ID
	 * @param unitName
	 * @return
	 */
	public String getPostIdByUnitName(Map map);
	public String getPostIdByUnitName1(Map map);
	/**
	 * 根据用户获得岗位信息
	 * @param post
	 * @return
	 */
	public List<SysPostTab> getUP(String userId);
	/**
	 * 更新对应单位部门的考试成绩
	 */
	public void updateKsqk(SysPostTab sysPostTab);
}
