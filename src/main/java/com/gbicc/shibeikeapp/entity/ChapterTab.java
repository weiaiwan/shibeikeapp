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


public class ChapterTab implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	/**
	 * 课程状态    db_column: chapter_stater 
	 */	
	private String chapterStater;
    /**
     * 章节ID       db_column: CHAPTER_ID 
     */	
	private String chapterId;
	/**
     * 章节名称       db_column: CHAPTER_NAME 
     */	
	private String chapterName;
	/**
     * 专业       db_column: PROFESSIONAL_TYPE_CODE 
     */	
	private String professionalTypeCode;
	/**
     * 专业名称       db_column: PROFESSIONAL_NAME 
     */	
	private String professionalName;
	/**
     * 课程分类code       db_column: COURSE_TYPE_CODE 
     */	
	private String courseTypeCode;
	/**
     * 课程名称       db_column: COURSE_NAME 
     */	
	private String courseName;
	 /**
     * 节章名称 code      db_column: CHAPTER_NAME_CODE 
     */	
	private String chapterNameCode;
	/**
     * 课时       db_column: CLASSS_TIME 
     */	
	private Integer classsTime;
	 /**
     * 培训师       db_column: TRAINER 
     */	
	private String trainer;
    /**
     * 培训师电话       db_column: TRAINER_PHONE 
     */	
	private String trainerPhone;
	/**
     * 上传时间       db_column: over_time 
     */	
	private java.sql.Date overTime;
	/**
	 * 处室    db_column: chapter_office 
	 */	
	private String chapterOffice;
	/**
	 * 课程描述    db_column: chapter_describe 
	 */	
	private String chapterDescribe;
	/**
	 * 考试方式    db_column: test_Way 
	 */	
	private String testWay;
	/**
     * 岗位ID       db_column: POST_ID 
     */	
	private String postId;
	/**
	 * 更新时间       db_column: UP_DATE 
	 */	
	private java.sql.Timestamp upDate;
	/**
	 * 课程分类名称     db_column: COURSE_TYPE_NAME
	 */	
	private String courseTypeName;
	/**
	 * 上传用户     db_column: TRAINER_USERID
	 */	
	private String trainerUserId;
	/**
	 * 下载次数     db_column: up_number
	 */	
	private int upNumber;
	/**
	 * 预览量
	 */
	private int previewNumber;

	/**
	 * 课程编号     db_column: chapter_code
	 */	
	private String chapterCode;
	private String userId;
	private String tableName;
	private String jurisType;
	private String imgName;
	private String imgUrl;
	private String userName;
	private String chapterStar;
	private String chapterBq;
	private String price;
	private String weixin;
	private String touxiang;
	
	public String getWeixin() {
		return weixin;
	}
	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getChapterBq() {
		return chapterBq;
	}
	public void setChapterBq(String chapterBq) {
		this.chapterBq = chapterBq;
	}
	public String getChapterStar() {
		return chapterStar;
	}
	public void setChapterStar(String chapterStar) {
		this.chapterStar = chapterStar;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getJurisType() {
		return jurisType;
	}
	public void setJurisType(String jurisType) {
		this.jurisType = jurisType;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	//columns END
	public ChapterTab(){
	}
	public String getChapterCode() {
		return chapterCode;
	}

	
	public void setChapterCode(String chapterCode) {
		this.chapterCode = chapterCode;
	}

	
	public int getPreviewNumber() {
		return previewNumber;
	}
	public void setPreviewNumber(int previewNumber) {
		this.previewNumber = previewNumber;
	}
	public int getUpNumber() {
		return upNumber;
	}

	public void setUpNumber(int upNumber) {
		this.upNumber = upNumber;
	}

	public String getTrainerUserId() {
		return trainerUserId;
	}

	public void setTrainerUserId(String trainerUserId) {
		this.trainerUserId = trainerUserId;
	}

	public java.sql.Date getOverTime() {
		return overTime;
	}
	public String getCourseTypeName() {
		return courseTypeName;
	}

	public void setCourseTypeName(String courseTypeName) {
		this.courseTypeName = courseTypeName;
	}

	public String getChapterStater() {
		return chapterStater;
	}

	public void setChapterStater(String chapterStater) {
		this.chapterStater = chapterStater;
	}

	public void setOverTime(java.sql.Date overTime) {
		this.overTime = overTime;
	}

	public String getChapterOffice() {
		return chapterOffice;
	}

	public void setChapterOffice(String chapterOffice) {
		this.chapterOffice = chapterOffice;
	}

	public ChapterTab(
		String chapterId
	){
		this.chapterId = chapterId;
	}

	public void setChapterId(String value) {
		this.chapterId = value;
	}
	
	public String getChapterId() {
		return this.chapterId;
	}
	public void setChapterName(String value) {
		this.chapterName = value;
	}
	
	public String getChapterName() {
		return this.chapterName;
	}
	public void setProfessionalName(String value) {
		this.professionalName = value;
	}
	
	public String getProfessionalName() {
		return this.professionalName;
	}
	public void setCourseName(String value) {
		this.courseName = value;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	public void setPostId(String value) {
		this.postId = value;
	}
	
	public String getPostId() {
		return this.postId;
	}
	public void setClasssTime(Integer value) {
		this.classsTime = value;
	}
	
	public Integer getClasssTime() {
		return this.classsTime;
	}
	public void setTrainer(String value) {
		this.trainer = value;
	}
	
	public String getTrainer() {
		return this.trainer;
	}
	public void setTrainerPhone(String value) {
		this.trainerPhone = value;
	}
	
	public String getTrainerPhone() {
		return this.trainerPhone;
	}
	public java.sql.Timestamp getUpDate() {
		return upDate;
	}

	public void setUpDate(java.sql.Timestamp upDate) {
		this.upDate = upDate;
	}

	private Set ppaperTabs = new HashSet(0);
	public void setPpaperTabs(Set<PpaperTab> ppaperTab){
		this.ppaperTabs = ppaperTab;
	}
	
	public Set<PpaperTab> getPpaperTabs() {
		return ppaperTabs;
	}
	
	private Set qquestionTabs = new HashSet(0);
	public void setQquestionTabs(Set<QquestionTab> qquestionTab){
		this.qquestionTabs = qquestionTab;
	}
	
	public Set<QquestionTab> getQquestionTabs() {
		return qquestionTabs;
	}
	
	private Set progressStudys = new HashSet(0);
	public void setProgressStudys(Set<ProgressStudy> progressStudy){
		this.progressStudys = progressStudy;
	}
	
	public Set<ProgressStudy> getProgressStudys() {
		return progressStudys;
	}
	
	private SysPostTab sysPostTab;
	
	public void setSysPostTab(SysPostTab sysPostTab){
		this.sysPostTab = sysPostTab;
	}
	
	public SysPostTab getSysPostTab() {
		return sysPostTab;
	}

	public String getChapterDescribe() {
		return chapterDescribe;
	}

	public void setChapterDescribe(String chapterDescribe) {
		this.chapterDescribe = chapterDescribe;
	}

	public String getTestWay() {
		return testWay;
	}

	public void setTestWay(String testWay) {
		this.testWay = testWay;
	}

	public String getChapterNameCode() {
		return chapterNameCode;
	}

	public void setChapterNameCode(String chapterNameCode) {
		this.chapterNameCode = chapterNameCode;
	}

	public String getProfessionalTypeCode() {
		return professionalTypeCode;
	}

	public void setProfessionalTypeCode(String professionalTypeCode) {
		this.professionalTypeCode = professionalTypeCode;
	}

	public String getCourseTypeCode() {
		return courseTypeCode;
	}

	public void setCourseTypeCode(String courseTypeCode) {
		this.courseTypeCode = courseTypeCode;
	}
	

	public String toString() {
		return "ChapterTab [chapterId=" + chapterId + ", chapterNameCode="
				+ chapterNameCode + ", chapterName=" + chapterName
				+ ", professionalTypeCode=" + professionalTypeCode
				+ ", professionalName=" + professionalName
				+ ", courseTypeCode=" + courseTypeCode + ", courseTypeName="
				+ courseTypeName + ", courseName=" + courseName + ", postId="
				+ postId + ", classsTime=" + classsTime + ", trainer="
				+ trainer + ", trainerPhone=" + trainerPhone + ", overTime="
				+ overTime + ", upDate=" + upDate + ", chapterOffice="
				+ chapterOffice + ", chapterDescribe=" + chapterDescribe
				+ ", testWay=" + testWay + ", chapterStater=" + chapterStater
				+ ", ppaperTabs=" + ppaperTabs + ", qquestionTabs="
				+ qquestionTabs + ", progressStudys=" + progressStudys
				+ ", sysPostTab=" + sysPostTab + "]";
	}
	
}

