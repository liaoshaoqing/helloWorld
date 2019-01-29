package com.zwx.biz;

import java.util.List;

import com.zwx.entity.Article;

public interface ArticleBiz {
	/**
	 * 获取所有的文章列表
	 * @return 文章集合
	 */
    public List<Article> getArticleAll();
    /**
     * 增加文章
     * @param article
     * @return
     */
    public int addArticle(Article article);
    /**
     * 删除文章
     * @param nId 文章编号
     * @return
     */
    public int deleteArticle(int nId);
    /**
     * 更新文章
     * @param article
     * @return
     */
    public int modifyArticle(Article article);
    /**
     * 根据文章编号 查询
     * @param nId
     * @return 文章实体
     */
    public Article getArticleById(int nId);
    /**
     * 根据目录编号查询
     * @param menuId 目录编号
     * @return 文章集合
     */
    public List<Article> getArticleByMenuId(int menuId);
}
