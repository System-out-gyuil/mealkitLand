package com.mealkitland.cart;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mealkitland.Result;
import com.mealkitland.cart.controller.CartOkController;

public class CartFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().replace(req.getContextPath()+"/", "").split("\\.")[0];
		req.setCharacterEncoding("UTF-8");
		Result result = null;
		System.out.println(target);
		
		if(target.equals("cartOk")) {
			System.out.println("들어옴");
			result = new CartOkController().execute(req, resp);
			
			
			
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
		doGet(req,resp);
	}
}
