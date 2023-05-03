package com.mealkitland.delivery;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mealkitland.Result;
import com.mealkitland.delivery.controller.DeliveryOkController;

public class DeliveryFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().replace(req.getContextPath()+"/", "").split("\\.")[0];
		req.setCharacterEncoding("UTF-8");
		Result result = null;
		System.out.println(target);
		
		if(target.equals("deliveryOk")) {
			System.out.println("들어옴");
			result = new DeliveryOkController().execute(req, resp);
			
			
			
		}
		
		if(result!=null) {
			
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
