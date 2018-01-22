package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.WebIntroduceDao;
import com.gbicc.shibeikeapp.entity.WebIntroduce;
import com.gbicc.shibeikeapp.service.WebIntroduceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value="webIntroduce")
public class WebIntroduceServiceImpl implements WebIntroduceService {
	@Resource
	private WebIntroduceDao webIntroduceDao;
	@Override
	public WebIntroduce getIntroduce() {
		 
		return webIntroduceDao.getIntroduce();
	}

	@Override
	public void updateIntroduce(WebIntroduce webIntroduce) {
		webIntroduceDao.updateIntroduce(webIntroduce);
		
	}

	@Override
	public Integer getCount() {
		 
		return webIntroduceDao.getCount();
	}

	@Override
	public void insertIntroduce(WebIntroduce webIntroduce) {
		webIntroduceDao.insertIntroduce(webIntroduce);
		
	}

	@Override
	public List<WebIntroduce> getAllIntroduce() {
		return webIntroduceDao.getAllIntroduce();
	}

	@Override
	public Integer getId() {
		return webIntroduceDao.getId();
	}

	@Override
	public WebIntroduce getIntroduceById(String id) {
		return webIntroduceDao.getIntroduceById(id);
	}

	@Override
	public List<WebIntroduce> getIntroduceByPage(Map<String, Object> map) {
		return webIntroduceDao.getIntroduceByPage(map);
	}

}
