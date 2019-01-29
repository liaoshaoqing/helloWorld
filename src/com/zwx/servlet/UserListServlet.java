package com.zwx.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.UserBiz;
import com.zwx.biz.impl.UserBizImpl;
import com.zwx.entity.User;

public class UserListServlet extends HttpServlet {
  
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doPost(req, resp);
	}
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		int PageSize=5;
		int PageIndex=1;
		if(req.getParameter("pIndex")!=null){
			PageIndex=Integer.parseInt(req.getParameter("pIndex"));
			
		}
       UserBiz userBiz =new UserBizImpl();
       List<User> list=  userBiz.getUserPage(PageIndex, PageSize);
       int ucount=userBiz.getUserCounts();
       int pcount=userBiz.getPageCount(PageSize);
         if(list.size()>0){
        	//把list放入request作用域中
        	req.setAttribute("ulist", list);
        	//转发
        	req.setAttribute("ucount", ucount);
        	req.setAttribute("pcount", pcount);
        	req.setAttribute("PageIndex", PageIndex);
        	req.getRequestDispatcher("userlist.jsp").forward(req, resp);
        	
         }
}
}
