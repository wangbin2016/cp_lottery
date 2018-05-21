package com.caipiao.lottery.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		SportFootballMatchAward mAward = list.get(0);
		String intime = mAward.getIntTime();
		List<SportFootballMatch> addMatchList = new ArrayList<SportFootballMatch>();
		List<SportFootballMatch> updateMatchList = new ArrayList<SportFootballMatch>();
		List<SportFootballAward> addAwardList = new ArrayList<SportFootballAward>();
		List<SportFootballAward> updateAwardList = new ArrayList<SportFootballAward>();
		for(SportFootballMatchAward matchAward:list) {
			
			
			
			addMatchList.add(matchAward);
			addAwardList.add(matchAward.getSportFootballAward());
		}
		
		/**
		 * 增加新对阵数据到数据库
		 */
		sportFootballMatchMapper.addSportFootballMatchs(addMatchList);
		sportFootballAwardMapper.addSportFootballAwards(addAwardList);
		
		/**
		 * 更新数据到数据库
		 */
		sportFootballMatchMapper.updateSportFootballMatchs(updateMatchList);
		sportFootballAwardMapper.updateSportFootballAwards(updateAwardList);
	}
	
	/**
	 * 查询数据的对阵数据
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
	private List<SportFootballMatchAward> getCacheData(String intime){
		Map<String,SportFootballMatchAward> mapMatchData = RedisUtils.getMapAll(SportFootballConstant.MATCH_AWARD_KEY,null);
		if(mapMatchData == null || mapMatchData.size() ==0) {
			
		}
		return null;
	}
	
	public boolean dataHasChange(List<?> list) {
		
		
		
		
		return  false;
	}
	
}