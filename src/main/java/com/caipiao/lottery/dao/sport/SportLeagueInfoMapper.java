package com.caipiao.lottery.dao.sport;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.caipiao.lottery.entity.sport.SportLeagueInfo;

public interface SportLeagueInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportLeagueInfo record);

    int insertSelective(SportLeagueInfo record);

    SportLeagueInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportLeagueInfo record);

    int updateByPrimaryKey(SportLeagueInfo record);
   
    void addSportLeagueInfos(@Param("infos")List<SportLeagueInfo> infos);

    @Select("select * from Sport_League_Info where name=#{name} or short_name=#{name} or dc_name=#{name}  or jc_name=#{name} ")
	SportLeagueInfo selectByLikeName(String name);
    
    @Select("SELECT MAX(id) FROM Sport_League_Info")
	Integer selectTableId();
}