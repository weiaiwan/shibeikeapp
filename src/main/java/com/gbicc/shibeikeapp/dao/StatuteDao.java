package com.gbicc.shibeikeapp.dao;


import com.gbicc.shibeikeapp.entity.Statute;

import java.util.List;


public interface StatuteDao {
	/**
	 * 查询法律法规
	 * @param
	 * @return
	 */
	public List<Statute> getStaDesc();
	/**
	 * 更新内容
	 * @return
	 */
	public void updateSta(Statute sta);
	/**
	 * 插入内容
	 * @return
	 */
	public void insertSta(Statute sta);
}
