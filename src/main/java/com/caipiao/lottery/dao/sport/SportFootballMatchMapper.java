package com.caipiao.lottery.dao.sport;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caipiao.lottery.entity.sport.SportFootballMatch;

public interface SportFootballMatchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportFootballMatch record);

    int insertSelective(SportFootballMatch record);

    SportFootballMatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportFootballMatch record);

    int updateByPrimaryKey(SportFootballMatch record);
    
    void addSportFootballMatchs(@Param("matchs")List<SportFootballMatch> matchs);
}