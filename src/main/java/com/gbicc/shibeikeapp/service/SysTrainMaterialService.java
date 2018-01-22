package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SysTrainMaterialTab;

import java.util.List;


public interface SysTrainMaterialService {
	
		/**
		 * 根据条件查询资料总数
		 * @param map
		 * @return
		 */
		public Integer getCount();
		/**
		 * 查询所有的资料
		 * @return
		 */
		public List<SysTrainMaterialTab> getMaterial();
		/**
		 * 根据trainMaterialId获得对应的url
		 * @return
		 */
		public String getUrlByTrainMaterialId(String trainMaterialId);
		/**
		 * 根据trainMaterialId获得对应的FILENAME
		 * @return
		 */
		public String getFileNameByTrainMaterialId(String trainMaterialId);


}
