package com.mealkitland.subscribe.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mealkitland.subscribe.domain.SubscribeDTO;
import com.mybatis.config.MyBatisConfig;

public class SubscribeDAO {
	public SqlSession sqlSession;
	
	public SubscribeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<SubscribeDTO> select(Long userId ){
		return sqlSession.selectList("subscribe.select",userId);
	}
}