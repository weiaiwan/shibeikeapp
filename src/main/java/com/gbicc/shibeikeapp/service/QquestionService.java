package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.QquestionTab;

import java.util.List;
import java.util.Map;

public interface QquestionService {
	/**
	 * 分页查询所有考题
	 * @param map
	 * @return
	 */
	public List<QquestionTab> getPageQues(Map<String, Object> map);
	/**
	 * 添加试题
	 * @param Ques
	 */
	public void saveQues(QquestionTab Ques);
	/**
	 * 根据ID删除试题
	 * @param id
	 */
	public void deleteQues(int id);
	/**
	 * 根据id查询考题
	 * @param id
	 * @return
	 */
	public QquestionTab getIDQues(String id);
	/**
	 * 修改考题
	 * @param qun
	 */
	public void updateQues(QquestionTab Ques);
	/**
	 * 根据章节的id查询考题
	 * @param id
	 * @return
	 */
	public List<QquestionTab> getChapterIDQues(int id);
	/**
	 * 根据试卷查询题
	 * @param id
	 * @return
	 */
	public List<QquestionTab> getPaperIdques(String id);
	/**
	 * 根据试卷 试卷的id 考题的类型，考试的类型查找试题（返回对象）
	 */
	public QquestionTab getques(Map<String, Object> map);
	/**
	 * 根据条件查出序号
	 */
	public List<QquestionTab> getSerial(String paperId);
	
	//查看该试卷的总成绩
	public int getAllRestlt(String paperId);
	/**
	 * 查询所有试题信息
	 */
	public List<QquestionTab> getSerial1(String paperId);
}
