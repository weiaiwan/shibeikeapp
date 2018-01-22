/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.entity;

import java.util.*;

/**
 * @author easyloan
 * @version 1.0
 * @since 1.0
 */

public class MessageList implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	/**
	 * 消息ID db_column: MESSAGE_ID
	 */
	private String messageId;
	/**
	 * 消息内容 db_column: MESSAGE_CONTENT
	 */
	private String messageContent;
	/**
	 * 是否有效 db_column: VALUE_FLAG
	 */
	private String valueFlag;
	/**
	 * 发步时间 db_column: SEND_TIME
	 */
	private java.sql.Timestamp sendTime;
	/**
	 * 标题 
	 */
	private String title;
	/**
	 * 浏览次数
	 */
	private Integer scanTimes;
	/**
	 * 信息类型
	 */
	private String messageType;

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getScanTimes() {
		return scanTimes;
	}

	public void setScanTimes(Integer scanTimes) {
		this.scanTimes = scanTimes;
	}

	public MessageList() {
	}

	public MessageList(String messageId) {
		this.messageId = messageId;
	}

	public void setMessageId(String value) {
		this.messageId = value;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageContent(String value) {
		this.messageContent = value;
	}

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setValueFlag(String value) {
		this.valueFlag = value;
	}

	public String getValueFlag() {
		return this.valueFlag;
	}

	public java.sql.Timestamp getSendTime() {
		return sendTime;
	}

	public void setSendTime(java.sql.Timestamp sendTime) {
		this.sendTime = sendTime;
	}

}
