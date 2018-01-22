package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.IndicatorDao;
import com.gbicc.shibeikeapp.entity.Indicator;
import com.gbicc.shibeikeapp.service.IndicatorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="indicatorService")
public class IndicatorServiceImpl implements IndicatorService {

	@Resource
	private IndicatorDao indicatorDao;

	@Override
	public List<Indicator> getAllIndex() {
		// TODO Auto-generated method stub
		return indicatorDao.getAllIndex();
	}

}
