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


public class QquestionTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 试题ID       db_column: QUES_ID 
     */	
	private String quesId;
    /**
     * 试题名称       db_column: QUES_NAME 
     */	
	private String quesName="";
    /**
     * 章节ID       db_column: CHAPTER_ID 
     */	
	private String chapterId;
    /**
     * 试题类型       db_column: QUES_TYPE 
     */	
	private String quesType="1";
    /**
     * 答案       db_column: QUES_ANSWER 
     */	
	private String quesAnswer;
    /**
     * 答案选项       db_column: QUES_OPTIONS 
     */	
	private String quesOptions;
    /**
     * 试题分数       db_column: QUES_SCORE 
     */	
	
	private Integer quesScore=1;
    /**
     * 试题序号       db_column: QUES_SERIAL 
     */	
	
	private Long quesSerial=1L;
	/**
	 * 题目描述       db_column: QUES_EXPLAIN
	 */	
	private String quesExplain="题目描述";
	//columns END
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	
	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public String getH() {
		return h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public QquestionTab(){
	}

	public QquestionTab(
		String quesId
	){
		this.quesId = quesId;
	}

	public void setQuesId(String value) {
		this.quesId = value;
	}
	
	public String getQuesId() {
		return this.quesId;
	}
	public void setQuesName(String value) {
		this.quesName = value;
	}
	
	public String getQuesName() {
		return this.quesName;
	}
	public void setChapterId(String value) {
		this.chapterId = value;
	}
	
	public String getChapterId() {
		return this.chapterId;
	}
	public void setQuesType(String value) {
		this.quesType = value;
	}
	
	public String getQuesType() {
		return this.quesType;
	}
	public void setQuesAnswer(String value) {
		this.quesAnswer = value;
	}
	
	public String getQuesAnswer() {
		return this.quesAnswer;
	}
	public void setQuesOptions(String value) {
		this.quesOptions = value;
	}
	
	public String getQuesOptions() {
		return this.quesOptions;
	}
	public void setQuesScore(Integer value) {
		this.quesScore = value;
	}
	
	public Integer getQuesScore() {
		return this.quesScore;
	}
	public void setQuesSerial(Long value) {
		this.quesSerial = value;
	}
	
	public Long getQuesSerial() {
		return this.quesSerial;
	}
	
	private Set qpaperQuestions = new HashSet(0);
	public void setQpaperQuestions(Set<QpaperQuestion> qpaperQuestion){
		this.qpaperQuestions = qpaperQuestion;
	}
	
	public Set<QpaperQuestion> getQpaperQuestions() {
		return qpaperQuestions;
	}
	
	private Set puserQuesTabs = new HashSet(0);
	public void setPuserQuesTabs(Set<PuserQuesTab> puserQuesTab){
		this.puserQuesTabs = puserQuesTab;
	}
	
	public Set<PuserQuesTab> getPuserQuesTabs() {
		return puserQuesTabs;
	}
	
	private ChapterTab chapterTab;
	
	public void setChapterTab(ChapterTab chapterTab){
		this.chapterTab = chapterTab;
	}
	
	public ChapterTab getChapterTab() {
		return chapterTab;
	}

	public String getQuesExplain() {
		return quesExplain;
	}

	public void setQuesExplain(String quesExplain) {
		this.quesExplain = quesExplain;
	}

	
}

