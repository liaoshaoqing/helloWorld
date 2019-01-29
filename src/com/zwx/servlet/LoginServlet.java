package com.zwx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.UserBiz;
import com.zwx.biz.impl.UserBizImpl;
import com.zwx.entity.User;

public class LoginServlet extends HttpServlet {
        
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	      doPost(req, resp);
	}
	@Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        		throws ServletException, IOException {
        	  String loginId=req.getParameter("userid"); 
		       String loginpwd=req.getParameter("userpwd");
		       UserBiz userBiz =new UserBizImpl();
        	  User user= userBiz.login(loginId, loginpwd);
        	    if(user!=null){
        	      req.getSession().setAttribute("CURRENT_USER", user);
        	      resp.sendRedirect("main.html");
        	    }
        	    else{
        	    	resp.sendRedirect("login.jsp");
        	    }
        }
}
