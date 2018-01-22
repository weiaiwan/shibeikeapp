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


public class PuserQuesTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 得分ID       db_column: SCORE_ID 
     */	
	private String scoreId;
    /**
     * 试卷ID       db_column: PAPER_ID 
     */	
	private String paperId;
    /**
     * 用户ID       db_column: USER_ID 
     */	
	private String userId;
    /**
     * 试题ID       db_column: QUES_ID 
     */	
	private String quesId;
    /**
     * 试题类型       db_column: QUES_TYPE 
     */	
	private String quesType;
    /**
     * 用户答案       db_column: USER_ANSWER 
     */	
	private String userAnswer;
	   /**
     * 用户答案       db_column: ques_answer 
     */	
	private String quesAnswer;
    /**
     * 试题分数       db_column: QUES_SCORE 
     */	
	private Short quesScore;
    /**
     * 试题实际得分       db_column: QUES_REAL_SCORE 
     */	
	private Short quesRealScore;
	/**
     * 试题序号       db_column: QUES_SERIAL 
     */	
	
	private Long quesSerial=1L;
	//columns END
	/**
     * 试题状态
     */	
	private String type;
	/**
     * 考试次数
     */	
	private String examNum;
	
	//试题表
	private QquestionTab questionTab;
	
	
	
	public String getExamNum() {
		return examNum;
	}

	public void setExamNum(String examNum) {
		this.examNum = examNum;
	}

	public QquestionTab getQuestionTab() {
		return questionTab;
	}

	public void setQuestionTab(QquestionTab questionTab) {
		this.questionTab = questionTab;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PuserQuesTab(){
	}

	public Long getQuesSerial() {
		return quesSerial;
	}

	public void setQuesSerial(Long quesSerial) {
		this.quesSerial = quesSerial;
	}

	public PuserQuesTab(
		String scoreId
	){
		this.scoreId = scoreId;
	}
	

	public String getQuesAnswer() {
		return quesAnswer;
	}

	public void setQuesAnswer(String quesAnswer) {
		this.quesAnswer = quesAnswer;
	}

	public void setScoreId(String value) {
		this.scoreId = value;
	}
	
	public String getScoreId() {
		return this.scoreId;
	}
	public void setPaperId(String value) {
		this.paperId = value;
	}
	
	public String getPaperId() {
		return this.paperId;
	}
	public void setUserId(String value) {
		this.userId = value;
	}
	
	public String getUserId() {
		return this.userId;
	}
	public void setQuesId(String value) {
		this.quesId = value;
	}
	
	public String getQuesId() {
		return this.quesId;
	}
	public void setQuesType(String value) {
		this.quesType = value;
	}
	
	public String getQuesType() {
		return this.quesType;
	}
	public void setUserAnswer(String value) {
		this.userAnswer = value;
	}
	
	public String getUserAnswer() {
		return this.userAnswer;
	}
	public void setQuesScore(Short value) {
		this.quesScore = value;
	}
	
	public Short getQuesScore() {
		return this.quesScore;
	}
	public void setQuesRealScore(Short value) {
		this.quesRealScore = value;
	}
	
	public Short getQuesRealScore() {
		return this.quesRealScore;
	}

	@Override
	public String toString() {
		return "PuserQuesTab [scoreId=" + scoreId + ", paperId=" + paperId + ", userId=" + userId + ", quesId=" + quesId
				+ ", quesType=" + quesType + ", userAnswer=" + userAnswer + ", quesAnswer=" + quesAnswer
				+ ", quesScore=" + quesScore + ", quesRealScore=" + quesRealScore + ", quesSerial=" + quesSerial + "]";
	}
	
}

