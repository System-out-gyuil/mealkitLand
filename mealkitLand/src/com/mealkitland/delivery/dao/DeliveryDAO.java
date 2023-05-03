package com.mealkitland.delivery.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mealkitland.delivery.domain.DeliveryDTO;
import com.mybatis.config.MyBatisConfig;

public class DeliveryDAO {
	
	public SqlSession sqlSession;
	
	public DeliveryDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	public List<DeliveryDTO> select(Long userId){
		return sqlSession.selectList("delivery.select",userId);
	}

}
