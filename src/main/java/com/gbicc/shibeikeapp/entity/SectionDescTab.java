
package com.gbicc.shibeikeapp.entity;

import java.util.*;

import com.sun.jmx.snmp.Timestamp;

/**
 * @author easyloan
 * @version 1.0
 * @since 1.0
 */

public class SectionDescTab implements java.io.Serializable {
	/**
	 * 发布者名称 db_column: publisher
	 */
	private String publisher;
	/**
	 * 发布时间 db_column: pubTime
	 */
	private java.sql.Timestamp pubTime;
	/**
	 * 处室编号 db_column: sections_code
	 */
	private String sectionsCode;
	/**
	 * 处室描述ID db_column: sc_id
	 */
	private String scId;
	
	/**
	 * 修改信息 db_column: updateDesc
	 */
	private String updateDesc;
	/**
	 * 描述内容 db_column: content
	 */
	private String content;
	
	private SysPostTab post;
	
	public SectionDescTab() {
	}

	public SectionDescTab(String scId) {

		this.scId = scId;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getSectionsCode() {
		return sectionsCode;
	}

	public void setSectionsCode(String sectionsCode) {
		this.sectionsCode = sectionsCode;
	}

	public String getScId() {
		return scId;
	}

	public void setScId(String scId) {
		this.scId = scId;
	}

	public String getUpdateDesc() {
		return updateDesc;
	}

	public void setUpdateDesc(String updateDesc) {
		this.updateDesc = updateDesc;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public SysPostTab getPost() {
		return post;
	}

	public void setPost(SysPostTab post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "SectionDescTab [publisher=" + publisher + ", pubTime="
				+ pubTime + ", sectionsCode=" + sectionsCode + ", scId=" + scId
				+ ", updateDesc=" + updateDesc + ", content=" + content
				+ ", post=" + post + "]";
	}

	public java.sql.Timestamp getPubTime() {
		return pubTime;
	}

	public void setPubTime(java.sql.Timestamp pubTime) {
		this.pubTime = pubTime;
	}


}