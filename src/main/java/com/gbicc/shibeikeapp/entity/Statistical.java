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


public class Statistical implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 统计ID       db_column: STATISTICAL_ID 
     */	
	private String statisticalId;
    /**
     * 课程类别       db_column: COURSE_TYPE 
     */	
	private String courseType;
    /**
     * 课程名称       db_column: COURSE_NAME 
     */	
	private String courseName;
    /**
     * 考试人数       db_column: EXAM_NUM 
     */	
	
	private java.math.BigDecimal examNum;
    /**
     * 通过考试人数       db_column: THROUGH_NUM 
     */	
	
	private java.math.BigDecimal throughNum;
    /**
     * 通过率       db_column: NUMERIC_RATE 
     */	
	private String numericRate;
    /**
     * 截止考试时间       db_column: RING_TIME 
     */	
	
	private java.sql.Date ringTime;
    /**
     * 成绩分析       db_column: RESULTS_ANALYSIS 
     */	
	private String resultsAnalysis;
	//columns END

	public Statistical(){
	}

	public Statistical(
		String statisticalId
	){
		this.statisticalId = statisticalId;
	}

	public void setStatisticalId(String value) {
		this.statisticalId = value;
	}
	
	public String getStatisticalId() {
		return this.statisticalId;
	}
	public void setCourseType(String value) {
		this.courseType = value;
	}
	
	public String getCourseType() {
		return this.courseType;
	}
	public void setCourseName(String value) {
		this.courseName = value;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	public void setExamNum(java.math.BigDecimal value) {
		this.examNum = value;
	}
	
	public java.math.BigDecimal getExamNum() {
		return this.examNum;
	}
	public void setThroughNum(java.math.BigDecimal value) {
		this.throughNum = value;
	}
	
	public java.math.BigDecimal getThroughNum() {
		return this.throughNum;
	}
	public void setNumericRate(String value) {
		this.numericRate = value;
	}
	
	public String getNumericRate() {
		return this.numericRate;
	}
	public void setRingTime(java.sql.Date value) {
		this.ringTime = value;
	}
	
	public java.sql.Date getRingTime() {
		return this.ringTime;
	}
	public void setResultsAnalysis(String value) {
		this.resultsAnalysis = value;
	}
	
	public String getResultsAnalysis() {
		return this.resultsAnalysis;
	}

}

