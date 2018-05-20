package com.caipiao.lottery;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.caipiao.lottery.dao.sport.SportFootballMatchMapper;
import com.caipiao.lottery.entity.sport.SportFootballMatch;
import com.caipiao.lottery.entity.sport.vo.SportFootballMatchAwardSearch;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class DatabseTest {
	
	
	@Before
	public void befor() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		SportFootballMatchMapper sport= (SportFootballMatchMapper)ac.getBean("sportFootballMatchMapper");
		DruidDataSource dataSource = (DruidDataSource)ac.getBean("dataSource");
		SportFootballMatchAwardSearch search = new SportFootballMatchAwardSearch();
		search.setGreaterIntime("0180518");
		List<SportFootballMatch> list = sport.selectBySearch(search);
		System.out.println(dataSource.getUsername() +"   "+dataSource.getPassword()+ "  list.size:::" +list.size());
		log.info("初始化配置");
		ac.toString();
	}
	
	//@Test
	public void exe() {
	}
	
	public static void main(String[] args) {
		String path = DatabseTest.class.getClassLoader().getResource("/").getPath();
		System.out.println(path);
	
	}
	
	@Test
	public void find() {
	}
	
	@After
	public void after() {
		log.info("测试完成");
	}
}
