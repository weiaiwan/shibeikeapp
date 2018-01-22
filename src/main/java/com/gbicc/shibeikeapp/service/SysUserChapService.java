package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SysUserChap;

import java.util.Map;


public interface SysUserChapService {
	public void addUserChap(SysUserChap userChap);
	public SysUserChap getChapUser(Map map);
	public void updateUserChap(SysUserChap userChap);
}
