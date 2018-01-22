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


public class PuserPaper implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 试卷记录表ID       db_column: USER_PAPER_ID 
     */	
	private String userPaperId;
    /**
     * 用户ID       db_column: USER_ID 
     */	
	private String userId;
    /**
     * 试卷ID       db_column: PAPER_ID 
     */	
	private String paperId;
    /**
     * 状态       db_column: STATE 
     */	
	private String state;
    /**
     * 提交时间       db_column: OVER_TIME 
     */	
	
	private java.sql.Timestamp overTime;
    /**
     * 考试开始时间       db_column: START_TIME 
     */	
	
	private java.sql.Timestamp startTime;
    /**
     * 用户编号       db_column: USER_CODE 
     */	
	private String userCode;
    /**
     * 用户名称       db_column: USER_NAME 
     */	
	private String userName;
    /**
     * 试卷分数       db_column: PAPER_SCORE 
     */	
	
	private Integer paperScore;
	//columns END
	 /**
     * 用户编号       db_column: USER_CODE 
     */	
	private String examNum;
	public PuserPaper(){
	}
  
	public PuserPaper(
		String userPaperId
	){
		this.userPaperId = userPaperId;
	}
	
	public String getExamNum() {
		return examNum;
	}

	public void setExamNum(String examNum) {
		this.examNum = examNum;
	}

	public void setUserPaperId(String value) {
		this.userPaperId = value;
	}
	
	public String getUserPaperId() {
		return this.userPaperId;
	}
	public void setUserId(String value) {
		this.userId = value;
	}
	
	public String getUserId() {
		return this.userId;
	}
	public void setPaperId(String value) {
		this.paperId = value;
	}
	
	public String getPaperId() {
		return this.paperId;
	}
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return this.state;
	}
	public void setOverTime(java.sql.Timestamp value) {
		this.overTime = value;
	}
	
	public java.sql.Timestamp getOverTime() {
		return this.overTime;
	}
	public void setStartTime(java.sql.Timestamp value) {
		this.startTime = value;
	}
	
	public java.sql.Timestamp getStartTime() {
		return this.startTime;
	}
	public void setUserCode(String value) {
		this.userCode = value;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setPaperScore(Integer value) {
		this.paperScore = value;
	}
	
	public Integer getPaperScore() {
		return this.paperScore;
	}
	
	private PpaperTab ppaperTab;
	
	public void setPpaperTab(PpaperTab ppaperTab){
		this.ppaperTab = ppaperTab;
	}
	
	public PpaperTab getPpaperTab() {
		return ppaperTab;
	}
	
	private SysUserTab sysUserTab;
	
	public void setSysUserTab(SysUserTab sysUserTab){
		this.sysUserTab = sysUserTab;
	}
	
	public SysUserTab getSysUserTab() {
		return sysUserTab;
	}

}

