package com.caipiao.lottery.service.sport.impl;

import org.springframework.stereotype.Service;

import com.caipiao.lottery.dao.sport.SportLeagueInfoMapper;
import com.caipiao.lottery.entity.sport.SportLeagueInfo;
import com.caipiao.lottery.service.sport.SportLeagueInfoService;
@Service("SportLeagueInfoService")
public class SportLeagueInfoServiceImpl implements SportLeagueInfoService {
	private SportLeagueInfoMapper sportLeagueInfoMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return sportLeagueInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SportLeagueInfo record) {
		return sportLeagueInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(SportLeagueInfo record) {
		return sportLeagueInfoMapper.insertSelective(record);
	}

	@Override
	public SportLeagueInfo selectByPrimaryKey(Integer id) {
		return sportLeagueInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SportLeagueInfo record) {
		return sportLeagueInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SportLeagueInfo record) {
		return sportLeagueInfoMapper.updateByPrimaryKey(record);
	}
}