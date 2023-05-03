package com.mealkitland.subscribe.controller;

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
import com.mealkitland.subscribe.dao.SubscribeDAO;
import com.mealkitland.subscribe.domain.SubscribeDTO;

public class SubscribeOkController implements Action{

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();
		resp.setContentType("text/html; charset = utf-8");
//		Long userId = (Long)req.getAttribute("userId");
		SubscribeDAO subscribeDAO = new SubscribeDAO();
		Long userId = 1L;
		JSONArray jsonAr = new JSONArray();
		List<SubscribeDTO> list = list = subscribeDAO.select(userId);
		list.stream().map(c -> new JSONObject(c)).forEach(jsonAr::put);
		req.setAttribute("jsonAr", jsonAr.toString());

		result.setPath("/templates/hdh/mypage2.jsp");
		return result;
		
		
		
		
		
	}
	
}
