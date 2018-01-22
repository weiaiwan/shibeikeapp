package com.gbicc.shibeikeapp.service.impl;

import com.gbicc.shibeikeapp.dao.ChapterTabDao;
import com.gbicc.shibeikeapp.entity.ChapterTab;
import com.gbicc.shibeikeapp.service.ChapterTabService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service(value="chapterTabService")
public class ChapterServiceImpl implements ChapterTabService {
	@Resource
	private ChapterTabDao chapterTabDao;
	public void setChapterTabDao(ChapterTabDao chapterTabDao) {
		this.chapterTabDao = chapterTabDao;
	}
	
	
	@Override
	public List<ChapterTab> getChapName() {
		return chapterTabDao.getChapName();
	}

	@Override
	public List<ChapterTab> getChap(Map<String, Object> map) {
		return chapterTabDao.getChap(map);
	}

	@Override
	public void AddChap(ChapterTab chapterTab) {
		chapterTabDao.AddChap(chapterTab);
	}

	@Override
	public int countChap(Map<String, Object> map) {
		return chapterTabDao.countChap(map);
	}

	@Override
	public List<ChapterTab> getcourseType() {
		return chapterTabDao.getcourseType();
	}

	@Override
	public List<ChapterTab> getprofessionalName() {
		return chapterTabDao.getprofessionalName();
	}

	@Override
	public List<ChapterTab> getcourseName() {
		return chapterTabDao.getcourseName();
	}
	/**
	 *把审核中的数据变成已审核  
	 */
	@Override
	public void updateChap(ChapterTab chap)throws RuntimeException {
		if (chap.getChapterId().isEmpty()) {
			throw new RuntimeException("系统繁忙!");
		}
		if (chap.getChapterStater().equals("已审核")
				|| chap.getChapterStater().equals("驳回")) {
			chapterTabDao.updateChap(chap);
		} else {
			throw new RuntimeException("对不起!系统繁忙!");
		}
	}
	
	/**
	 * 根据id查询
	 */
	@Override
	public ChapterTab getIdChaper(String paperId)throws RuntimeException {
		if(paperId==null){
			throw new RuntimeException("系统繁忙!");
		}
		ChapterTab chapterTab = chapterTabDao.getIdChaper(paperId);
		if(chapterTab==null){
			throw new RuntimeException("系统错误!");
		}
		return chapterTab;
	}

	@Override
	public void updateChaper(ChapterTab chapterTab) {
		// TODO Auto-generated method stub
		chapterTabDao.updateChaper(chapterTab);
	}

	@Override
	public void updateChaperSta(Map<String, Object> map) {
		// TODO Auto-generated method stub
		chapterTabDao.updateChaperSta(map);
	}

	@Override
	public List<ChapterTab>  getPageChaper(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getPageChaper(map);
	}


	@Override
	public List<ChapterTab> getChapTrain(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getChapTrain(map);
	}
	
	@Override
	public List<ChapterTab> getChapTrains(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getChapTrains(map);
	}

	@Override
	public List<ChapterTab> getChaperName(Map map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getChaperName(map);
	}

	@Override
	public int countChapTrain(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.countChapTrain(map);
	}

	@Override
	public int findChap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.findChap(map);
	}

	@Override
	public List<ChapterTab> getChapup(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getChapup(map);
	}

	@Override
	public void deleteChapter(String chapterId) {
		// TODO Auto-generated method stub
		chapterTabDao.deleteChapter(chapterId);
	}

	@Override
	public void deleteChaps(String chapterId) {
		chapterTabDao.deleteChaps(chapterId);
	}
	@Override
	public String getname(String urls) {
		return chapterTabDao.getname(urls);
	}


	@Override
	public List<ChapterTab> getRecode(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getRecode(map);
	}


	@Override
	public int getRecodecount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getRecodecount(map);
	}


	@Override
	public List<ChapterTab> getChapTrainByoffice(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getChapTrainByoffice(map);
	}


	@Override
	public int countChapByoffice(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.countChapByoffice(map);
	}

	@Override
	public List<ChapterTab> getTenCourse(Map<String, Object> map) {
		return chapterTabDao.getTenCourse(map);
	}


	@Override
	public void updateJurisType(Map<String, Object> map) {
		// TODO Auto-generated method stub
		chapterTabDao.updateJurisType(map);
	}


	@Override
	public List<ChapterTab> getFH(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getFH(map);
	}


	@Override
	public List<ChapterTab> getGK(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getGK(map);
	}


	@Override
	public List<ChapterTab> getLieBieCourse(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getLieBieCourse(map);
	}


	@Override
	public List<String> selectTrainerPhone() {
		// TODO Auto-generated method stub
		return chapterTabDao.selectTrainerPhone();
	}


	@Override
	public int selectLYCount(Map<String, String> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.selectLYCount(map);
	}


	@Override
	public List<ChapterTab> selectNeiBu(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.selectNeiBu(map);
	}


	@Override
	public int selectNBCount(Map<String, String> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.selectNBCount(map);
	}


	@Override
	public List<String> selectChapterOffice() {
		// TODO Auto-generated method stub
		return chapterTabDao.selectChapterOffice();
	}


	@Override
	public int selectCountNeiBu(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.selectCountNeiBu(map);
	}


	@Override
	public int getRecodecount2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getRecodecount2(map);
	}


	@Override
	public List<ChapterTab> getRecode2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return chapterTabDao.getRecode2(map);
	}

}
