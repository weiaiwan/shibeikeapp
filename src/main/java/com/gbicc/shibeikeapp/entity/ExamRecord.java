package com.gbicc.shibeikeapp.entity;

public class ExamRecord {
	 /**
     * 试卷分数     
     */		
	private Integer paperScore;
	  /**
     *试卷等级    
     */	
	private String paperLevel;
	 /**
     * 处室名称      
     */	
	private String officeName ;
	  /**
     * 试卷名称 
     */	
	private String paperName;
	 /**
     * 出题人     
     */	
	private String paperMaker;
	 /**
     * 联系电话       
     */	
	private String makerPhone ;
	/**
	 * 提交时间
	 */
	private java.sql.Timestamp overTime;
	 /**
     * 试卷类别
     */	
	private String paperType;
	 /**
     * 考试次数
     */	
	private String examNum;
	 /**
     * 试卷id
     */	
	private String paperId;
	
	public ExamRecord(){}
	
	
	public String getExamNum() {
		return examNum;
	}


	public void setExamNum(String examNum) {
		this.examNum = examNum;
	}


	public String getPaperId() {
		return paperId;
	}


	public void setPaperId(String paperId) {
		this.paperId = paperId;
	}


	public String getPaperType() {
		return paperType;
	}


	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}


	public java.sql.Timestamp getOverTime() {
		return overTime;
	}


	public void setOverTime(java.sql.Timestamp overTime) {
		this.overTime = overTime;
	}


	public Integer getPaperScore() {
		return paperScore;
	}
	public void setPaperScore(Integer paperScore) {
		this.paperScore = paperScore;
	}
	public String getPaperLevel() {
		return paperLevel;
	}
	public void setPaperLevel(String paperLevel) {
		this.paperLevel = paperLevel;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public String getPaperMaker() {
		return paperMaker;
	}
	public void setPaperMaker(String paperMaker) {
		this.paperMaker = paperMaker;
	}
	public String getMakerPhone() {
		return makerPhone;
	}
	public void setMakerPhone(String makerPhone) {
		this.makerPhone = makerPhone;
	}
	
	
}
