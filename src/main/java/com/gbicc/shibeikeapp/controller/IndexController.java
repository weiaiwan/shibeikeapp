package com.gbicc.shibeikeapp.controller;

import com.gbicc.shibeikeapp.entity.ChapterTab;
import com.gbicc.shibeikeapp.service.ChapterTabService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {
    @Resource
    private ChapterTabService chapterTabService;
    @RequestMapping(value = "/getAllChapter/{trainerPhone}")
    public String showIndex(HttpServletRequest req, @PathVariable String trainerPhone){
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String, Object> map1 = new HashMap<String,Object>();
        List<ChapterTab> chapterList  = new ArrayList<ChapterTab>();
        if(!"all".equals(trainerPhone)){
            if("峰会课程".equals(trainerPhone)){
                //查询峰会课程
                chapterList = chapterTabService.getFH(map1);
            }else{
                map1.put("trainerPhone",trainerPhone);
               chapterList = chapterTabService.getLieBieCourse(map1);
            }
        }else{
            chapterList = chapterTabService.getTenCourse(map1);

        }
        map.put("chapterList",chapterList);
        String callback = req.getParameter("callback");
        Gson go =new Gson();
        String json = go.toJson(map);
        return callback+"("+json+")";
    }
    @RequestMapping(value = "/hello")
    public String hello(){

        return "(";
    }
}
