package com.zwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.ArticleBiz;
import com.zwx.biz.impl.ArticleBizImpl;
import com.zwx.entity.Article;

public class ShowYs extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		doPost(request, response);
		   
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int nId=0;
		if (request.getParameter("nId")!=null) {
			nId=Integer.parseInt(request.getParameter("nId"));
		}
		
		ArticleBiz articleBiz=new ArticleBizImpl();
		Article article=articleBiz.getArticleById(nId);
		if (article!=null) {
			request.setAttribute("ys", article);
			request.getRequestDispatcher("ysShow.jsp").forward(request, response);
		}
		
	}

}
