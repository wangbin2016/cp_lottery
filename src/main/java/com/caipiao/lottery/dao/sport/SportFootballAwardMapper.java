package com.caipiao.lottery.dao.sport;

import com.caipiao.lottery.entity.sport.SportFootballAward;

public interface SportFootballAwardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportFootballAward record);

    int insertSelective(SportFootballAward record);

    SportFootballAward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportFootballAward record);

    int updateByPrimaryKey(SportFootballAward record);
}