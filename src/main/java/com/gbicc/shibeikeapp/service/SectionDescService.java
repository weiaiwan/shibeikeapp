package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.SectionDescTab;

import java.util.List;
import java.util.Map;

public interface SectionDescService {
    /**
     * 根据uerId,获得其所在处室的描述信息
     * @param
     * @return
     */
    public List<SectionDescTab> getSectionDesc(String userId);
    /**
     * 根据处室code 查询所有处室信息,根据时间排序
     * @param
     */
    public List<SectionDescTab> getByDesc(Map<String, Object> map)throws Exception;
    /**
     * 修改岗位描述
     * @param sectionDescTab
     */
    public void updateDesc(SectionDescTab sectionDescTab)throws Exception;
    /**
     * 增加岗位描述
     * @param sectionDescTab
     */
    public void addDesc(SectionDescTab sectionDescTab)throws Exception;
    /**
     * 查询总共有多少条处室描述信息
     * @return
     */
    public Integer countByDesc(Map<String, Object> map)throws Exception;
    /**
     * 处室code查询该处室的所有历史记录
     * @param code
     * @return
     */
    public List<SectionDescTab> getRecord(String code);

    /**
     * 删除一条处室信息
     */
    public void deleteDesc(String id);
    /**
     * 查询所有处室信息
     * @return
     */
    public List<SectionDescTab> getAllSectionDescTab(Map<String, Object> map);
    /**
     * 根据处室描述信息ID查询
     * @param scId
     * @return
     */
    public SectionDescTab getSection(String scId);
    /**
     * 根据处室code删除
     */
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
