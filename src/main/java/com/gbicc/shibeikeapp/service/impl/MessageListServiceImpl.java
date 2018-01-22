package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.MessageListDao;
import com.gbicc.shibeikeapp.entity.MessageList;
import com.gbicc.shibeikeapp.service.MessageListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value = "messageListService")
public class MessageListServiceImpl implements MessageListService {

	@Resource
	private MessageListDao messageListDao;

	public void setMessageListDao(MessageListDao messageListDao) {
		this.messageListDao = messageListDao;
	}

	/**
	 * 发布通知公告
	 */
	@Override
	public void AddMessage(MessageList messagelist) {
		// TODO Auto-generated method stub
		messageListDao.insertMessage(messagelist);
	}

	/**
	 * 显示全部通知公告
	 */
	@Override
	public List<MessageList> showAllMessageList() {
		// TODO Auto-generated method stub
		return messageListDao.getAllMessage();

	}

	@Override
	public void updateMessage(String messageId) {
		messageListDao.updateMessage(messageId);
		
	}
	public List<MessageList> getMessage(Map<String, Object> map){
		return messageListDao.getMessage(map);
	}

	@Override
	public Integer getCount() {
		 
		return messageListDao.getCount();
	}

	@Override
	public MessageList getMessageById(String messageId) {
		 
		return messageListDao.getMessageById(messageId);
	}

	@Override
	public void deleteById(String messageId) {
		messageListDao.deleteById(messageId);
	}

	@Override
	public List<MessageList> getMessage1() {
		return messageListDao.getMessage1();
	}

	@Override
	public List<MessageList> getMessage2(Map<String, Object> map) {
		return messageListDao.getMessage2(map);
	}

	@Override
	public Integer getCount2(String messageType) {
		return messageListDao.getCount2(messageType);
	}

}
