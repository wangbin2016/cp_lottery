package com.caipiao.lottery.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.common.redis.RedisUtils;
import com.caipiao.lottery.constant.SportFootballConstant;
import com.caipiao.lottery.dao.sport.SportFootballAwardMapper;
import com.caipiao.lottery.dao.sport.SportFootballMatchMapper;
import com.caipiao.lottery.dao.sport.SportLeagueInfoMapper;
import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.entity.sport.SportLeagueInfo;
import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAward;
import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAwardSearch;
import com.caipiao.lottery.service.SportFootballDataService;

/**
 * 竞彩足球对阵数据数据库更新处理类
 * @author wangb
 *
 */
@Service()
public class SportFootballDataServiceImpl implements SportFootballDataService {

	@Autowired
	SportLeagueInfoMapper sportLeagueInfoMapper;
	@Autowired
	SportFootballAwardMapper sportFootballAwardMapper;
	@Autowired
	SportFootballMatchMapper sportFootballMatchMapper;  
	
	/**
	 * 更新或者插入到数据库
	 */
	public void saveOrUpdateFootballData(List<SportFootballMatchAward> list) {
		List<SportFootballMatch> addMatchList = new ArrayList<SportFootballMatch>();//新增阵数数据
		List<SportFootballAward> addAwardList = new ArrayList<SportFootballAward>();//新增sp数据
		
		List<SportFootballMatch> updateMatchList = new ArrayList<SportFootballMatch>();//对阵数据更新
		List<SportFootballAward> updateAwardList = new ArrayList<SportFootballAward>();//sp数据更新
				
		List<SportFootballMatchAward> matchAwardCacheList = getCacheData();//取缓存数据
		for(SportFootballMatchAward matchAward:list) {
			boolean cacheHasMatch = false;//默认没有数据
			for(SportFootballMatchAward matchAwardCache:matchAwardCacheList) {
				if(matchAward.getId() == matchAwardCache.getId()) {
					cacheHasMatch = true;//有数据
					//对阵数据比较
					if(!matchAward.compareData().equals(matchAwardCache.compareData())) {
						updateMatchList.add(matchAward);
					}
					
					//sp比较
					if(!matchAward.getSportFootballAward().compareData().equals(matchAwardCache.getSportFootballAward().compareData())) {
						updateAwardList.add(matchAward.getSportFootballAward());
					}
				}
			}
			
			if(!cacheHasMatch) {//缓存没有数据
				addMatchList.add(matchAward);
				addAwardList.add(matchAward.getSportFootballAward());
			}
		}
		
		/**
		 * 增加新对阵数据到数据库
		 */
		if(addMatchList.size() > 0)
			sportFootballMatchMapper.addSportFootballMatchs(addMatchList);
		if(addAwardList.size() > 0)
			sportFootballAwardMapper.addSportFootballAwards(addAwardList);
		
		/**
		 * 更新数据到数据库
		 */
		if(updateMatchList.size() > 0)
			sportFootballMatchMapper.updateSportFootballMatchs(updateMatchList);
		if(updateAwardList.size() > 0)
			sportFootballAwardMapper.updateSportFootballAwards(updateAwardList);
	}
	
	/**
	 * 查询对阵数据
	 * @return
	 */
	public List<SportFootballMatchAward> findSportFootballMatchAward(SportFootballMatchAwardSearch search){
		List<SportFootballMatchAward> list = new ArrayList<SportFootballMatchAward>();
		List<SportFootballMatch>  matchs = sportFootballMatchMapper.selectBySearch(search);
		List<SportFootballAward>  awards = sportFootballAwardMapper.selectBySearch(search);		
		//
		StringBuffer sb = new StringBuffer();
		for(SportFootballMatch match:matchs) {
			sb.append(match.getLeagueInfoId()).append(",");
			SportFootballMatchAward matchAward = new SportFootballMatchAward(match);
			for(SportFootballAward award:awards) {
				if(award.getId() == match.getId()) {
					matchAward.setSportFootballAward(award);
					break;
				}
			}
		}
		String leagueInfo = sb.substring(0, sb.length()-1);
		
		//查询联赛信息
		List<SportLeagueInfo> leagueInfoList = sportLeagueInfoMapper.selectByIds(leagueInfo);
		for(SportFootballMatch match:matchs) {
			sb.append(match.getLeagueInfoId()).append(",");
			SportFootballMatchAward matchAward = new SportFootballMatchAward(match);
			for(SportLeagueInfo info:leagueInfoList) {
				if(info.getId() == match.getLeagueInfoId()) {
					matchAward.setSportLeagueInfo(info);
					break;
				}
			}
		}
		
		return list;
	}
	
	
	/**
	 * 取缓存中的对阵数据
	 * @return
	 */
	public List<SportFootballMatchAward> getCacheData(){
		List<SportFootballMatchAward> listMatchAward = RedisUtils.getList(SportFootballConstant.MATCH_AWARD_KEY,null);
		if(listMatchAward == null || listMatchAward.size() ==0) {
			SportFootballMatchAwardSearch search = new SportFootballMatchAwardSearch();
			search.setStatus(1);
			listMatchAward = findSportFootballMatchAward(search);
			RedisUtils.setList(SportFootballConstant.MATCH_AWARD_KEY, listMatchAward);			
		}
		return listMatchAward;
	}
}