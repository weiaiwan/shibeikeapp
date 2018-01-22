package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.SectionDescTabDao;
import com.gbicc.shibeikeapp.entity.SectionDescTab;
import com.gbicc.shibeikeapp.service.SectionDescService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="sectionDescService")
public class SectionDescServiceImpl implements SectionDescService {
	@Resource
	private SectionDescTabDao sectionDescTabDao;
	
	public void setSectionDescTabDao(SectionDescTabDao sectionDescTabDao) {
		this.sectionDescTabDao = sectionDescTabDao;
	}

	@Override
	public List<SectionDescTab> getSectionDesc(String  userId){
		return sectionDescTabDao.getSectionDesc(userId);
	}
	@Override
	public List<SectionDescTab> getByDesc(Map<String, Object> map) {
		return sectionDescTabDao.getByDesc(map);
	}

	@Override
	public void updateDesc(SectionDescTab sectionDescTab) {
		sectionDescTabDao.updateDesc(sectionDescTab);
	}

	@Override
	public void addDesc(SectionDescTab sectionDescTab) {
		sectionDescTabDao.addDesc(sectionDescTab);
	}

	@Override
	public Integer countByDesc(Map<String, Object> map) {
		return sectionDescTabDao.countByDesc(map);
	}

	@Override
	public List<SectionDescTab> getRecord(String code) {
		return sectionDescTabDao.getRecord(code);
	}


	@Override
	public void deleteDesc(String id) {
		sectionDescTabDao.deleteDesc(id);
	}

	@Override
	public List<SectionDescTab> getAllSectionDescTab(Map<String, Object> map) {
		return sectionDescTabDao.getAllSectionDescTab(map);
	}

	@Override
	public SectionDescTab getSection(String scId) {
		return sectionDescTabDao.getSection(scId);
	}

	@Override
	public void delDescBysectionCode(String sectionCode) {
		sectionDescTabDao.delDescBysectionCode(sectionCode);
	}
	
	@Override
	public List<SectionDescTab> getSectionDescrsc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescrsc();
	}
	@Override
	public List<SectionDescTab> getSectionDescrbg() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescrbg();
	}
	@Override
	public List<SectionDescTab> getSectionDescxx() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescxx();
	}
	@Override
	public List<SectionDescTab> getSectionDescgh() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescgh();
	}
	@Override
	public List<SectionDescTab> getSectionDescfg() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescfg();
	}
	@Override
	public List<SectionDescTab> getSectionDescsg() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescsg();
	}
	@Override
	public List<SectionDescTab> getSectionDescrk() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescrk();
	}
	@Override
	public List<SectionDescTab> getSectionDesczh() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDesczh();
	}
	@Override
	public List<SectionDescTab> getSectionDescnc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescnc();
	}
	@Override
	public List<SectionDescTab> getSectionDescgy(Map map) {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescgy(map);
	}
	@Override
	public List<SectionDescTab> getSectionDescny() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescny();
	}
	@Override
	public List<SectionDescTab> getSectionDesctz() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDesctz();
	}
	@Override
	public List<SectionDescTab> getSectionDescdy() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescdy();
	}
	@Override
	public List<SectionDescTab> getSectionDescsk() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescsk();
	}
	@Override
	public List<SectionDescTab> getSectionDescfwy() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescfwy();
	}
	@Override
	public List<SectionDescTab> getSectionDescjgdw() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescjgdw();
	}

	@Override
	public List<SectionDescTab> getSectionDescmwc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescmwc();
	}

	@Override
	public List<SectionDescTab> getSectionDescjcs() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescjcs();
	}

	@Override
	public List<SectionDescTab> getSectionDescjyzx() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescjyzx();
	}

	@Override
	public List<SectionDescTab> getSectionDescdsjzrs() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescdsjzrs();
	}

	@Override
	public List<SectionDescTab> getSectionDescdsjsjc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescdsjsjc();
	}

	@Override
	public List<SectionDescTab> getSectionDescdsjjcc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescdsjjcc();
	}

	@Override
	public List<SectionDescTab> getSectionDescdsjyxc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescdsjyxc();
	}

	@Override
	public List<SectionDescTab> getSectionDescdsjfwc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescdsjfwc();
	}

	@Override
	public List<SectionDescTab> getSectionDescpdzrs() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescpdzrs();
	}

	@Override
	public List<SectionDescTab> getSectionDescpddcc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescpddcc();
	}

	@Override
	public List<SectionDescTab> getSectionDescpdsqmyc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescpdsqmyc();
	}

	@Override
	public List<SectionDescTab> getSectionDescpdmlc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescpdmlc();
	}

	@Override
	public List<SectionDescTab> getSectionDescpdpcc() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescpdpcc();
	}

	@Override
	public List<SectionDescTab> getSectionDesclzs() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDesclzs();
	}

	@Override
	public List<SectionDescTab> getSectionDesczxzx() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDesczxzx();
	}

	@Override
	public List<SectionDescTab> getSectionDescpdzx() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescpdzx();
	}

	@Override
	public List<SectionDescTab> getSectionDescbg() {
		// TODO Auto-generated method stub
		return sectionDescTabDao.getSectionDescbg();
	}
	

	
}
