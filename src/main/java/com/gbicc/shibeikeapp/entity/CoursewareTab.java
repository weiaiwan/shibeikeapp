package com.gbicc.shibeikeapp.entity;

import java.util.List;

public class CoursewareTab {
	/**
	 * coursewareId
	 * courseware_id
	 */
	private String coursewareId;
	/**
	 * coursewareTitle
	 * courseware_title(标题)
	 */
	private String coursewareTitle;
	/**
	 * coursewareUrl
	 * courseware_url(地址)
	 */
	private String coursewareUrl;
	
	/**
	 * chapterId
	 * CHAPTER_ID(章节ID)
	 */
	private String chapterId;
	
	/**
	 * courseware_state(课件状态)
	 */
	private String coursewareState;
	
	private String coursewareUfileUrl;
	
	/*private String coursewareType;
	
	public String getCoursewareType() {
		return coursewareType;
	}
	public void setCoursewareType(String coursewareType) {
		this.coursewareType = coursewareType;
	}*/
	public String getCoursewareUfileUrl() {
		return coursewareUfileUrl;
	}
	public void setCoursewareUfileUrl(String coursewareUfileUrl) {
		this.coursewareUfileUrl = coursewareUfileUrl;
	}
	public String getCoursewareState() {
		return coursewareState;
	}
	public void setCoursewareState(String coursewareState) {
		this.coursewareState = coursewareState;
	}
	public String getCoursewareId() {
		return coursewareId;
	}
	public void setCoursewareId(String coursewareId) {
		this.coursewareId = coursewareId;
	}
	public String getCoursewareTitle() {
		return coursewareTitle;
	}
	public void setCoursewareTitle(String coursewareTitle) {
		this.coursewareTitle = coursewareTitle;
	}
	public String getCoursewareUrl() {
		return coursewareUrl;
	}
	public void setCoursewareUrl(String coursewareUrl) {
		this.coursewareUrl = coursewareUrl;
	}
	public String getChapterId() {
		return chapterId;
	}
	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}
	
}
