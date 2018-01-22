package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ExpertwareTab;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("expertwareDao")
public interface ExpertwareDao {
	public void AddLec(ExpertwareTab expertwareTab);
	public List<ExpertwareTab> getLectById(String id);
	public void delLec(String expertwareId);
	
	public String getname(String expertwareUrl);
}
