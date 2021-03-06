package com.caipiao.lottery.dao.sport;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.caipiao.lottery.entity.sport.SportFootballAward;
import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAwardSearch;

public interface SportFootballAwardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportFootballAward record);

    int insertSelective(SportFootballAward record);

    SportFootballAward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportFootballAward record);

    int updateByPrimaryKey(SportFootballAward record);
    
    void addSportFootballAwards(@Param("awards")List<SportFootballAward> awards);

    void updateSportFootballAwards(@Param("awards")List<SportFootballAward> awards);

	List<SportFootballAward> selectBySearch(SportFootballMatchAwardSearch search);
}