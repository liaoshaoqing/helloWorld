package com.zwx.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.UserBiz;
import com.zwx.biz.impl.UserBizImpl;
import com.zwx.entity.User;

public class UserEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	doPost(req, resp);
    } 
	
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String type=req.getParameter("type");
		UserBiz userBiz =new UserBizImpl();
		if(type.equals("modify")){
	         int userId=Integer.parseInt(req.getParameter("userId"));
	         User user= userBiz.getUserById(userId);
	         req.setAttribute("user", user);
	         //转发
	         req.getRequestDispatcher("updateUser.jsp").forward(req, resp);
		}else if(type.equals("doModify")){
			 int userId=Integer.parseInt(req.getParameter("userid"));
			 String loginId=req.getParameter("loginid");
			 String loginPwd=req.getParameter("userpwd");
			 String realName=req.getParameter("realname");
			 Date birthday=Date.valueOf(req.getParameter("birthday"));
			 String gender=req.getParameter("gender");
			 String address=req.getParameter("address");
			 String email=req.getParameter("email");
			 String QQ=req.getParameter("qq");
			 String phone=req.getParameter("phone");
			 
			 User user =new User(userId, loginId, loginPwd, realName, gender, birthday, phone, QQ, email, address);
			 int res= userBiz.modifyUser(user);
			 if(res>0){
				 resp.sendRedirect("UserListServlet");
			 }
		}else{
			//新增
			 String loginId=req.getParameter("loginid");
			 String loginPwd=req.getParameter("userpwd");
			 String realName=req.getParameter("realname");
			 Date birthday=Date.valueOf(req.getParameter("birthday"));
			 String gender=req.getParameter("gender");
			 String address=req.getParameter("address");
			 String email=req.getParameter("email");
			 String QQ=req.getParameter("qq");
			 String phone=req.getParameter("phone");
			 
			 User user =new User();
			 user.setAddress(address);
			 user.setBirthday(birthday);
			 user.setEmail(email);
			 user.setGender(gender);
			 user.setLoginId(loginId);
			 user.setLoginPwd(loginPwd);
			 user.setPhone(phone);
			 user.setQq(QQ);
			 user.setRealName(realName);
		     int res= userBiz.addUser(user);
		     if(res>0){
		    	 resp.sendRedirect("UserListServlet");
		     }
		}
}
}
