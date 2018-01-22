

		package com.gbicc.shibeikeapp.entity;
		import java.util.*;
		/**
		 * @author easyloan 
		 * @version 1.0
		 * @since 1.0
		 */

public class SysMaterialTab implements java.io.Serializable{
	 /**
     * 学习资料ID       db_column: MATERIAL_ID 
     */	
	private String materialId;
    /**
     * 资料标题       db_column: MATERIAL_TITLE 
     */	
	private String materialTitle;
    /**
     * 发布时间       db_column: MATERIAL_TIME 
     */	
	private java.sql.Date materialTime;
	 /**
     * 上传学习资料的地址      db_column: MATERIAL_ID 
     */	
	private String materialUrl;
	
	
	public SysMaterialTab(){}
	public SysMaterialTab (  String materialId){
			this.materialId = materialId;
		}
	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String value) {
		this.materialId = value;
	}
	public String getMaterialTitle() {
		return this.materialTitle;
	}
	public void setMaterialTitle(String value) {
		this.materialTitle = value;
	}
	public String getMaterialUrl() {
		return this.materialUrl;
	}
	public void setMaterialUrl(String value) {
		this.materialUrl = value;
	}
	public java.sql.Date getMaterialTime() {
		return this.materialTime;
	}
	public void setMaterialTime(java.sql.Date value) {
		this.materialTime = value;
	}
	
	
	
	

}