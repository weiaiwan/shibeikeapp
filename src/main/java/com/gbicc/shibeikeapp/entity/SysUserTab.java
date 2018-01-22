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


public class SysUserTab implements java.io.Serializable{
    /**
     * 用户ID       db_column: USER_ID 
     */	
	private String userId;

    /**
     * 角色ID       db_column: ROLE_ID 
     */	
	private String roleId;
    /**
     * 真实姓名       db_column: USER_NAME 
     */	
	private String userName;
    /**
     * 身份证       db_column: IDENTIFY 
     */	
	private String identify;
    /**
     * 性别       db_column: SEX 
     */	
	private String sex;
    /**
     * 出生日期       db_column: BIRTH_TIME 
     */	
	
	private java.sql.Date birthTime;
    /**
     * 教育证书编号       db_column: CERTIFICATE 
     */	
	private String certificate;
    /**
     * 部门编号       db_column: DEPT_CODE 
     */	
	private String deptCode;
    /**
     * 邮政编码       db_column: CODING 
     */	
	private String coding;
    /**
     * 职位       db_column: POSITION 
     */	
	private String position;
    /**
     * 电子邮箱       db_column: EAMIL 
     */	
	private String eamil;
    /**
     * 手机       db_column: PHONE 
     */	
	
	private Long phone;
    /**
     * 联系电话(座机)       db_column: LANDLINE 
     */	
	private String landline;
    /**
     * 文化程度       db_column: CULTURE 
     */	
	private String culture;
    /**
     * 用户状态       db_column: USER_STATE 
     */	
	private Boolean userState;
    /**
     * 注册时间       db_column: TIME 
     */	
	
	private java.sql.Date time;
    /**
     * 参加培训项目       db_column: JOIN_PROJECT 
     */	
	private String joinProject;
    /**
     * 用户编号       db_column: USER_CODE 
     */	
	private String userCode;
    /**
     * 密码       db_column: USER_PASS 
     */	
	private String userPass;
	/**
	 * 角色名称  db_column: ROLE_NAME
	 */
	private String roleName;
	/**
	 * 是否是部门内（部门true/企业false）
	 */
	private Boolean within;
	/**
	 * 用户排序列
	 */
	private String sorting;
	/**
	 * 企业类别
	 */
	private String ec_id;
	/**
	 * 企业名称
	 */
	private String enterpriseName;
	/**
	 * 企业类别
	 */
	private EnterpriseCategory category;
	/**
	 * 用户下的分管权限
	 */
	private List<DistributionAuth> daList;
	/**
	 * 用户所拥有的岗位
	 */
	private List<SysPostTab> postList;
	/**
	 * 联系地址
	 */
	private String address;
	/**
	 * 登陆名
	 */
	private String loginName;
	/**
	 * 岗位名称
	 */
	private String postName;
	/**
	 * 职称
	 */
	private String title;
	//columns END
	
	private  String citybureau;
	/**
	 * sessionId
	 */
	private String sessionId;
	/**
	 * 错误次数
	 * @return
	 */
	private String wrongCount;
	/**
	 * 密码修改时间
	 * @return
	 */
	private Date updatePwdTime;
	
	/**
	 * 微信的openid
	 * @return
	 */
	private String openId;
	
	/**
	 * 微信的头像
	 * 
	 */
	private String logo;
	/**
	 * 微信昵称
	 * @return
	 */
	private String nickName ;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getWrongCount() {
		return wrongCount;
	}

	public void setWrongCount(String wrongCount) {
		this.wrongCount = wrongCount;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getCitybureau() {
		return citybureau;
	}

	public void setCitybureau(String citybureau) {
		this.citybureau = citybureau;
	}

	public SysUserTab(){
	}

	public List<SysPostTab> getPostList() {
		return postList;
	}

	public void setPostList(List<SysPostTab> postList) {
		this.postList = postList;
	}

	public Boolean getWithin() {
		return within;
	}

	public void setWithin(Boolean within) {
		this.within = within;
	}
	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public SysUserTab(
		String userId
	){
		this.userId = userId;
	}

	public void setUserId(String value) {
		this.userId = value;
	}

	public List<DistributionAuth> getDaList() {
		return daList;
	}

	public void setDaList(List<DistributionAuth> daList) {
		this.daList = daList;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUserId() {
		return this.userId;
	}
	
	public EnterpriseCategory getCategory() {
		return category;
	}

	public void setCategory(EnterpriseCategory category) {
		this.category = category;
	}

	public String getSorting() {
		return sorting;
	}

	public void setSorting(String sorting) {
		this.sorting = sorting;
	}

	public void setRoleId(String value) {
		this.roleId = value;
	}
	
	public String getEc_id() {
		return ec_id;
	}

	public void setEc_id(String ec_id) {
		this.ec_id = ec_id;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setIdentify(String value) {
		this.identify = value;
	}
	
	public String getIdentify() {
		return this.identify;
	}
	public void setSex(String value) {
		this.sex = value;
	}
	
	public String getSex() {
		return this.sex;
	}
	public void setBirthTime(java.sql.Date value) {
		this.birthTime = value;
	}
	
	public java.sql.Date getBirthTime() {
		return this.birthTime;
	}
	public void setCertificate(String value) {
		this.certificate = value;
	}
	
	public String getCertificate() {
		return this.certificate;
	}
	public void setDeptCode(String value) {
		this.deptCode = value;
	}
	
	public String getDeptCode() {
		return this.deptCode;
	}
	public void setCoding(String value) {
		this.coding = value;
	}
	
	public String getCoding() {
		return this.coding;
	}
	public void setPosition(String value) {
		this.position = value;
	}
	
	public String getPosition() {
		return this.position;
	}
	public void setEamil(String value) {
		this.eamil = value;
	}
	
	public String getEamil() {
		return this.eamil;
	}
	public void setPhone(Long value) {
		this.phone = value;
	}
	
	public Long getPhone() {
		return this.phone;
	}
	public void setLandline(String value) {
		this.landline = value;
	}
	
	public String getLandline() {
		return this.landline;
	}
	public void setCulture(String value) {
		this.culture = value;
	}
	
	public String getCulture() {
		return this.culture;
	}
	public Boolean getUserState() {
		return userState;
	}

	public void setUserState(Boolean userState) {
		this.userState = userState;
	}

	public void setTime(java.sql.Date value) {
		this.time = value;
	}
	public java.sql.Date getTime() {
		return this.time;
	}
	public void setJoinProject(String value) {
		this.joinProject = value;
	}
	
	public String getJoinProject() {
		return this.joinProject;
	}
	public void setUserCode(String value) {
		this.userCode = value;
	}
	
	public String getUserCode() {
		return this.userCode;
	}
	public void setUserPass(String value) {
		this.userPass = value;
	}
	
	public String getUserPass() {
		return this.userPass;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpdatePwdTime() {
		return updatePwdTime;
	}

	public void setUpdatePwdTime(Date updatePwdTime) {
		this.updatePwdTime = updatePwdTime;
	}
	

}

