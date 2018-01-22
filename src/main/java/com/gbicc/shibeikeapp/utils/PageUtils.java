package com.gbicc.shibeikeapp.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings(value={"unchecked", "rawtypes"})
public class PageUtils {

	private static final String LOGIN_PAGE = "/summit/login_jsp.sec";
	
	/**
	 * 分页公用方法
	 * @param paramMap 
	 * @param order 
	 * @param count 总记录数
	 */
	public static void getPageMap(Map paramMap, PageOrder order,int count){
		if (null == order) {
			order = new PageOrder();
		}
		order.setTotalCount(count);
		paramMap.put("start",(order.getPage()-1)*order.getRows());
		paramMap.put("offset",order.getRows());
		paramMap.put("sort", order.getSort());
		paramMap.put("order",order.getOrder());
	}
	
	
	public static void jumpLoginPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		StringBuilder builder = new StringBuilder();
		builder.append("<script type=\"text/javascript\">");
		builder.append("window.top.location.href='");
		builder.append(LOGIN_PAGE);
		builder.append("';");
		builder.append("</script>");
		out.print(builder.toString());
	}
	
	public static void getPageHome(Map paramMap, PageModel model, int count) {
		if (null == model) {
			model = new PageModel();
		}
		model.setTotalCount(count);
		paramMap.put("start",(model.getPageNo()-1)*model.getPageSize());
		paramMap.put("offset",model.getPageSize());
		paramMap.put("sort", model.getSort());
		paramMap.put("order",model.getOrder());
	}
}
