package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.QquestionTab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("CeShiquestionDao")
public interface SeShiQquestionDao {
	/**
	 * 查询所有考题
	 * @param map
	 * @return
	 */
	public List<QquestionTab> getQquestion(Map<String, Object> map);
	
	/**
	 * 添加考题
	 * @param qun
	 */
	public void saveQquestion(QquestionTab qun);
	
	/**
	 * 根据id查询考题
	 * @param id
	 * @return
	 */
	public QquestionTab getQquestionId(int id);
	
	/**
	 * 修改考题
	 * @param qun
	 */
	public void updateQquestion(QquestionTab qun);
	
	/**
	 * 删除考题
	 * @param id
	 */
	public void deleteQquestion(Integer id);
	
}
