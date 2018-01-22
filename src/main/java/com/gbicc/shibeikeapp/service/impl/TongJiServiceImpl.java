package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.TongJiDao;
import com.gbicc.shibeikeapp.entity.PpaperTab;
import com.gbicc.shibeikeapp.entity.SysPostTab;
import com.gbicc.shibeikeapp.service.TongJiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value="tongJiService")
public class TongJiServiceImpl implements TongJiService {
	@Resource
	private TongJiDao tongJiDao;
	public void setTongJiDao(TongJiDao tongJiDao) {
		this.tongJiDao = tongJiDao;
	}
	
	
	@Override
	public List<String> getAllChapter() {
		return tongJiDao.getAllChapter();
	}
	@Override
	public List<String> getAllUnit() {
		return tongJiDao.getAllUnit();
	}
	
	
	@Override
	public int[] shiju(String paperId) {
//		int []str1 = {};
		List listChapter = tongJiDao.getAllChapter();          //获得市局下的所有处室
		int []str1 = new int[listChapter.size()];
		List userIdList = tongJiDao.getGoodUserIdByPaperId(paperId);//获得所有优秀的人员
		for(int i=0;i<userIdList.size();i++){
			SysPostTab post = tongJiDao.getUserConditionByUserId((String)userIdList.get(i));
			if(post.getCityBureau().equals(true)){ //市局人员
				for(int j=0;j<listChapter.size();j++){
					String chapter = (String) listChapter.get(j);
					String sectionName = post.getSections_name();
					if(chapter.equals(sectionName)){
						str1[j]=str1[j]+1;
						break;
					}
					
				}
			}
		}
		return str1;
	}
	
	
	
	@Override
	public int[] shijuNice(String paperId) {
//		int []str1 = {};
		List listChapter = tongJiDao.getAllChapter();
		int []str12 = new int[listChapter.size()];
		List userIdList = tongJiDao.getNiceUserIdByPaperId(paperId); //获取所有合格的人员（除开优秀的人员）
		for(int i=0;i<userIdList.size();i++){
			SysPostTab	post = tongJiDao.getUserConditionByUserId((String)userIdList.get(i));
			if(post.getCityBureau().equals(true)){ //市局人员
				for(int j=0;j<listChapter.size();j++){
					String chapter = (String) listChapter.get(j);
					String sectionName = post.getSections_name();
					if(chapter.equals(sectionName)){
						str12[j]=str12[j]+1;
						break;
					}
					
				}
			}
		}
		return str12;
	}
	
	
	
	
	@Override
	public int[] feishiju(String paperId) {
		List listUnit = tongJiDao.getAllUnit();
		int []str2 = new int[listUnit.size()];
		List userIdList = tongJiDao.getGoodUserIdByPaperId(paperId);
		for(int i=0;i<userIdList.size();i++){
			SysPostTab	post = tongJiDao.getUserConditionByUserId((String)userIdList.get(i));
			if(post.getCityBureau().equals(false)){ //非市局人员
				for(int j=0;j<listUnit.size();j++){
					if(listUnit.get(j).equals(post.getUnitName())){
						str2[j]=str2[j]+1;
					}
				}
			}
		}
		return str2;
	}
	
	@Override
	public int[] feishijuNice(String paperId) {
		List listUnit = tongJiDao.getAllUnit();
		int []str22 = new int[listUnit.size()];
		List userIdList = tongJiDao.getNiceUserIdByPaperId(paperId);
		for(int i=0;i<userIdList.size();i++){
			SysPostTab	post = tongJiDao.getUserConditionByUserId((String)userIdList.get(i));
			if(post.getCityBureau().equals(false)){ //非市局人员
				for(int j=0;j<listUnit.size();j++){
					if(listUnit.get(j).equals(post.getUnitName())){
						str22[j]=str22[j]+1;
					}
				}
			}
		}
		return str22;
	}


	@Override
	public PpaperTab getPaperInfoByPaperId(String paperId) {
		return tongJiDao.getPaperInfoByPaperId(paperId);
	}


	@Override
	public int getJoinNumByPaperId(String paperId) {
		return tongJiDao.getJoinNumByPaperId(paperId);
	}


	@Override
	public int getPassNumByPaperId(String paperId) {
		return tongJiDao.getPassNumByPaperId(paperId);
	}

	//根据paperId查询出所有优秀的userId
	public List<String> getGoodUserIdByPaperId(String paperId){
		return tongJiDao.getGoodUserIdByPaperId(paperId);
	}


	@Override
	public List<SysPostTab> getUnitSection() {
		// TODO Auto-generated method stub
		return tongJiDao.getUnitSection();
	}


	@Override
	public int getNumYx(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getNumYx(map);
	}


	@Override
	public int getNumLh(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getNumLh(map);
	}


	@Override
	public int getJoinNum(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getJoinNum(map);
	}


	@Override
	public int getJoinNumAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getJoinNumAll(map);
	}


	@Override
	public int getUnitSectionNum(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getUnitSectionNum(map);
	}


	@Override
	public int getJoinNum1(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getJoinNum1(map);
	}


	@Override
	public List<SysPostTab> getUnitSectionzh() {
		// TODO Auto-generated method stub
		return tongJiDao.getUnitSectionzh();
	}


	@Override
	public List<String> getUnitAlluserId(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getUnitAlluserId(map);
	}


	@Override
	public List<String> getUnitKsuserId(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tongJiDao.getUnitKsuserId(map);
	}



	
	
	
}
