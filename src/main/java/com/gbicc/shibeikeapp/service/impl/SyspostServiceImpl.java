package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SysPostTabDao;
import com.gbicc.shibeikeapp.entity.SysPostTab;
import com.gbicc.shibeikeapp.service.SyspostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value="syspostService")
public  class SyspostServiceImpl implements SyspostService {

	@Resource
	private SysPostTabDao sysPostTabDao;
	
	public void setSysPostTabDao(SysPostTabDao sysPostTabDao) {
		this.sysPostTabDao = sysPostTabDao;
	}

	@Override
	public SysPostTab getSysPostById(String id) {
		return sysPostTabDao.getSysPostById(id);
	}

	@Override
	public void deleteSysPostById(String id) {
		sysPostTabDao.deleteSysPostById(id);
	}

	@Override
	public List<SysPostTab> getAllUnit(String unitName) {
		return sysPostTabDao.getAllUnit(unitName);
	}

	@Override
	public List<SysPostTab> getPost(Map<String, Object> map) {
		return sysPostTabDao.getPost(map);
	}

	@Override
	public List<SysPostTab> getAllSectionsByUnit(String unitCode) {
		return sysPostTabDao.getAllSectionsByUnit(unitCode);
	}

	@Override
	public List<SysPostTab> getGroupSection() {
		return sysPostTabDao.getGroupSection();
	}

	@Override
	public Integer getCountByUnitcode(String unidCode) {
		return sysPostTabDao.getCountByUnitcode(unidCode);
	}

	@Override
	public Integer getCountBySectionscode(String sectionsCode) {
		return sysPostTabDao.getCountBySectionscode(sectionsCode);
	}

	@Override
	public void addUnit(SysPostTab sysPostTab) {
		sysPostTabDao.addUnit(sysPostTab);
	}

	@Override
	public void addSection(SysPostTab sysPostTab) {
		sysPostTabDao.addSection(sysPostTab);
	}

	@Override
	public void updateUnitByCode(SysPostTab sysPostTab) {
		sysPostTabDao.updateUnitByCode(sysPostTab);
	}

	@Override
	public void updateSectionsByCode(SysPostTab sysPostTab) {
		sysPostTabDao.updateSectionsByCode(sysPostTab);
	}

	@Override
	public void deleteUnitByCode(String unitCode) {
		sysPostTabDao.deleteUnitByCode(unitCode);
	}

	@Override
	public void updatePostById(SysPostTab sysPostTab) {
		sysPostTabDao.updatePostById(sysPostTab);
	}

	@Override
	public List<SysPostTab> getSectionsName() {
		return sysPostTabDao.getSectionsName();
	}

	@Override
	public List<SysPostTab> findUintCode(String unitCode) {
		return sysPostTabDao.findUintCode(unitCode);
	}

	@Override
	public SysPostTab findByPostId(String PostId) {
		return sysPostTabDao.findByPostId(PostId);
	}

	@Override
	public String getPostIdByUnitName(String unitName,String sectionName) {
		Map<String, Object> map = new HashMap<>();
		map.put("unitName", unitName);
		map.put("sectionName", sectionName);
		return sysPostTabDao.getPostIdByUnitName(map);
	}

	@Override
	public List<SysPostTab> getUP(String userId) {
		// TODO Auto-generated method stub
		return sysPostTabDao.getUP(userId);
	}

	@Override
	public String getPostIdByUnitName1(String unitName, String sectionName) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("unitName", unitName);
		map.put("sectionName", sectionName);
		return sysPostTabDao.getPostIdByUnitName1(map);
	}

	@Override
	public void updateKsqk(SysPostTab sysPostTab) {
		sysPostTabDao.updateKsqk(sysPostTab);
	}


}
