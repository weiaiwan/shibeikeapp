

		package com.gbicc.shibeikeapp.entity;
		import java.util.*;
		/**
		 * 学习资料实体
		 * @author easyloan 
		 * @version 1.0
		 * @since 1.0
		 */

public class SysTrainMaterialTab implements java.io.Serializable{
	 /**
     * 学习资料ID       db_column: TRAINMATERIAL_ID 
     */	
	private String trainMaterialId;
    /**
     * 资料标题       db_column: MATERIAL_TITLE 
     */	
	private String trainMaterialTitle;
    /**
     * 发布时间       db_column: TRAINMATERIAL_TIME 
     */	
	private java.sql.Date trainMaterialTime;
	 /**
     * 上传学习资料的地址      db_column: TRAINMATERIAL_ID 
     */	
	private String trainMaterialUrl;
	/**
     * 保存时的文件名      db_column: MATERIAL_FILENAME
     */	
	private String fileName;
	
	
	public SysTrainMaterialTab(){}
	public SysTrainMaterialTab (  String trainMaterialId){
			this.trainMaterialId = trainMaterialId;
		}
	public String getTrainMaterialId() {
		return this.trainMaterialId;
	}
	public void setTrainMaterialId(String value) {
		this.trainMaterialId = value;
	}
	public String getTrainMaterialTitle() {
		return this.trainMaterialTitle;
	}
	public void setTrainMaterialTitle(String value) {
		this.trainMaterialTitle = value;
	}
	public String getTrainMaterialUrl() {
		return this.trainMaterialUrl;
	}
	public void setTrainMaterialUrl(String value) {
		this.trainMaterialUrl = value;
	}
	public java.sql.Date getTrainMaterialTime() {
		return this.trainMaterialTime;
	}
	public void setTrainMaterialTime(java.sql.Date value) {
		this.trainMaterialTime = value;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	

}