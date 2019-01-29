package com.zwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.ArticleBiz;
import com.zwx.biz.impl.ArticleBizImpl;

public class DeleteQzServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		  doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 request.setCharacterEncoding("UTF-8");
         int nId=Integer.parseInt(request.getParameter("nId"));
         ArticleBiz articleBiz=new ArticleBizImpl();
           int res= articleBiz.deleteArticle(nId);
           if(res>0){
          request.getRequestDispatcher("qzlist.jsp").forward(request, response);;
           }
	}

}
