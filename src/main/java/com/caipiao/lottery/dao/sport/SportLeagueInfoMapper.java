package com.caipiao.lottery.dao.sport;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caipiao.lottery.entity.sport.SportLeagueInfo;

public interface SportLeagueInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportLeagueInfo record);

    int insertSelective(SportLeagueInfo record);

    SportLeagueInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportLeagueInfo record);

    int updateByPrimaryKey(SportLeagueInfo record);
   
    void addSportLeagueInfos(@Param("infos")List<SportLeagueInfo> infos);

	SportLeagueInfo selectByLikeName(String name);

	Integer selectTableId();
}