package com.gbicc.shibeikeapp.entity;

public class Indicator {
	/**
	 * 指标Id
	 */
	private int id;
	/**
	 * 父级ID
	 */
	private int pid;
	/**
	 * 等级
	 */
	private int indexLevel;
	/**
	 * 指标名称
	 */
	private String name;
	/**
	 * 指标解释
	 */
	private String explain;
	/**
	 * 涉及处室
	 */
	private String attribution;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getIndexLevel() {
		return indexLevel;
	}
	public void setIndexLevel(int indexLevel) {
		this.indexLevel = indexLevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	
}
