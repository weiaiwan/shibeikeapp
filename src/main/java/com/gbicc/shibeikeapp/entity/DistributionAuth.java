package com.gbicc.shibeikeapp.entity;

import java.io.Serializable;
/**
 * 用户分管权限表
 * @author Colin
 *
 */
public class DistributionAuth implements Serializable {
	/**
	 * id，主键
	 */
	private String da_id;
	/**
     * 用户ID       db_column: userId 
     */	
	private String userId;
	/**
	 * 处室编号		db_column: sections_code;
	 */
	private String sections_code;
	/**
	 * 处室名称		db_column: sections_name
	 */
	private String sectionName;
	//column is end
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSections_code() {
		return sections_code;
	}
	public void setSections_code(String sections_code) {
		this.sections_code = sections_code;
	}
	
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getDa_id() {
		return da_id;
	}
	public void setDa_id(String da_id) {
		this.da_id = da_id;
	}
	
	
}
