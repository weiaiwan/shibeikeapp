package com.gbicc.shibeikeapp.service;

import com.gbicc.shibeikeapp.entity.PpaperTab;
import com.gbicc.shibeikeapp.entity.SysPostTab;

import java.util.List;
import java.util.Map;


public interface TongJiService {
	
	//获得市局下所有的处室名字
	public List<String> getAllChapter();
	
	//获得非市局下的所有单位名称
	public List<String> getAllUnit();
	
	//获得市局下各处室该试卷考试优秀的员工人数
	public int[] shiju(String paperId);
	
	//获得非市局下各单位该试卷考试优秀的员工人数
	public int[] feishiju(String paperId);
	
	//获得市局下各处室该试卷考试合格的员工人数
	public int[] shijuNice(String paperId);
	
	//获非市局下各单位该试卷考试合格的员工人数
	public int[] feishijuNice(String paperId);
	
	//根据试卷id查询出试卷信息
	public PpaperTab getPaperInfoByPaperId(String paperId);
	
	//根据试卷id查询出参加考试的人数 
	public int getJoinNumByPaperId(String paperId);
	
	//根据试卷id查询出参加考试人中通过的人数
	public int getPassNumByPaperId(String paperId);
	
	//根据paperId查询出所有优秀的userId
	public List<String> getGoodUserIdByPaperId(String paperId);
	
	//查询出所有单位和处室
	public List<SysPostTab>  getUnitSection();
	//得到具体单位处室参加考试得到优秀的人数 
	public int getNumYx(Map<String, Object> map);
	//得到具体单位处室参加考试得到良好的人数 
	public int getNumLh(Map<String, Object> map);
	//获得具体处室参加考试的人数
	public int getJoinNum(Map<String, Object> map);
	public int getJoinNum1(Map<String, Object> map);
	//获得具体处室人数
    public int getJoinNumAll(Map<String, Object> map);
    public int getUnitSectionNum(Map<String, Object> map);
    public List<SysPostTab> getUnitSectionzh();
	/**
	 * 得到对应单位处室的所有人员的userId
	 */
	public List<String> getUnitAlluserId(Map<String, Object> map);
	/**
	 * 得到对应单位处室的参加该套试题考试的人员的userId
	 */
	public List<String> getUnitKsuserId(Map<String, Object> map);
	

}
