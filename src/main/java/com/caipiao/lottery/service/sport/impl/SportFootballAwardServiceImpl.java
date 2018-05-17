package com.caipiao.lottery.service.sport.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.lottery.dao.sport.SportFootballAwardMapper;
import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.service.sport.SportFootballAwardService;

@Service()
public class SportFootballAwardServiceImpl implements SportFootballAwardService {
	@Autowired
	private SportFootballAwardMapper sportFootballAwardMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return sportFootballAwardMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SportFootballAward record) {
		return sportFootballAwardMapper.insert(record);
	}

	@Override
	public int insertSelective(SportFootballAward record) {
		return sportFootballAwardMapper.insertSelective(record);
	}

	@Override
	public SportFootballAward selectByPrimaryKey(Integer id) {
		return sportFootballAwardMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SportFootballAward record) {
		return sportFootballAwardMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SportFootballAward record) {
		return sportFootballAwardMapper.updateByPrimaryKey(record);
	}

}