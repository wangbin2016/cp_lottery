package com.caipiao.lottery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caipiao.lottery.dao.sport.SportLeagueInfoMapper;
import com.caipiao.lottery.entity.sport.SportLeagueInfo;
import com.caipiao.lottery.service.SportLeagueInfoService;
@Service()
public class SportLeagueInfoServiceImpl implements SportLeagueInfoService {	
	@Autowired
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
		System.out.println("id::"+id);
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

	@Override
	public SportLeagueInfo selectByLikeName(String name) {
		return sportLeagueInfoMapper.selectByLikeName(name);
	}

	@Override
	public int selectTableId() {
		Integer id = sportLeagueInfoMapper.selectTableId();
		return id==null?1001:id+1;
	}
}