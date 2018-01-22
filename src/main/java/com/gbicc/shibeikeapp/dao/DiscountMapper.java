package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.Discount;

import java.util.List;
import java.util.Map;


public interface DiscountMapper {
    int deleteByPrimaryKey(String id);

    int insert(Discount record);

    int insertSelective(Discount record);

    Discount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
    
    int getDiscountCourCount(Map<String, Object> map);
	
	List<Discount> getListDiscount(Map<String, Object> map);
	Discount getDiscountCode(Map<String, Object> map);
}