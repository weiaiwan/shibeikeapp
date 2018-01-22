package com.gbicc.shibeikeapp.entity;

import java.util.List;

public class TableObj {
	private List<String> id;
	private String title;
	private String exc_title;
	private List<TrObj> trs;
	public List<String> getId() {
		return id;
	}
	public void setId(List<String> id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExc_title() {
		return exc_title;
	}
	public void setExc_title(String excTitle) {
		exc_title = excTitle;
	}
	public List<TrObj> getTrs() {
		return trs;
	}
	public void setTrs(List<TrObj> trs) {
		this.trs = trs;
	}

	
}
