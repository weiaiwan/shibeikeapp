package com.gbicc.shibeikeapp.entity;
import java.util.List;


public class TrObj {
	private int rowInd;
	private List<TdObj> tds;

	public int getRowInd() {
		return rowInd;
	}

	public void setRowInd(int rowInd) {
		this.rowInd = rowInd;
	}

	public List<TdObj> getTds() {
		return tds;
	}

	public void setTds(List<TdObj> tds) {
		this.tds = tds;
	}
}
