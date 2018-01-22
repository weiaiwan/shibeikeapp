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


public class SysRoleTab implements java.io.Serializable{
    /**
     * 角色ID       db_column: ROLE_ID 
     */	
	private String roleId;
    /**
     * 角色名称       db_column: ROLE_NAME 
     */	
	private String roleName;
    /**
     * 角色编号       db_column: ROLE_CODE 
     */	
	private String roleCode;
    /**
     * 资源ID       db_column: RESOURCES_ID 
     */	
	private String resourcesId;
	//columns END

	public SysRoleTab(){
	}

	public SysRoleTab(
		String roleId
	){
		this.roleId = roleId;
	}

	public void setRoleId(String value) {
		this.roleId = value;
	}
	
	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleName(String value) {
		this.roleName = value;
	}
	
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleCode(String value) {
		this.roleCode = value;
	}
	
	public String getRoleCode() {
		return this.roleCode;
	}
	public void setResourcesId(String value) {
		this.resourcesId = value;
	}
	
	public String getResourcesId() {
		return this.resourcesId;
	}
	
}

