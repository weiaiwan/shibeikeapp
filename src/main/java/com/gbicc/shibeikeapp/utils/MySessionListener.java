package com.gbicc.shibeikeapp.utils;

import com.gbicc.shibeikeapp.entity.SysUserTab;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class MySessionListener implements HttpSessionListener{

	 public void sessionCreated(HttpSessionEvent httpSessionEvent) {
		 System.out.println("session 创建");
		    MySessionContext.AddSession(httpSessionEvent.getSession());
		    }
	 
	 
		    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
		 	Map<String, String> params = new HashMap<String, String>();  
	        HttpSession session = httpSessionEvent.getSession();
	        String add=String.valueOf(session.getAttribute("add"));
	        String port=String.valueOf(session.getAttribute("port"));
	        SysUserTab u=(SysUserTab) session.getAttribute("login_user");
	        ResourceBundle rb = ResourceBundle.getBundle("config");
		/*	String authCode = rb.getString("logurl");*/
			if(u!=null){
				System.out.println("juhiuhu9999");
			String xml = HttpXmlClient.post("http://"+add+":"+port+"/ExamSystem/login/logtc.action?UserId="+u.getUserId(),params );
			System.out.println("juhiuhu9999ddddddddddddddddddddddd");
			}
			String sessionid=httpSessionEvent.getSession().getId();
		    	 System.out.println("session 销毁");
		        MySessionContext.DelSession(session);
		    }
}
