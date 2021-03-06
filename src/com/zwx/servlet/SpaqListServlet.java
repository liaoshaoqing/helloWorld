package com.zwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.ArticleBiz;
import com.zwx.biz.impl.ArticleBizImpl;
import com.zwx.entity.Article;

public class SpaqListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
         int menuId=Integer.parseInt(request.getParameter("menuId"));
         ArticleBiz articleBiz= new ArticleBizImpl();
	    List<Article> qzlist= articleBiz.getArticleByMenuId(menuId);
	    if(qzlist.size()>0){
	    	request.setAttribute("splist", qzlist);
	    	request.getRequestDispatcher("splist.jsp").forward(request, response);
	    }
		
	}

}
