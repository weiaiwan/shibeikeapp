package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.SiteIntroTab;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("siteIntroTabDao")
public interface SiteIntroTabDao {

	/**
	 * 添加网站介绍
	 * 
	 * @param siteIntroTab
	 */
	public void addSiteIntro(SiteIntroTab siteIntroTab);

	/**
	 * 查询（历史记录）所有网站介绍内容
	 * 
	 * @return
	 */
	public List<SiteIntroTab> selectAll();

	/**
	 * 根据id查询一条数据
	 * 
	 * @param id
	 * @return
	 */
	public SiteIntroTab selectOneById(String id);

	/**
	 * 修改数据的内容
	 * 
	 * @param introTab
	 */
	public void updateContext(SiteIntroTab introTab);

}
