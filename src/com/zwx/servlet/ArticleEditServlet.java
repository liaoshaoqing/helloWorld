package com.zwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zwx.biz.ArticleBiz;
import com.zwx.biz.impl.ArticleBizImpl;
import com.zwx.entity.Article;

public class ArticleEditServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		ArticleBiz articleBiz = new ArticleBizImpl();
		if (type.equals("modifyxw")) {
			int nId = Integer.parseInt(request.getParameter("nId"));
			Article article = articleBiz.getArticleById(nId);
			request.setAttribute("article", article);
			// 转发
			request.getRequestDispatcher("updateArticle.jsp").forward(request,
					response);

		} else if (type.equals("doModifyxw")) {
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");
			Article article = new Article(nId, nTitle, nContent, nReleaseTime,
					nClick, nOperator, nFrom, menuId);
			int res = articleBiz.modifyArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("xwlist.jsp").forward(request,
						response);
			}
		} else if (type.equals("addxw")) {
			// 新增新闻
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");

			Article article = new Article();
			article.setnId(nId);
			article.setnTitle(nTitle);
			article.setnReleaseTime(nReleaseTime);
			article.setnClick(nClick);
			article.setnOperator(nOperator);
			article.setnFrom(nFrom);
			article.setMenuId(menuId);
			article.setnContent(nContent);

			int res = articleBiz.addArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("xwlist.jsp").forward(request,
						response);
			}
		} else if (type.equals("modifykp")) {
			int nId = Integer.parseInt(request.getParameter("nId"));
			Article article = articleBiz.getArticleById(nId);
			request.setAttribute("article", article);
			// 转发
			request.getRequestDispatcher("updateKpArticle.jsp").forward(
					request, response);
		} else if (type.equals("doModifykp")) {
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");
			Article article = new Article(nId, nTitle, nContent, nReleaseTime,
					nClick, nOperator, nFrom, menuId);
			int res = articleBiz.modifyArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("kplist.jsp").forward(request,
						response);
			}
		} else if (type.equals("addkp")) {
			// 新增新闻
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");

			Article article = new Article();
			article.setnId(nId);
			article.setnTitle(nTitle);
			article.setnReleaseTime(nReleaseTime);
			article.setnClick(nClick);
			article.setnOperator(nOperator);
			article.setnFrom(nFrom);
			article.setMenuId(menuId);
			article.setnContent(nContent);

			int res = articleBiz.addArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("kplist.jsp").forward(request,
						response);
			}
		} else if (type.equals("modifyys")) {
			int nId = Integer.parseInt(request.getParameter("nId"));
			Article article = articleBiz.getArticleById(nId);
			request.setAttribute("article", article);
			// 转发
			request.getRequestDispatcher("updateYsArticle.jsp").forward(
					request, response);
		} else if (type.equals("doModifyys")) {
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");
			Article article = new Article(nId, nTitle, nContent, nReleaseTime,
					nClick, nOperator, nFrom, menuId);
			int res = articleBiz.modifyArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("yslist.jsp").forward(request,
						response);
			}
		} else if (type.equals("addys")) {
			// 新增新闻
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");

			Article article = new Article();
			article.setnId(nId);
			article.setnTitle(nTitle);
			article.setnReleaseTime(nReleaseTime);
			article.setnClick(nClick);
			article.setnOperator(nOperator);
			article.setnFrom(nFrom);
			article.setMenuId(menuId);
			article.setnContent(nContent);

			int res = articleBiz.addArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("yslist.jsp").forward(request,
						response);
			}
		}else if(type.equals("modifyqz")){
			int nId = Integer.parseInt(request.getParameter("nId"));
			Article article = articleBiz.getArticleById(nId);
			request.setAttribute("article", article);
			// 转发
			request.getRequestDispatcher("updateQzArticle.jsp").forward(
					request, response);
		}else if (type.equals("doModifyqz")) {
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");
			Article article = new Article(nId, nTitle, nContent, nReleaseTime,
					nClick, nOperator, nFrom, menuId);
			int res = articleBiz.modifyArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("qzlist.jsp").forward(request,
						response);
			}
		}else if (type.equals("addqz")) {
			// 新增新闻
			int nId = Integer.parseInt(request.getParameter("id"));
			String nTitle = request.getParameter("title");
			Timestamp nReleaseTime = Timestamp.valueOf(request
					.getParameter("releasetime"));
			int nClick = Integer.parseInt(request.getParameter("click"));
			String nOperator = request.getParameter("operator");
			String nFrom = request.getParameter("from");
			int menuId = Integer.parseInt(request.getParameter("menuid"));
			String nContent = request.getParameter("content");

			Article article = new Article();
			article.setnId(nId);
			article.setnTitle(nTitle);
			article.setnReleaseTime(nReleaseTime);
			article.setnClick(nClick);
			article.setnOperator(nOperator);
			article.setnFrom(nFrom);
			article.setMenuId(menuId);
			article.setnContent(nContent);

			int res = articleBiz.addArticle(article);
			if (res > 0) {
				request.getRequestDispatcher("qzlist.jsp").forward(request,
						response);
			}
		}else if(type.equals("modifysp")){
			int nId = Integer.parseInt(request.getParameter("nId"));
			Article article = articleBiz.getArticleById(nId);
			request.setAttribute("article", article);
			// 转发
			request.getRequestDispatcher("updateSpArticle.jsp").forward(
					request, response);
	}else if (type.equals("doModifysp")) {
		int nId = Integer.parseInt(request.getParameter("id"));
		String nTitle = request.getParameter("title");
		Timestamp nReleaseTime = Timestamp.valueOf(request
				.getParameter("releasetime"));
		int nClick = Integer.parseInt(request.getParameter("click"));
		String nOperator = request.getParameter("operator");
		String nFrom = request.getParameter("from");
		int menuId = Integer.parseInt(request.getParameter("menuid"));
		String nContent = request.getParameter("content");
		Article article = new Article(nId, nTitle, nContent, nReleaseTime,
				nClick, nOperator, nFrom, menuId);
		int res = articleBiz.modifyArticle(article);
		if (res > 0) {
			request.getRequestDispatcher("splist.jsp").forward(request,
					response);
		}
	}else if (type.equals("addsp")) {
		// 新增新闻
		int nId = Integer.parseInt(request.getParameter("id"));
		String nTitle = request.getParameter("title");
		Timestamp nReleaseTime = Timestamp.valueOf(request
				.getParameter("releasetime"));
		int nClick = Integer.parseInt(request.getParameter("click"));
		String nOperator = request.getParameter("operator");
		String nFrom = request.getParameter("from");
		int menuId = Integer.parseInt(request.getParameter("menuid"));
		String nContent = request.getParameter("content");

		Article article = new Article();
		article.setnId(nId);
		article.setnTitle(nTitle);
		article.setnReleaseTime(nReleaseTime);
		article.setnClick(nClick);
		article.setnOperator(nOperator);
		article.setnFrom(nFrom);
		article.setMenuId(menuId);
		article.setnContent(nContent);

		int res = articleBiz.addArticle(article);
		if (res > 0) {
			request.getRequestDispatcher("splist.jsp").forward(request,
					response);
		}
	}
	}

}
