package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.ExpertwareTab;

import java.util.List;


public interface ExpertwareService {
	public void AddLec(ExpertwareTab expertwareTab);
	public List<ExpertwareTab> getLectById(String id);
	public void delLec(String expertwareId);
	public String getname(String expertwareUrl);
}
