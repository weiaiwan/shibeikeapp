package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.CourseCenterDao;
import com.gbicc.shibeikeapp.entity.ChapterTab;
import com.gbicc.shibeikeapp.service.CourseCenterService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service(value="courseCenterService")
public class CourseCenterServiceImpl implements CourseCenterService {
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    @Resource
    private CourseCenterDao courseCenterDao;
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    public void setCourseCenterDao(CourseCenterDao courseCenterDao) {
        this.courseCenterDao = courseCenterDao;
    }

    public List<String> showAllSection(){
        SqlSession session = sqlSessionFactory.openSession();
        List sectionList = session.selectList("showAllSection");
        session.close();
        return sectionList;
    }
    public List<String> showCourseType(String chapterOffice){
        SqlSession session = sqlSessionFactory.openSession();
        List courseTypeList = session.selectList("showCourseType",chapterOffice);
        session.close();
        return courseTypeList;
    }
    public List<Integer> calCourseType(String chapterOffice){
        SqlSession session = sqlSessionFactory.openSession();
        List calCourseType = session.selectList("calCourseType",chapterOffice);
        session.close();
        return calCourseType;
    }
    /**
     * chapterOffice courseType
     */
    public List<String> showprofessionalName(Map map){
        SqlSession session = sqlSessionFactory.openSession();
        List professionalNameList = session.selectList("showprofessionalName",map);
        session.close();
        return professionalNameList;
    }
    public List<Integer> calprofessionalName(Map map){
        SqlSession session = sqlSessionFactory.openSession();
        List calprofessionalName = session.selectList("calprofessionalName",map);
        session.close();
        return calprofessionalName;
    }
    public List<ChapterTab> showCourse(Map map){
        SqlSession session = sqlSessionFactory.openSession();
        List courseList = session.selectList("showCourse",map);
        session.close();
        return courseList;
    }
    public int calCourse(Map map){
        SqlSession session = sqlSessionFactory.openSession();
        int calCourse = session.selectOne("calCourse",map);
        session.close();
        return calCourse;
    }
    @Override
    public int calCourseByChapterOffice(String chapterOffice) {
        return courseCenterDao.calCourseByChapterOffice(chapterOffice);
    }
    @Override
    public List<ChapterTab> showCourse1(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse1(map);
    }
    @Override
    public int calCourse1(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse1(map);

    }

    @Override
    public List<ChapterTab> showCourse2(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse2(map);
    }
    @Override
    public int calCourse2(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse2(map);

    }

    @Override
    public List<ChapterTab> showCourse3(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse3(map);
    }
    @Override
    public int calCourse3(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse3(map);

    }

    @Override
    public List<ChapterTab> showCourse4(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse4(map);
    }
    @Override
    public int calCourse4(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse4(map);

    }

    @Override
    public List<ChapterTab> showCourse5(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse5(map);
    }
    @Override
    public int calCourse5(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse5(map);

    }

    @Override
    public List<ChapterTab> showCourse6(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse6(map);
    }
    @Override
    public int calCourse6(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse6(map);

    }

    @Override
    public List<ChapterTab> showCourse7(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse7(map);
    }
    @Override
    public int calCourse7(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse7(map);

    }

    @Override
    public List<ChapterTab> showCourse8(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse8(map);
    }
    @Override
    public int calCourse8(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse8(map);

    }
    //领导
    @Override
    public List<String> showCourseTypeld() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypeld();
    }
    @Override
    public List<Integer> calCourseTypeld() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypeld();
    }
    @Override
    public List<ChapterTab> showCourseld(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseld(map);
    }
    @Override
    public int calCourseld(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseld(map);
    }
    //监察室
    @Override
    public List<String> showCourseTypejcs() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypejcs();
    }
    @Override
    public List<Integer> calCourseTypejcs() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypejcs();
    }
    @Override
    public List<ChapterTab> showCoursejcs(Map map){
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursejcs(map);
    }
    @Override
    public int calCoursejcs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursejcs(map);
    }
    //教育中心
    @Override
    public List<String> showCourseTypejyzx() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypejyzx();
    }
    @Override
    public List<Integer> calCourseTypejyzx() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypejyzx();
    }
    @Override
    public List<ChapterTab> showCoursejyzx(Map map){
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursejyzx(map);
    }
    @Override
    public int calCoursejyzx(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursejyzx(map);
    }

    @Override
    public List<String> showCourseType1() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseType1();
    }
    @Override
    public List<Integer> calCourseType1() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseType1();
    }
    //2.
    @Override
    public List<String> showCourseTypegh() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypegh();
    }
    @Override
    public List<Integer> calCourseTypegh() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypegh();
    }
    @Override
    public List<ChapterTab> showCoursegh(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursegh(map);
    }
    @Override
    public int calCoursegh(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursegh(map);
    }
    //3.
    @Override
    public List<String> showCourseTypebg() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypebg();
    }
    @Override
    public List<Integer> calCourseTypebg() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypebg();
    }
    @Override
    public List<ChapterTab> showCoursebg(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursebg(map);
    }
    @Override
    public int calCoursebg(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursebg(map);
    }
    //4.
    @Override
    public List<String> showCourseTypexx() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypexx();
    }
    @Override
    public List<Integer> calCourseTypexx() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypexx();
    }
    @Override
    public List<ChapterTab> showCoursexx(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursexx(map);
    }
    @Override
    public int calCoursexx(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursexx(map);
    }
    //6.
    @Override
    public List<String> showCourseTypefg() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypefg();
    }
    @Override
    public List<Integer> calCourseTypefg() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypefg();
    }
    @Override
    public List<ChapterTab> showCoursefg(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursefg(map);
    }
    @Override
    public int calCoursefg(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursefg(map);
    }
    //7.
    @Override
    public List<String> showCourseTypesg() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypesg();
    }
    @Override
    public List<Integer> calCourseTypesg() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypesg();
    }
    @Override
    public List<ChapterTab> showCoursesg(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursesg(map);
    }
    @Override
    public int calCoursesg(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursesg(map);
    }
    //8.
    @Override
    public List<String> showCourseTyperk() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTyperk();
    }
    @Override
    public List<Integer> calCourseTyperk() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTyperk();
    }
    @Override
    public List<ChapterTab> showCourserk(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourserk(map);
    }
    @Override
    public int calCourserk(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourserk(map);
    }
    //9.
    @Override
    public List<String> showCourseTypezh() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypezh();
    }
    @Override
    public List<Integer> calCourseTypezh() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypezh();
    }
    @Override
    public List<ChapterTab> showCoursezh(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursezh(map);
    }
    @Override
    public int calCoursezh(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursezh(map);
    }
    //10.
    @Override
    public List<String> showCourseTypenc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypenc();
    }
    @Override
    public List<Integer> calCourseTypenc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypenc();
    }
    @Override
    public List<ChapterTab> showCoursenc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursenc(map);
    }
    @Override
    public int calCoursenc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursenc(map);
    }
    //11.
    @Override
    public List<String> showCourseTypegy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypegy(map);
    }
    @Override
    public List<Integer> calCourseTypegy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypegy(map);
    }
    @Override
    public List<ChapterTab> showCoursegy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursegy(map);
    }
    @Override
    public int calCoursegy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursegy(map);
    }
    //12.
    @Override
    public List<String> showCourseTypeny() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypeny();
    }
    @Override
    public List<Integer> calCourseTypeny() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypeny();
    }
    @Override
    public List<ChapterTab> showCourseny(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseny(map);
    }
    @Override
    public int calCourseny(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseny(map);
    }
    //13.
    @Override
    public List<String> showCourseTypetz() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypetz();
    }
    @Override
    public List<Integer> calCourseTypetz() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypetz();
    }
    @Override
    public List<ChapterTab> showCoursetz(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursetz(map);
    }
    @Override
    public int calCoursetz(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursetz(map);
    }
    //14.
    @Override
    public List<String> showCourseTypedy() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypedy();
    }
    @Override
    public List<Integer> calCourseTypedy() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypedy();
    }
    @Override
    public List<ChapterTab> showCoursedy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursedy(map);
    }
    @Override
    public int calCoursedy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursedy(map);
    }
    //15.
    @Override
    public List<String> showCourseTypesk() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypesk();
    }
    @Override
    public List<Integer> calCourseTypesk() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypesk();
    }
    @Override
    public List<ChapterTab> showCoursesk(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursesk(map);
    }
    @Override
    public int calCoursesk(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursesk(map);
    }
    //15.
    @Override
    public List<String> showCourseTypefwy() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypefwy();
    }
    @Override
    public List<Integer> calCourseTypefwy() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypefwy();
    }
    @Override
    public List<ChapterTab> showCoursefwy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursefwy(map);
    }
    @Override
    public int calCoursefwy(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursefwy(map);
    }
    //16.
    @Override
    public List<String> showCourseTypejgdw() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypejgdw();
    }
    @Override
    public List<Integer> calCourseTypejgdw() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypejgdw();
    }
    @Override
    public List<ChapterTab> showCoursejgdw(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursejgdw(map);
    }
    @Override
    public int calCoursejgdw(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursejgdw(map);
    }

    @Override
    public List<String> showCourseTypedsjzrs() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypedsjzrs();
    }
    @Override
    public List<Integer> calCourseTypedsjzrs() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypedsjzrs();
    }
    @Override
    public List<ChapterTab> showCoursedsjzrs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursedsjzrs(map);
    }
    @Override
    public int calCoursedsjzrs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursedsjzrs(map);
    }
    @Override
    public List<String> showCourseTypemwc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypemwc();
    }
    @Override
    public List<Integer> calCourseTypemwc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypemwc();
    }
    @Override
    public List<ChapterTab> showCoursemwc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursemwc(map);
    }
    @Override
    public int calCoursemwc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursemwc(map);
    }
    @Override
    public List<String> showCourseTypedsjsjc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypedsjsjc();
    }
    @Override
    public List<Integer> calCourseTypedsjsjc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypedsjsjc();
    }
    @Override
    public List<ChapterTab> showCoursedsjsjc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursedsjsjc(map);
    }
    @Override
    public int calCoursedsjsjc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursedsjsjc(map);
    }
    @Override
    public List<String> showCourseTypedsjjcc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypedsjjcc();
    }
    @Override
    public List<Integer> calCourseTypedsjjcc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypedsjjcc();
    }
    @Override
    public List<ChapterTab> showCoursedsjjcc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursedsjjcc(map);
    }
    @Override
    public int calCoursedsjjcc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursedsjjcc(map);
    }
    @Override
    public List<String> showCourseTypedsjyxc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypedsjyxc();
    }
    @Override
    public List<Integer> calCourseTypedsjyxc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypedsjyxc();
    }
    @Override
    public List<ChapterTab> showCoursedsjyxc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursedsjyxc(map);
    }
    @Override
    public int calCoursedsjyxc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursedsjyxc(map);
    }
    @Override
    public List<String> showCourseTypedsjyyfw() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypedsjyyfw();
    }
    @Override
    public List<Integer> calCourseTypedsjyyfw() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypedsjyyfw();
    }
    @Override
    public List<ChapterTab> showCoursedsjyyfw(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursedsjyyfw(map);
    }
    @Override
    public int calCoursedsjyyfw(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursedsjyyfw(map);
    }
    @Override
    public List<String> showCourseTypepdzrs() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypepdzrs();
    }
    @Override
    public List<Integer> calCourseTypepdzrs() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypepdzrs();
    }
    @Override
    public List<ChapterTab> showCoursepdzrs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursepdzrs(map);
    }
    @Override
    public int calCoursepdzrs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursepdzrs(map);
    }
    @Override
    public List<String> showCourseTypepddcc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypepddcc();
    }
    @Override
    public List<Integer> calCourseTypepddcc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypepddcc();
    }
    @Override
    public List<ChapterTab> showCoursepddcc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursepddcc(map);
    }
    @Override
    public int calCoursepddcc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursepddcc(map);
    }
    @Override
    public List<String> showCourseTypepdsqmyc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypepdsqmyc();
    }
    @Override
    public List<Integer> calCourseTypepdsqmyc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypepdsqmyc();
    }
    @Override
    public List<ChapterTab> showCoursepdsqmyc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursepdsqmyc(map);
    }
    @Override
    public int calCoursepdsqmyc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursepdsqmyc(map);
    }
    @Override
    public List<String> showCourseTypepdmlc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypepdmlc();
    }
    @Override
    public List<Integer> calCourseTypepdmlc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypepdmlc();
    }
    @Override
    public List<ChapterTab> showCoursepdmlc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursepdmlc(map);
    }
    @Override
    public int calCoursepdmlc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursepdmlc(map);
    }
    @Override
    public List<String> showCourseTypepdpcc() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypepdpcc();
    }
    @Override
    public List<Integer> calCourseTypepdpcc() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypepdpcc();
    }
    @Override
    public List<ChapterTab> showCoursepdpcc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursepdpcc(map);
    }
    @Override
    public int calCoursepdpcc(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursepdpcc(map);
    }
    @Override
    public List<String> showCourseTypelzs() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypelzs();
    }
    @Override
    public List<Integer> calCourseTypelzs() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypelzs();
    }
    @Override
    public List<ChapterTab> showCourselzs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourselzs(map);
    }
    @Override
    public int calCourselzs(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourselzs(map);
    }
    @Override
    public List<String> showCourseTypepdzx() {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourseTypejyzx();
    }
    @Override
    public List<Integer> calCourseTypepdzx() {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourseTypejyzx();
    }
    @Override
    public List<ChapterTab> showCoursepdzx(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCoursepdzx(map);
    }
    @Override
    public int calCoursepdzx(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCoursepdzx(map);
    }
    @Override
    public List<ChapterTab> showCourse44(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse44(map);
    }
    @Override
    public int calCourse44(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse44(map);
    }
    @Override
    public List<ChapterTab> showCourse45(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.showCourse45(map);
    }
    @Override
    public int calCourse45(Map map) {
        // TODO Auto-generated method stub
        return courseCenterDao.calCourse45(map);
    }

}
