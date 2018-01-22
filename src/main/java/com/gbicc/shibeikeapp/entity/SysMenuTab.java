/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.entity;


import java.util.*;



/**
 * @author easyloan 
 * @version 1.0
 * @since 1.0
 */


public class SysMenuTab implements java.io.Serializable{
    /**
     * 菜单ID       db_column: MENU_ID 
     */	
	private String menuId;
    /**
     * 菜单名称       db_column: MENU_NAME 
     */	
	private String menuName;
    /**
     * 菜单路径       db_column: MENU_URL 
     */	
	private String menuUrl;
    /**
     * 菜单编号       db_column: MENU_CODE 
     */	
	private String menuCode;
	/**
	 * 级别表
	 */
	private String grade;
	/**
	 * 父类ID
	 */
	private String parent_id;
	/**
	 * 排序列
	 */
	private Integer sorts;
	//columns END

	public SysMenuTab(){
	}

	public SysMenuTab(
		String menuId
	){
		this.menuId = menuId;
	}

	public void setMenuId(String value) {
		this.menuId = value;
	}
	
	public String getMenuId() {
		return this.menuId;
	}
	public void setMenuName(String value) {
		this.menuName = value;
	}
	
	public String getMenuName() {
		return this.menuName;
	}
	public void setMenuUrl(String value) {
		this.menuUrl = value;
	}
	
	public String getMenuUrl() {
		return this.menuUrl;
	}
	public void setMenuCode(String value) {
		this.menuCode = value;
	}
	
	public String getMenuCode() {
		return this.menuCode;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public Integer getSorts() {
		return sorts;
	}

	public void setSorts(Integer sorts) {
		this.sorts = sorts;
	}
	
}

