package com.caipiao.lottery.service.sport;

import com.caipiao.lottery.entity.sport.SportFootballMatch;

public interface SportFootballMatchService {
    int deleteByPrimaryKey(Integer id);

    int insert(SportFootballMatch record);

    int insertSelective(SportFootballMatch record);

    SportFootballMatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportFootballMatch record);

    int updateByPrimaryKey(SportFootballMatch record);
}