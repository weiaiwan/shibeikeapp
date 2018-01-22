package com.gbicc.shibeikeapp.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DayUtil {
	//得到两个日期之间有多少天
    public static int getDays(Date a, Date b){ 
        List days = new ArrayList();// 日期集合 
            long end = b.getTime(); 
            long begin = a.getTime(); 
            while (begin <= end) { 
                Date day = new Date(); 
                day.setTime(begin); 
                begin += 3600 * 24 * 1000; 
                days.add(day); 
            } 
        return days.size(); 
    }
}
