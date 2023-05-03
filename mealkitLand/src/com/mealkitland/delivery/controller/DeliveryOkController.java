package com.mealkitland.delivery.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mealkitland.Action;
import com.mealkitland.Result;
import com.mealkitland.delivery.dao.DeliveryDAO;
import com.mealkitland.delivery.domain.DeliveryDTO;

public class DeliveryOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Result result = new Result();
		DeliveryDAO deliverDAO = new DeliveryDAO();
		Long userId = 1L;
		JSONArray jsonAr = new JSONArray();
		List<DeliveryDTO> list = list = deliverDAO.select(userId);
		list.stream().map(c -> new JSONObject(c)).forEach(jsonAr::put);

		req.setAttribute("jsonAr", jsonAr.toString());

		result.setPath("/templates/hdh/mypage3.jsp");

		return result;
	}
}
