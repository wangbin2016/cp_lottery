package com.caipiao.lottery.service;

import java.util.List;

import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAward;
import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAwardSearch;

/**
 * 竞彩足球数据保存服务类
 * @author WangBin
 *
 */
public interface SportFootballDataService {
	
	/**
	 * 保存或者更新抓取到的对阵数据
	 * @param list
	 */
	public void saveOrUpdateFootballData(List<SportFootballMatchAward> list);
	
	/**
	 * 数据库存查询对阵数据
	 * @param search
	 * @return
	 */
	public List<SportFootballMatchAward> findSportFootballMatchAward(SportFootballMatchAwardSearch search);
}
