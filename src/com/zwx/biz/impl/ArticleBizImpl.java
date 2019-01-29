package com.zwx.biz.impl;

import java.util.List;

import com.zwx.biz.ArticleBiz;
import com.zwx.dao.ArticleDao;
import com.zwx.dao.impl.ArticleDaoImpl;
import com.zwx.entity.Article;

public class ArticleBizImpl implements ArticleBiz {
   private ArticleDao articleDao= new ArticleDaoImpl();
	@Override
	public List<Article> getArticleAll() {
		return articleDao.getArticle();
	}

	@Override
	public int addArticle(Article article) {
	
		return articleDao.addArticle(article);
	}

	@Override
	public int deleteArticle(int nId) {
		return articleDao.deleteArticle(nId);
	}

	@Override
	public int modifyArticle(Article article) {
		
		return articleDao.updateArticle(article);
	}

	@Override
	public Article getArticleById(int nId) {
		
		return articleDao.getArticleById(nId);
	}

	@Override
	public List<Article> getArticleByMenuId(int menuId) {
		return articleDao.getArticleBymenuId(menuId);
	}

}
