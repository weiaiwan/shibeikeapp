package com.gbicc.shibeikeapp.dao;


import com.gbicc.shibeikeapp.entity.MessageList;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository("messageListDao")
public interface MessageListDao {

	/**
	 * 查询所有通告
	 * @param map
	 * @return
	 */
	public List<MessageList> getAllMessage();
	/**
	 * 发布通告
	 * @param messagelist
	 */
	public void insertMessage(MessageList messagelist);
	/**
	 * 更新浏览次数
	 */
	public void updateMessage(String messageId);
	/**
	 * 分页查看通知公告
	 * @param map
	 * @return
	 */
	public List<MessageList> getMessage(Map<String, Object> map);
	public List<MessageList> getMessage1();
	/**
	 * 分页查看学习或考试中心通知公告
	 * @param map
	 * @return
	 */
	public List<MessageList> getMessage2(Map<String, Object> map);
	/**
	 * 通知公告总条数
	 * @param map
	 * @return
	 */
	public Integer getCount();
	/**
	 * 学习或考试中心通知公告总条数
	 * @param map
	 * @return
	 */
	public Integer getCount2(String messageType);
	/**
	 * 查看具体某条通知的内容
	 * @param message_id
	 * @return
	 */
	public MessageList getMessageById(String messageId);
	
	/**
	 * 删除一条公告
	 */
	public void deleteById(String messageId);
}
