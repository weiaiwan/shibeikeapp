package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SiteIntroTab;

import java.util.List;


public interface SiteIntroService {

	/**
	 * 添加网站内容信息
	 * 
	 * @param siteIntrol
	 * @return
	 */
	public void inserSiteIntrol(SiteIntroTab siteIntrol);

	/**
	 * 显示历史记录
	 * 
	 * @return
	 */
	public List<SiteIntroTab> showAll();

	/**
	 * 显示一条的详情
	 * 
	 * @param id
	 * @return
	 */
	public SiteIntroTab selectOne(String id);

	/**
	 * 重新修一条具体的改历史记录(详情里)
	 * 
	 * @param introTab
	 */
	public void resetContent(SiteIntroTab introTab);

}
