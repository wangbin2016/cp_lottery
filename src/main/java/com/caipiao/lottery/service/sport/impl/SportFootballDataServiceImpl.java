package com.caipiao.lottery.service.sport.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.lottery.dao.sport.SportLeagueInfoMapper;
import com.caipiao.lottery.dao.sport.SportFootballAwardMapper;
import com.caipiao.lottery.dao.sport.SportFootballMatchMapper;
import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAward;
import com.caipiao.lottery.service.sport.SportFootballDataService;

@Service("sportFootballDataService")
public class SportFootballDataServiceImpl implements SportFootballDataService {
	@Autowired
	SportLeagueInfoMapper sportLeagueInfoMapper;
	@Autowired
	SportFootballAwardMapper sportFootballAwardMapper;
	@Autowired
	SportFootballMatchMapper sportFootballMatchMapper;
	@Override
	public void saveOrUpdateFootballData(List<SportFootballMatchAward> list) {
		List<SportFootballMatch> matchList = new ArrayList<SportFootballMatch>();
		List<SportFootballAward> awardList = new ArrayList<SportFootballAward>();
		
		for(SportFootballMatchAward matchAward:list) {
			matchList.add(matchAward);
			awardList.add(matchAward.getSportFootballAward());
		}
		if(dataHasChange(matchList)) {
			sportFootballMatchMapper.addSportFootballMatchs(matchList);
		}
		if(dataHasChange(awardList)) {
			sportFootballAwardMapper.addSportFootballAwards(awardList);
		}
	}
	
	public boolean dataHasChange(List<?> list) {
		return false;
	}
	
}