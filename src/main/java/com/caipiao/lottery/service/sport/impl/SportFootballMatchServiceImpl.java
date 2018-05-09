package com.caipiao.lottery.service.sport.impl;

import org.springframework.stereotype.Service;

import com.caipiao.lottery.dao.sport.SportFootballMatchMapper;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.service.sport.SportFootballMatchService;

@Service("sportFootballMatchService")
public class SportFootballMatchServiceImpl implements SportFootballMatchService {
	private SportFootballMatchMapper sportFootballMatchMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return sportFootballMatchMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SportFootballMatch record) {
		return sportFootballMatchMapper.insert(record);
	}

	@Override
	public int insertSelective(SportFootballMatch record) {
		return sportFootballMatchMapper.insertSelective(record);
	}

	@Override
	public SportFootballMatch selectByPrimaryKey(Integer id) {
		return sportFootballMatchMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SportFootballMatch record) {
		return sportFootballMatchMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SportFootballMatch record) {
		return sportFootballMatchMapper.updateByPrimaryKey(record);
	}
}