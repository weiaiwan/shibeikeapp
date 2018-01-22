package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.ChapterTypeDao;
import com.gbicc.shibeikeapp.entity.ChapterType;
import com.gbicc.shibeikeapp.service.ChapterTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("chapterTypeService")
public class ChapterTypeServiceImpl implements ChapterTypeService {
	@Resource
	private ChapterTypeDao chapterTypeDao;
	
	public ChapterTypeDao getChapterTypeDao() {
		return chapterTypeDao;
	}

	public void setChapterTypeDao(ChapterTypeDao chapterTypeDao) {
		this.chapterTypeDao = chapterTypeDao;
	}

	@Override
	public List<ChapterType> chapterTypeByID(String Column) {
		// TODO Auto-generated method stub
		return chapterTypeDao.chapterTypeByID(Column);
	}

	@Override
	public void addChapType(ChapterType chapter) {
		chapterTypeDao.addChapType(chapter);
		
	}

	@Override
	public void updateChapType(ChapterType chapter) {
		// TODO Auto-generated method stub
		chapterTypeDao.updateChapType(chapter);
		
	}

	@Override
	public void deleteChapType(String typeId) {
		// TODO Auto-generated method stub
		chapterTypeDao.deleteChapType(typeId);
		
	}

	@Override
	public List<ChapterType> getAllChapType(String typeName) {
		// TODO Auto-generated method stub
		return chapterTypeDao.getAllChapType(typeName);
	}

	@Override
	public List<ChapterType> findTypeId(String typeId) {
		// TODO Auto-generated method stub
		return chapterTypeDao.findTypeId(typeId);
	}
}
