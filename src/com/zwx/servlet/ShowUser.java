package com.zwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.UserBiz;
import com.zwx.biz.impl.UserBizImpl;
import com.zwx.entity.User;

public class ShowUser extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		int uId=0;
		if (request.getParameter("uId")!=null) {
			uId=Integer.parseInt(request.getParameter("uId"));
		}
		
		UserBiz userBiz=new UserBizImpl();
		User user=userBiz.getUserById(uId);
		if (user!=null) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("userShow.jsp").forward(request, response);
		}

	}

}
