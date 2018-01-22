package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.sysXuanChuan;

import java.util.List;
import java.util.Map;


public interface sysXuanChuanDao {
    int insert(sysXuanChuan record);

    int insertSelective(Map<String, String> map);

    sysXuanChuan selectByPrimaryKey(String xcId);

    int updateByPrimaryKeySelective(Map<String, String> map);
    int deleteByPrimaryKey(String xcId);

    int updateByPrimaryKeyWithBLOBs(sysXuanChuan record);

    int updateByPrimaryKey(sysXuanChuan record);
    
    
    
    List<sysXuanChuan> selectByName(Map<String, String> map);
}