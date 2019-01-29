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

public class AjaxLogin extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		  doPost(request, response);
		  
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          
		request.setCharacterEncoding("UTF-8");
		String loginId=request.getParameter("userid");
		String  loginPwd=request.getParameter("userpwd");
		 
		UserBiz userBiz=new UserBizImpl();
	     User user=	userBiz.login(loginId, loginPwd);
		String str="";
	     if(user!=null){
	    	 request.getSession().setAttribute("CURRENT_USER", user);
	        str="true";
	     }else{
	    	 str="false";
	     }
	     response.setContentType("text/plain; charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.write(str);
		out.flush();
		out.close();
	}

}
