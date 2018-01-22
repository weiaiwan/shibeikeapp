package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.Discount;

import java.util.List;
import java.util.Map;



public interface DiscountCodeService {
	
	int getDiscountCourCount(Map<String, Object> map);
	
	List<Discount> getListDiscount(Map<String, Object> map);
	
	int insertSelective(Discount record);
	Discount getDiscountCode(Map<String, Object> map);
}
