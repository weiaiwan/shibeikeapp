package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.Indicator;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("indicatorDao")
public interface IndicatorDao {
	public List<Indicator> getAllIndex();
}
