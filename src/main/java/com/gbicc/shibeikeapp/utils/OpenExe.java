package com.gbicc.shibeikeapp.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OpenExe extends HttpServlet{
	public static void openExe(String file) {  
        Runtime rn = Runtime.getRuntime();  
        Process p = null;  
        try {  
            p = rn.exec("D:/The entertainment software/QvodPlayer/QvodPlayer.exe "+file);  
        } catch (Exception e) {  
            System.out.println("Error exec!");  
        }  
    }  
      
    //打开本地播放器并播放视频  
        public static void openExe1() {  
            Runtime rn = Runtime.getRuntime();  
            Process p = null;  
            try {  
                p = rn.exec("\"D:/The entertainment software/QvodPlayer/QvodPlayer.exe\" F:/movie and mv/11.f4v");  
            } catch (Exception e) {  
                System.out.println("Error exec!");  
            }  
        }  
  
  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        this.doPost(request, response);  
        /*openExe1();*/  
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        String bofile =request.getParameter("file");  
        openExe(bofile);  
    }  
}
