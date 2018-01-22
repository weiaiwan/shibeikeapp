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


public class ProgressStudy implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 学习ID       db_column: STUDY_ID 
     */	
	private String studyId;
    /**
     * 用户ID       db_column: USER_ID 
     */	
	private String userId;
    /**
     * 章节ID       db_column: CHAPTER_ID 
     */	
	private String chapterId;
    /**
     * 是否学习(0:未学习;1:已学习)       db_column: STUDY_FLAG 
     */	
	private String studyFlag;
    /**
     * 开始学习时间       db_column: STUDY_DATE 
     */	
	
	private java.sql.Date studyDate;
    /**
     * 学习进度       db_column: PROGRESS_STUDY 
     */	
	
	private java.math.BigDecimal progressStudy;
	//columns END

	public ProgressStudy(){
	}

	public ProgressStudy(
		String studyId
	){
		this.studyId = studyId;
	}

	public void setStudyId(String value) {
		this.studyId = value;
	}
	
	public String getStudyId() {
		return this.studyId;
	}
	public void setUserId(String value) {
		this.userId = value;
	}
	
	public String getUserId() {
		return this.userId;
	}
	public void setChapterId(String value) {
		this.chapterId = value;
	}
	
	public String getChapterId() {
		return this.chapterId;
	}
	public void setStudyFlag(String value) {
		this.studyFlag = value;
	}
	
	public String getStudyFlag() {
		return this.studyFlag;
	}
	public void setStudyDate(java.sql.Date value) {
		this.studyDate = value;
	}
	
	public java.sql.Date getStudyDate() {
		return this.studyDate;
	}
	public void setProgressStudy(java.math.BigDecimal value) {
		this.progressStudy = value;
	}
	
	public java.math.BigDecimal getProgressStudy() {
		return this.progressStudy;
	}
	
	private ChapterTab chapterTab;
	
	public void setChapterTab(ChapterTab chapterTab){
		this.chapterTab = chapterTab;
	}
	
	public ChapterTab getChapterTab() {
		return chapterTab;
	}
	
	private SysUserTab sysUserTab;
	
	public void setSysUserTab(SysUserTab sysUserTab){
		this.sysUserTab = sysUserTab;
	}
	
	public SysUserTab getSysUserTab() {
		return sysUserTab;
	}

}

