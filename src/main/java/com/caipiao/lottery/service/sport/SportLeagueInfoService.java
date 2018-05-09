package com.caipiao.lottery.service.sport;

import com.caipiao.lottery.entity.sport.SportLeagueInfo;

public interface SportLeagueInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(SportLeagueInfo record);

    int insertSelective(SportLeagueInfo record);

    SportLeagueInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportLeagueInfo record);

    int updateByPrimaryKey(SportLeagueInfo record);
}