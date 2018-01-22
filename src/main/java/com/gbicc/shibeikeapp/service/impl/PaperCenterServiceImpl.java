package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.entity.PpaperTab;
import com.gbicc.shibeikeapp.service.PaperCenterService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="paperCenterService")
public class PaperCenterServiceImpl implements PaperCenterService {

	@Resource
	private SqlSessionFactory sqlSessionFactory;
	@Resource 
	private PaperCenterService paperCenterService;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	public void setPaperCenterService(PaperCenterService paperCenterService) {
		this.paperCenterService = paperCenterService;
	}

	@Override
	public List<String> showPaperType() {
		SqlSession session = sqlSessionFactory.openSession();
		List paperTypeList = session.selectList("showPaperType");
		session.close();
		return paperTypeList;
	}

	@Override
	public List<Integer> calPaperType() {
		SqlSession session = sqlSessionFactory.openSession();
		List calPaperTypeList = session.selectList("calPaperType");
		session.close();
		return calPaperTypeList;
	}
	
	@Override
	public List<String> showPaperLevel(String paperType){
		SqlSession session = sqlSessionFactory.openSession();
		List PaperLevelList = session.selectList("showPaperLevel",paperType);
		session.close();
		return PaperLevelList;
	}

	@Override
	public List<Integer> calPaperLevel(String paperType) {
		SqlSession session = sqlSessionFactory.openSession();
		List<Integer> numList = session.selectList("calPaperLevel",paperType);
		session.close();
		return numList;
	}

	@Override
	public List<PpaperTab> showPaper(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaper",map); 
		session.close();
		return list;
	}

	@Override
	public int calPaper(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaper",map);
		session.close();
		return num;
	}
	@Override
	public List<PpaperTab> showPaperByFlfg(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaperByFlfg",map); 
		session.close();
		return list;
	}
	@Override
	public int calPaperByFlfg(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaperByFlfg",map);
		session.close();
		return num;
	}
	@Override
	public List<PpaperTab> showPaperByZytj(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaperByZytj",map); 
		session.close();
		return list;
	}
	@Override
	public int calPaperByZytj(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaperByZytj",map);
		session.close();
		return num;
	}
	@Override
	public List<PpaperTab> showPaperByDgdj(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaperByDgdj",map); 
		session.close();
		return list;
	}
	@Override
	public int calPaperByDgdj(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaperByDgdj",map);
		session.close();
		return num;
	}
	
	@Override
	public List<PpaperTab> getPaperS(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("getPaperS",map); 
		session.close();
		return list;
	}
	@Override
	public int getPaperSCount(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("getPaperSCount",map);
		session.close();
		return num;
	}
	@Override
	public List<PpaperTab> showPaperByzc(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaperByzc",map); 
		session.close();
		return list;
	}
	@Override
	public int calPaperByzc(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaperByzc",map);
		session.close();
		return num;
	}
	@Override
	public List<PpaperTab> showPaperBypcdc(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaperBypcdc",map); 
		session.close();
		return list;
	}
	@Override
	public int calPaperBypcdc(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaperBypcdc",map);
		session.close();
		return num;
	}
	@Override
	public List<PpaperTab> showPaperBytjjm(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		List<PpaperTab> list = session.selectList("showPaperBytjjm",map); 
		session.close();
		return list;
	}
	@Override
	public int calPaperBytjjm(Map map) {
		SqlSession session = sqlSessionFactory.openSession();
		int num = session.selectOne("calPaperBytjjm",map);
		session.close();
		return num;
	}

}
