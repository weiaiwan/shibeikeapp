package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.MessageList;

import java.util.List;
import java.util.Map;


public interface MessageListService {

	/**
	 * 显示所有通告的业务接口
	 * @return
	 */
	public List<MessageList> showAllMessageList();
	/**
	 * 发布公告的业务接口
	 * @param messagelist
	 */
	public void AddMessage(MessageList messagelist);
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
	public Integer getCount();
	/**
	 * 分页查看学习或考试中心通知公告
	 */
	public List<MessageList> getMessage2(Map<String, Object> map);
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
