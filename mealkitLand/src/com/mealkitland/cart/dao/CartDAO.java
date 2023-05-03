package com.mealkitland.cart.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mealkitland.cart.domain.CartDTO;
import com.mybatis.config.MyBatisConfig;

public class CartDAO {
	public SqlSession sqlSession;
	
	public CartDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	public List<CartDTO> select(Long userId){
		return sqlSession.selectList("cart.select",userId);
	}

}
