package com.zwx.dao;

import java.util.List;

import com.zwx.entity.Article;

public interface ArticleDao {
	/**
	 * 得到所有的文章
	 * @return 文章对象的集合
	 */
      public List<Article> getArticle(); 
      /**
       * 根据文章编号id查询
       * @param nId
       * @return 文章实体
       */
      public Article getArticleById(int nId);
      /**
       * 根据文章标题查询
       * @param nTitle
       * @return 文章实体
       */
      public Article getArticleByTitle(String nTitle);
      /**
       * 根据目录编号查询
       * @param menuId
       * @return 文章对象集合
       */
      public List<Article> getArticleBymenuId(int menuId);
      /**
       * 新增文章
       * @param article 文章的对象
       * @return 
       */
      public int addArticle(Article article);
       /**
        * 更新文章
        * @param article
        * @return
        */
      public int updateArticle(Article article);
      /**
       * 删除文章
       * @param nId 文章编号id
       * @return
       */
      public int deleteArticle(int nId);
}
