package com.caipiao.lottery.service.sport;

import java.util.List;

import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAward;

/**
 * 竞彩足球数据保存服务类
 * @author WangBin
 *
 */
public interface SportFootballDataService {
	public void saveFootballData(List<SportFootballMatchAward> list);
}
