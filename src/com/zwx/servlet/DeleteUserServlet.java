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

public class DeleteUserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		int userId = Integer.parseInt(req.getParameter("userId"));
		if (req.getSession().getAttribute("CURRENT_USER") == null) {
			resp.sendRedirect("login.jsp");
		} else {
			User user = (User) req.getSession().getAttribute("CURRENT_USER");
			if (userId != user.getUid()) {
				UserBiz userBiz = new UserBizImpl();
				int res = userBiz.deleteUser(userId);
				if (res > 0) {
					resp.sendRedirect("UserListServlet");
				}
			} else {
				resp.setCharacterEncoding("UTF-8");
				PrintWriter out = resp.getWriter();
				out.write("<script type='text/javascript'>alert('没有删除自己的权限！');location.href='UserListServlet';</script>");
				out.flush();
				out.close();
			}
		}

	}
}
