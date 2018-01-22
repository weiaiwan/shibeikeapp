package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.Logs;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;




@Repository("logsDao")
public interface LogsDao {
	/**
	 * 按条件查询日志
	 * @param map中参数
	 * startNum起始条数（必须），endNum终止条数（必须），startTime起始时间（可选），endTime截止时间（可选）
	 * @return
	 */
	public List<Logs> getLogs(Map<String, Object> map);
	/**
	 * 添加日志
	 * @param log
	 */
	public void addLog(Logs log);
	/**
	 * 根据条件获得查询总数
	 * @param map
	 * @return
	 */
	public Integer getCount(Map map);
}
