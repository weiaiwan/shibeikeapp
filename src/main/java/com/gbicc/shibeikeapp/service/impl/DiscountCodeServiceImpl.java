package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.DiscountMapper;
import com.gbicc.shibeikeapp.entity.Discount;
import com.gbicc.shibeikeapp.service.DiscountCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("discountCodeService")
public class DiscountCodeServiceImpl implements DiscountCodeService {
	
	@Autowired
	private DiscountMapper discount;
	
	@Override
	public int getDiscountCourCount(Map<String, Object> map) {
		return discount.getDiscountCourCount(map);
	}

	@Override
	public List<Discount> getListDiscount(Map<String, Object> map) {
		return discount.getListDiscount(map);
	}

	@Override
	public int insertSelective(Discount record) {
		return discount.insertSelective(record);
	}

	@Override
	public Discount getDiscountCode(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return discount.getDiscountCode(map);
	}

}
