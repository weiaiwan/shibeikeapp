package com.gbicc.shibeikeapp.dao;


import com.gbicc.shibeikeapp.entity.WebIntroduce;

import java.util.List;
import java.util.Map;


public interface WebIntroduceDao {
	/**
	 * 查看网站内容
	 * @param
	 * @return
	 */
	public WebIntroduce getIntroduce();
	/**
	 * 返回记录条数
	 * @return
	 */
	public Integer getCount();
	/**
	 * 插入数据
	 * @return
	 */
	public void insertIntroduce(WebIntroduce webIntroduce);
	/**
	 * 更新网站介绍内容
	 * @return
	 */
	public void updateIntroduce(WebIntroduce webIntroduce);
	/**
	 * 查询所有记录
	 * @param
	 * @return
	 */
	public List<WebIntroduce> getAllIntroduce();
	/**
	 * 获得序列号
	 */
	public Integer getId();
	/**
	 * 
	 */
	public WebIntroduce getIntroduceById(String id);
	/**
	 * 分页查询
	 */
	public List<WebIntroduce> getIntroduceByPage(Map<String, Object> map);
}
