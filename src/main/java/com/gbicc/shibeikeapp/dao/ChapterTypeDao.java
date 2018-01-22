package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ChapterType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("chapterTypeDao")
public interface ChapterTypeDao {
	/**
	 * 根据列来查询
	 * @param Column
	 * @return
	 */
	public List<ChapterType> chapterTypeByID(String Column);
	/**
	 * 查询课程类别
	 * @return
	 */
	public List<ChapterType> getAllChapType(String typeName);
	/**
	 * 插入
	 * @param chapter
	 */
	public void addChapType(ChapterType chapter);
	/**
	 * 修改
	 */
	public void updateChapType(ChapterType chapter);
	public List<ChapterType> findTypeId(String typeId);
	/**
	 * 删除
	 */
	public void deleteChapType(String typeId);
}
