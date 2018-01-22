/*
 * Powered By [easy_project]
 * Since 2010 - 2015
 */

package com.gbicc.shibeikeapp.entity;


import java.sql.Timestamp;
import java.util.*;



/**
 * @author easyloan 
 * @version 1.0
 * @since 1.0
 */


public class PpaperTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
    /**
     * 试卷ID       db_column: PAPER_ID 
     */	
	private String paperId;
    /**
     * 试卷说明       db_column: PAPER_DESC 
     */	
	private String paperDesc;
   
    /**
     * 结束时间       db_column: OVER_TIME 
     */	
	
	private Timestamp overTime;
    /**
     * 开始时间       db_column: START_TIME 
     */	
	
	private Timestamp startTime;
    /**
     * 试卷编号       db_column: PAPER_CODE 
     */	
	private String paperCode;
    /**
     * 试卷名称       db_column: PAPER_NAME 
     */	
	private String paperName;
    /**
     * 岗位ID       db_column: POST_ID 
     */	
	private String postId;
    /**
     * 图片路径       db_column: PAPER_IMG_URL 
     */	
	private String paperImgUrl;
    /**
     *试卷等级      db_column: PAPER_LEVEL 
     */	
	private String paperLevel;
	 /**
     * 处室名称       db_column: office_name 
     */	
	private String officeName ;
	 /**
     * 出题人     db_column: paper_maker 
     */	
	private String paperMaker;
	 /**
     * 联系电话       db_column: maker_phone 
     */	
	private String makerPhone ;
	/**
	 * 试卷类型      db_column: paper_type 
	 */
	private String paperType;
	 /**
     * 试卷状态    db_column: PAPER_STATER 
     */	
	private String paperStater ;
	 /**
     * 试卷分数   db_column: PAPER_GRADE 
     */	
	private int paperGrade =0;
	 /**
     * 优秀分数   db_column: GRADE_GOOD
     */	
	private int gradeGood;
	/**
     * 良好分数   db_column:GRADE_NICE 
     */	
	private int gradeNice;
	/**
	 * 上传用户     db_column: TRAINER_USERID
	 */	
	private String trainerUserId;

	/**
	 * 上传时间    db_column: up_date
	 */	
	private Timestamp upDate;
	private String pcType;
	private String pjurisType;
	//columns END
	
	
	public String getPaperStater() {
		return paperStater;
	}
	public String getPjurisType() {
		return pjurisType;
	}
	public void setPjurisType(String pjurisType) {
		this.pjurisType = pjurisType;
	}
	public String getPcType() {
		return pcType;
	}
	public void setPcType(String pcType) {
		this.pcType = pcType;
	}
	public String getTrainerUserId() {
		return trainerUserId;
	}
	public Timestamp getUpDate() {
		return upDate;
	}
	public void setUpDate(Timestamp upDate) {
		this.upDate = upDate;
	}
	public void setTrainerUserId(String trainerUserId) {
		this.trainerUserId = trainerUserId;
	}

	public int getPaperGrade() {
		return paperGrade;
	}

	public void setPaperGrade(int paperGrade) {
		this.paperGrade = paperGrade;
	}

	public int getGradeGood() {
		return gradeGood;
	}

	public void setGradeGood(int gradeGood) {
		this.gradeGood = gradeGood;
	}

	public int getGradeNice() {
		return gradeNice;
	}

	public void setGradeNice(int gradeNice) {
		this.gradeNice = gradeNice;
	}

	public void setPaperStater(String paperStater) {
		this.paperStater = paperStater;
	}

	public String getPaperType() {
		return paperType;
	}

	public PpaperTab(){
	}

	public PpaperTab(
		String paperId
	){
		this.paperId = paperId;
	}

	public void setPaperId(String value) {
		this.paperId = value;
	}
	
	public String getPaperId() {
		return this.paperId;
	}
	public void setPaperDesc(String value) {
		this.paperDesc = value;
	}
	
	public String getPaperDesc() {
		return this.paperDesc;
	}
	 
	 
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}

	public void setOverTime(Timestamp value) {
		this.overTime = value;
	}
	
	public Timestamp getOverTime() {
		return this.overTime;
	}
	public void setStartTime(Timestamp value) {
		this.startTime = value;
	}
	
	public Timestamp getStartTime() {
		return this.startTime;
	}
	public void setPaperCode(String value) {
		this.paperCode = value;
	}
	
	public String getPaperCode() {
		return this.paperCode;
	}
	public void setPaperName(String value) {
		this.paperName = value;
	}
	
	public String getPaperName() {
		return this.paperName;
	}
	public void setPostId(String value) {
		this.postId = value;
	}
	
	public String getPostId() {
		return this.postId;
	}
	public void setPaperImgUrl(String value) {
		this.paperImgUrl = value;
	}
	
	public String getPaperImgUrl() {
		return this.paperImgUrl;
	}
	
	private Set puserPapers = new HashSet(0);
	public void setPuserPapers(Set<PuserPaper> puserPaper){
		this.puserPapers = puserPaper;
	}
	
	public Set<PuserPaper> getPuserPapers() {
		return puserPapers;
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

