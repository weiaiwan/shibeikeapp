package com.gbicc.shibeikeapp.dao;

import com.gbicc.shibeikeapp.entity.SectionDescTab;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("sectionDescTabDao")
public interface SectionDescTabDao {
    public List<SectionDescTab> getSectionDesc(String userId);

    public List<SectionDescTab> getByDesc(Map<String, Object> map);

    public void updateDesc(SectionDescTab sectionDescTab);

    public void addDesc(SectionDescTab sectionDescTab);

    public Integer countByDesc(Map<String, Object> map);

    public List<SectionDescTab> getRecord(String code);

    public void deleteDesc(String id);

    public List<SectionDescTab> getAllSectionDescTab(Map<String, Object> map);

    public SectionDescTab getSection(String scId);

    public void delDescBysectionCode(String sectionCode);

    //监察室
    public List<SectionDescTab> getSectionDescjcs();
    //教育中心
    public List<SectionDescTab> getSectionDescjyzx();
    //大数据中心
    public List<SectionDescTab> getSectionDescdsjzrs();
    //贸外处
    public List<SectionDescTab> getSectionDescmwc();
    //大数据中心数据处
    public List<SectionDescTab> getSectionDescdsjsjc();
    //大数据中心监测处
    public List<SectionDescTab> getSectionDescdsjjcc();
    //大数据中心运行处
    public List<SectionDescTab> getSectionDescdsjyxc();
    //大数据中心应用服务处
    public List<SectionDescTab> getSectionDescdsjfwc();
    //普调中心主任室
    public List<SectionDescTab> getSectionDescpdzrs();
    //普调中心城乡调查处
    public List<SectionDescTab> getSectionDescpddcc();
    //普调中心社情民意处
    public List<SectionDescTab> getSectionDescpdsqmyc();
    //普调中心名录处
    public List<SectionDescTab> getSectionDescpdmlc();
    //普调中心普查处
    public List<SectionDescTab> getSectionDescpdpcc();
    //两总师
    public List<SectionDescTab> getSectionDesclzs();
    //咨询中心
    public List<SectionDescTab> getSectionDesczxzx();
    //普查调调中心
    public List<SectionDescTab> getSectionDescpdzx();


    public List<SectionDescTab> getSectionDescrsc();

    public List<SectionDescTab> getSectionDescrbg();

    public List<SectionDescTab> getSectionDescxx();

    public List<SectionDescTab> getSectionDescgh();

    public List<SectionDescTab> getSectionDescfg();

    public List<SectionDescTab> getSectionDescsg();

    public List<SectionDescTab> getSectionDescrk();

    public List<SectionDescTab> getSectionDesczh();

    public List<SectionDescTab> getSectionDescnc();

    public List<SectionDescTab> getSectionDescgy(Map map);

    public List<SectionDescTab> getSectionDescny();

    public List<SectionDescTab> getSectionDesctz();

    public List<SectionDescTab> getSectionDescdy();

    public List<SectionDescTab> getSectionDescsk();

    public List<SectionDescTab> getSectionDescfwy();

    public List<SectionDescTab> getSectionDescjgdw();

    public List<SectionDescTab> getSectionDescbg();
}
