package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.SysUserChap;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository("sysUserChapDao")
public interface SysUserChapDao {
	public void addUserChap(SysUserChap userChap);
	public void updateUserChap(SysUserChap userChap);
	public SysUserChap getChapUser(Map map);
	
}
