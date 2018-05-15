package com.caipiao.lottery.service.sport;

import com.caipiao.lottery.entity.sport.SportLeagueInfo;

public interface SportLeagueInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(SportLeagueInfo record);

    int insertSelective(SportLeagueInfo record);

    SportLeagueInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportLeagueInfo record);

    int updateByPrimaryKey(SportLeagueInfo record);

    /**
     * 根据联赛名字查联赛信息
     * @param name 联赛名字
     */
    SportLeagueInfo selectByLikeName(String name);
    
    int selectTableId();
    
}