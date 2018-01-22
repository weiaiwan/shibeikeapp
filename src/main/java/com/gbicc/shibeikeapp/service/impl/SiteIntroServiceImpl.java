package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SiteIntroTabDao;
import com.gbicc.shibeikeapp.entity.SiteIntroTab;
import com.gbicc.shibeikeapp.service.SiteIntroService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("siteIntroService")
public class SiteIntroServiceImpl implements SiteIntroService {

	@Resource
	private SiteIntroTabDao siteIntroTabDao;
	private List<SiteIntroTab> list;
	
	public SiteIntroTabDao getSiteIntroTabDao() {
		return siteIntroTabDao;
	}

	public void setSiteIntroTabDao(SiteIntroTabDao siteIntroTabDao) {
		this.siteIntroTabDao = siteIntroTabDao;
	}

	/**
	 * 添加网站介绍
	 */
	@Override
	public void inserSiteIntrol(SiteIntroTab siteIntrol) {
		// TODO Auto-generated method stub
		siteIntroTabDao.addSiteIntro(siteIntrol);
		
	}

	/**
	 * 显示历史记录
	 */
	@Override
	public List<SiteIntroTab> showAll() {
		// TODO Auto-generated method stub
		list = siteIntroTabDao.selectAll();
		return list;
	}

	/**
	 * 显示一条的详细内容
	 */
	@Override
	public SiteIntroTab selectOne(String id) {
		// TODO Auto-generated method stub
		return siteIntroTabDao.selectOneById(id);
		 
	}

	/**
	 * 修改历史记录中详情内部的一条数据
	 */
	@Override
	public void resetContent(SiteIntroTab introTab) {
		// TODO Auto-generated method stub
		siteIntroTabDao.updateContext(introTab);
	}

}
