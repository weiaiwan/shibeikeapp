package com.gbicc.shibeikeapp.entity;

public class ChapterType implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4704374235051896758L;
	/**
	 * 课程类型表Id
	 */
	private String typeId;
	/**
	 * 类型名称
	 */
	private String typeName;
	/**
	 * 类型列
	 */
	private String typeColumn;
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeColumn() {
		return typeColumn;
	}
	public void setTypeColumn(String typeColumn) {
		this.typeColumn = typeColumn;
	}
	
}
