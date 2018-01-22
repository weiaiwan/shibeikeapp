package com.gbicc.shibeikeapp.utils;

import java.util.Timer;
import java.util.TimerTask;

public class ThreadClass{
	 private int a;
	  
	 public int setVal(){
	  int a = 0;
		 System.out.println("进入定时器");
	  Timer timer = new Timer();
	  timer.schedule(new TimerTask() { 
	   @Override
	   public void run() {
		  System.out.println("执行run");
	      setA(1);
	   }
	  }, 1000*60);
	  System.out.println("结束");
	  return a;
	 }
	  
	 public void setA(int a) {
	  this.a = a;
	 }
	 public int getA() {
	  return a;

}
}