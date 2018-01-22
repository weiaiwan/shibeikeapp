package com.gbicc.shibeikeapp.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Map;
import java.util.UUID;



public class KeyGenerator{
    private static Logger log = LoggerFactory.getLogger(KeyGenerator.class);
	
    /**
	 * 
	* @Title: genTransFlowNo 
	* @Description: 生成流水号
	* @return    设定文件 
	* @return String    返回类型 
	* @throws 
	* @author Administrator
	 */
	public synchronized static String genTransFlowNo() {
		Calendar cal = Calendar.getInstance();
		return Integer.toString(cal.get(Calendar.HOUR_OF_DAY) * 10000 + cal.get(Calendar.MINUTE) * 100 + cal.get(Calendar.SECOND));
	}
	
	/**
	 * 
	* @Title: genTransFlowNo 
	* @Description: 生成流水号
	* @param i
	* @return    设定文件 
	* @return String    返回类型 
	* @throws 
	* @author Administrator
	 
	* @version V1.0
	 */
	public synchronized static String genTransFlowNo(int i) {
		Calendar cal = Calendar.getInstance();
		return Integer.toString(250000 + cal.get(Calendar.MINUTE) * 100 + cal.get(Calendar.SECOND)+i);
	}

	
	
	/**
	 * 获取UUID
	 * 
	 * @Title: getUUID
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 设定文件
	 * @return String 返回类型
	 * @throws
	 * @author Administrator
	 
	 * @version V1.0
	 */
	public static String getUUID() {
		try {
			String uuid = UUID.randomUUID().toString().replace("-", "");
			return uuid;
		} catch (Exception e) {
			e.printStackTrace();
			throw new GbiccJsmoException("工具类底层异常，错误信息：" + e.getMessage());
		}
	}

	public static String getCode(Map paramMap){
		
		return "" ;
	}
}
