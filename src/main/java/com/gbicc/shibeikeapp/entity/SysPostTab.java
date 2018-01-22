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


public class SysPostTab implements java.io.Serializable{
    /**
     * 岗位ID       db_column: POST_ID 
     */	
	private String postId;
    /**
     * 岗位名称       db_column: POST_NAME 
     */	
	private String postName;
    /**
     * 单位编号       db_column: UNIT_CODE 
     */	
	private String unitCode;
    /**
     * 单位名称       db_column: UNIT_NAME 
     */	
	private String unitName;
    /**
     * 部门编号       db_column: DEPT_CODE 
     */	
	private String deptCode;
    /**
     * 部门名称       db_column: DEPT_NAME 
     */	
	private String deptName;
    /**
     * 岗位编号       db_column: POST_CODE 
     */	
	private String postCode;
	/**
	 * 处室名称   db_column: SECTIONS_NAME
	 */
	private String sections_name;
	/**
	 * 处室编号   db_column: SECTIONS_CODE
	 */
	private String sections_code;
	/**
	 * 是否是统计局，1是市，2是乡，3是县 
	 */
	private String cityBureau;
	/**
	 *实有人数
	 */
	private String actualNum;
	/**
	 *参考人数
	 */
	private String joinNum;
	/**
	 * 优秀率
	 */
	private String niceRate;
	/**
	 * 良好率
	 */
	private String goodRate;
	
	//columns END

	public SysPostTab(){
	}

	public SysPostTab(
		String postId
	){
		this.postId = postId;
	}
	


	public String getActualNum() {
		return actualNum;
	}

	public void setActualNum(String actualNum) {
		this.actualNum = actualNum;
	}

	public String getJoinNum() {
		return joinNum;
	}

	public void setJoinNum(String joinNum) {
		this.joinNum = joinNum;
	}

	public String getNiceRate() {
		return niceRate;
	}

	public void setNiceRate(String niceRate) {
		this.niceRate = niceRate;
	}

	public String getGoodRate() {
		return goodRate;
	}

	public void setGoodRate(String goodRate) {
		this.goodRate = goodRate;
	}

	public void setPostId(String value) {
		this.postId = value;
	}
	
	public String getPostId() {
		return this.postId;
	}
	public void setPostName(String value) {
		this.postName = value;
	}
	
	public String getSections_name() {
		return sections_name;
	}

	public void setSections_name(String sections_name) {
		this.sections_name = sections_name;
	}

	public String getSections_code() {
		return sections_code;
	}

	public void setSections_code(String sections_code) {
		this.sections_code = sections_code;
	}

	public String getPostName() {
		return this.postName;
	}
	public void setUnitCode(String value) {
		this.unitCode = value;
	}
	
	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitName(String value) {
		this.unitName = value;
	}
	
	public String getUnitName() {
		return this.unitName;
	}
	public void setDeptCode(String value) {
		this.deptCode = value;
	}
	
	public String getDeptCode() {
		return this.deptCode;
	}
	public void setDeptName(String value) {
		this.deptName = value;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	public void setPostCode(String value) {
		this.postCode = value;
	}
	public String getPostCode() {
		return this.postCode;
	}

	public String getCityBureau() {
		return cityBureau;
	}

	public void setCityBureau(String cityBureau) {
		this.cityBureau = cityBureau;
	}
	
	
	
}

