package com.gbicc.shibeikeapp.entity;

import java.io.Serializable;

public class SysBM implements Serializable{
	//报名表信息
	private String id;
	private String name;
	private String tel;
	private String email;
	private String company;
	private String zhiwei;
	private String type;
	private String time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getZhiwei() {
		return zhiwei;
	}
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "SysBM [id=" + id + ", name=" + name + ", tel=" + tel + ", email=" + email + ", company=" + company
				+ ", zhiwei=" + zhiwei + ", type=" + type + ", time=" + time + "]";
	}
	


}
