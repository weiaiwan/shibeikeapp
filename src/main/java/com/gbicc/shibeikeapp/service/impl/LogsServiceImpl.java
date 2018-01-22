package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.LogsDao;
import com.gbicc.shibeikeapp.entity.Logs;
import com.gbicc.shibeikeapp.service.LogsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("logsService")
public class LogsServiceImpl implements LogsService {
	
	@Resource
	private LogsDao logsDao;
	
	public void setLogsDao(LogsDao logsDao) {
		this.logsDao = logsDao;
	}

	@Override
	public List<Logs> getLogs(Map<String, Object> map) {
		return logsDao.getLogs(map);
	}

	@Override
	public void addLog(Logs log) {
		logsDao.addLog(log);
	}

	@Override
	public Integer getCount(Map map) {
		return logsDao.getCount(map);
	}

}
