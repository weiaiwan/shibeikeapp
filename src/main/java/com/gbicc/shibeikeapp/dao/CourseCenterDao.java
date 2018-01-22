package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.ChapterTab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository("courseCenterDao")
public interface CourseCenterDao {
    /**
     *  查询出所有的处室
     * @return
     */
    public List<String> showAllSection();
    /**
     * 根据处室查询出所有课程类型
     */
    public List<String> showCourseType(String chapterOffice);
    /**
     * 根据处室查询出课程类型的数量
     */
    public List<Integer> calCourseType(String chapterOffice);
    /**
     * 根据处室和课程类型查询出专业类别
     * chapterOffice courseType
     */
    public List<String> showprofessionalName(Map map);
    /**
     * 根据处室和课程类型查询出专业类别的数量
     */
    public List<Integer> calprofessionalName(Map map);
    /**
     * 根据不同的条件查询课程 chapterOffice courseType professionalName courseName
     */
    public List<ChapterTab> showCourse(Map map);

    /**
     * 根据不同的条件查询课程的数量
     */
    public int calCourse(Map map);

    /**
     * 根据处室名称查询出所有课程的数量
     * @param chapterOffice
     * @return
     */
    public int calCourseByChapterOffice(String chapterOffice);
    //统计规范化建设
    public List<ChapterTab> showCourse45(Map map);
    public int calCourse45(Map map);

    //统计监测
    public List<ChapterTab> showCourse44(Map map);
    public int calCourse44(Map map);

    //普查调查
    public List<ChapterTab> showCourse1(Map map);
    public int calCourse1(Map map);

    public List<ChapterTab> showCourse2(Map map);
    public int calCourse2(Map map);


    public List<ChapterTab> showCourse3(Map map);
    public int calCourse3(Map map);

    public List<ChapterTab> showCourse4(Map map);
    public int calCourse4(Map map);

    public List<ChapterTab> showCourse5(Map map);
    public int calCourse5(Map map);

    public List<ChapterTab> showCourse6(Map map);
    public int calCourse6(Map map);

    public List<ChapterTab> showCourse7(Map map);
    public int calCourse7(Map map);

    public List<ChapterTab> showCourse8(Map map);
    public int calCourse8(Map map);

    //咨询中心
    public List<String> showCourseTypeld();
    public List<Integer> calCourseTypeld();
    public List<ChapterTab> showCourseld(Map map);
    public int calCourseld(Map map);
    //监察室
    public List<String> showCourseTypejcs();
    public List<Integer> calCourseTypejcs();
    public List<ChapterTab> showCoursejcs(Map map);
    public int calCoursejcs(Map map);
    //教育中心
    public List<String> showCourseTypejyzx();
    public List<Integer> calCourseTypejyzx();
    public List<ChapterTab> showCoursejyzx(Map map);
    public int calCoursejyzx(Map map);
    //大数据中心主任室
    public List<String> showCourseTypedsjzrs();
    public List<Integer> calCourseTypedsjzrs();
    public List<ChapterTab> showCoursedsjzrs(Map map);
    public int calCoursedsjzrs(Map map);
    //贸外处
    public List<String> showCourseTypemwc();
    public List<Integer> calCourseTypemwc();
    public List<ChapterTab> showCoursemwc(Map map);
    public int calCoursemwc(Map map);
    //大数据中心数据处
    public List<String> showCourseTypedsjsjc();
    public List<Integer> calCourseTypedsjsjc();
    public List<ChapterTab> showCoursedsjsjc(Map map);
    public int calCoursedsjsjc(Map map);
    //大数据中心监测处
    public List<String> showCourseTypedsjjcc();
    public List<Integer> calCourseTypedsjjcc();
    public List<ChapterTab> showCoursedsjjcc(Map map);
    public int calCoursedsjjcc(Map map);
    //大数据中心运行处
    public List<String> showCourseTypedsjyxc();
    public List<Integer> calCourseTypedsjyxc();
    public List<ChapterTab> showCoursedsjyxc(Map map);
    public int calCoursedsjyxc(Map map);
    //大数据中心应用服务处
    public List<String> showCourseTypedsjyyfw();
    public List<Integer> calCourseTypedsjyyfw();
    public List<ChapterTab> showCoursedsjyyfw(Map map);
    public int calCoursedsjyyfw(Map map);
    //普调中心主任室
    public List<String> showCourseTypepdzrs();
    public List<Integer> calCourseTypepdzrs();
    public List<ChapterTab> showCoursepdzrs(Map map);
    public int calCoursepdzrs(Map map);
    //普调中心城乡调查处
    public List<String> showCourseTypepddcc();
    public List<Integer> calCourseTypepddcc();
    public List<ChapterTab> showCoursepddcc(Map map);
    public int calCoursepddcc(Map map);
    //普调中心社情民意处
    public List<String> showCourseTypepdsqmyc();
    public List<Integer> calCourseTypepdsqmyc();
    public List<ChapterTab> showCoursepdsqmyc(Map map);
    public int calCoursepdsqmyc(Map map);
    //普调中心名录处
    public List<String> showCourseTypepdmlc();
    public List<Integer> calCourseTypepdmlc();
    public List<ChapterTab> showCoursepdmlc(Map map);
    public int calCoursepdmlc(Map map);
    //普调中心普查处
    public List<String> showCourseTypepdpcc();
    public List<Integer> calCourseTypepdpcc();
    public List<ChapterTab> showCoursepdpcc(Map map);
    public int calCoursepdpcc(Map map);
    //两总师
    public List<String> showCourseTypelzs();
    public List<Integer> calCourseTypelzs();
    public List<ChapterTab> showCourselzs(Map map);
    public int calCourselzs(Map map);
    //普查调查
    public List<String> showCourseTypepdzx();
    public List<Integer> calCourseTypepdzx();
    public List<ChapterTab> showCoursepdzx(Map map);
    public int calCoursepdzx(Map map);



    /**
     * 根据处室查询出所有课程类型
     */
    public List<String> showCourseType1();
    /**
     * 根据处室查询出课程类型的数量
     */
    public List<Integer> calCourseType1();

    //2.
    public List<String> showCourseTypegh();
    public List<Integer> calCourseTypegh();
    public List<ChapterTab> showCoursegh(Map map);
    public int calCoursegh(Map map);

    //3.
    public List<String> showCourseTypebg();
    public List<Integer> calCourseTypebg();
    public List<ChapterTab> showCoursebg(Map map);
    public int calCoursebg(Map map);

    //4.
    public List<String> showCourseTypexx();
    public List<Integer> calCourseTypexx();
    public List<ChapterTab> showCoursexx(Map map);
    public int calCoursexx(Map map);

    //5.
    public List<String> showCourseTypefg();
    public List<Integer> calCourseTypefg();
    public List<ChapterTab> showCoursefg(Map map);
    public int calCoursefg(Map map);

    //6.
    public List<String> showCourseTypesg();
    public List<Integer> calCourseTypesg();
    public List<ChapterTab> showCoursesg(Map map);
    public int calCoursesg(Map map);

    //7.
    public List<String> showCourseTyperk();
    public List<Integer> calCourseTyperk();
    public List<ChapterTab> showCourserk(Map map);
    public int calCourserk(Map map);

    //8.
    public List<String> showCourseTypezh();
    public List<Integer> calCourseTypezh();
    public List<ChapterTab> showCoursezh(Map map);
    public int calCoursezh(Map map);

    //9.
    public List<String> showCourseTypenc();
    public List<Integer> calCourseTypenc();
    public List<ChapterTab> showCoursenc(Map map);
    public int calCoursenc(Map map);

    //10.
    public List<String> showCourseTypegy(Map map);
    public List<Integer> calCourseTypegy(Map map);
    public List<ChapterTab> showCoursegy(Map map);
    public int calCoursegy(Map map);

    //11.
    public List<String> showCourseTypeny();
    public List<Integer> calCourseTypeny();
    public List<ChapterTab> showCourseny(Map map);
    public int calCourseny(Map map);

    //12.
    public List<String> showCourseTypetz();
    public List<Integer> calCourseTypetz();
    public List<ChapterTab> showCoursetz(Map map);
    public int calCoursetz(Map map);

    //13.
    public List<String> showCourseTypedy();
    public List<Integer> calCourseTypedy();
    public List<ChapterTab> showCoursedy(Map map);
    public int calCoursedy(Map map);

    //14.
    public List<String> showCourseTypesk();
    public List<Integer> calCourseTypesk();
    public List<ChapterTab> showCoursesk(Map map);
    public int calCoursesk(Map map);

    //15.
    public List<String> showCourseTypefwy();
    public List<Integer> calCourseTypefwy();
    public List<ChapterTab> showCoursefwy(Map map);
    public int calCoursefwy(Map map);

    //16.
    public List<String> showCourseTypejgdw();
    public List<Integer> calCourseTypejgdw();
    public List<ChapterTab> showCoursejgdw(Map map);
    public int calCoursejgdw(Map map);

}
