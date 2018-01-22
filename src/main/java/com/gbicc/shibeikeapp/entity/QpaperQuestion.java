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


public class QpaperQuestion implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 试卷与试题关系表ID       db_column: PAPER_QUES_ID 
     */	
	private String paperQuesId;
    /**
     * 试卷ID       db_column: PAPER_ID 
     */	
	private String paperId;
    /**
     * 试题ID       db_column: QUES_ID 
     */	
	private String quesId;
    /**
     * 试题类型       db_column: QUES_TYPE 
     */	
	private String quesType;
	//columns END

	public QpaperQuestion(){
	}

	public QpaperQuestion(
		String paperQuesId
	){
		this.paperQuesId = paperQuesId;
	}

	public void setPaperQuesId(String value) {
		this.paperQuesId = value;
	}
	
	public String getPaperQuesId() {
		return this.paperQuesId;
	}
	public void setPaperId(String value) {
		this.paperId = value;
	}
	
	public String getPaperId() {
		return this.paperId;
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
	
	private PpaperTab ppaperTab;
	
	public void setPpaperTab(PpaperTab ppaperTab){
		this.ppaperTab = ppaperTab;
	}
	
	public PpaperTab getPpaperTab() {
		return ppaperTab;
	}
	
	private QquestionTab qquestionTab;
	
	public void setQquestionTab(QquestionTab qquestionTab){
		this.qquestionTab = qquestionTab;
	}
	
	public QquestionTab getQquestionTab() {
		return qquestionTab;
	}

}

