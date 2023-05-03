package com.mealkitland.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mealkitland.Action;
import com.mealkitland.Result;
import com.mealkitland.cart.dao.CartDAO;
import com.mealkitland.cart.domain.CartDTO;

public class CartOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();
		CartDAO cartDAO = new CartDAO();
		Long userId = 1L;
		JSONArray jsonAr = new JSONArray();
		List<CartDTO> list = list = cartDAO.select(userId);
		list.stream().map(c -> new JSONObject(c)).forEach(jsonAr::put);
		
		
		req.setAttribute("jsonAr", jsonAr.toString());
		
		
	
		
		result.setPath("/templates/hdh/mypage5.jsp");
		
		return result;
	}



}
