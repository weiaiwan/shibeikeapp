package com.gbicc.shibeikeapp.entity;

public class ExpertLecture implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	/**
	 * ID
	 */
	private String id;
	/**
	 * 专家名称
	 */
	private String expertName;
	/**
	 * 讲座名称
	 */
	private String lectureTitle;
	/**
	 * 更新时间
	 */
	private String upDate;
	/**
	 * 上传路径
	 */
	private String downLoadUrl;
	/**
	 * 文件类型
	 */
	private String fileType;
	/**
	 * 内容描述
	 */
	private String contantDescribe;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDownLoadUrl() {
		return downLoadUrl;
	}
	public void setDownLoadUrl(String downLoadUrl) {
		this.downLoadUrl = downLoadUrl;
	}
	public String getExpertName() {
		return expertName;
	}
	public void setExpertName(String expertName) {
		this.expertName = expertName;
	}
	public String getLectureTitle() {
		return lectureTitle;
	}
	public void setLectureTitle(String lectureTitle) {
		this.lectureTitle = lectureTitle;
	}
	public String getUpDate() {
		return upDate;
	}
	public void setUpDate(String upDate) {
		this.upDate = upDate;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getContantDescribe() {
		return contantDescribe;
	}
	public void setContantDescribe(String contantDescribe) {
		this.contantDescribe = contantDescribe;
	}
	
}

