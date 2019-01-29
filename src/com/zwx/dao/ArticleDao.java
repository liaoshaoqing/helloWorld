package com.zwx.dao;

import java.util.List;

import com.zwx.entity.Article;

public interface ArticleDao {
	/**
	 * �õ����е�����
	 * @return ���¶���ļ���
	 */
      public List<Article> getArticle(); 
      /**
       * �������±��id��ѯ
       * @param nId
       * @return ����ʵ��
       */
      public Article getArticleById(int nId);
      /**
       * �������±����ѯ
       * @param nTitle
       * @return ����ʵ��
       */
      public Article getArticleByTitle(String nTitle);
      /**
       * ����Ŀ¼��Ų�ѯ
       * @param menuId
       * @return ���¶��󼯺�
       */
      public List<Article> getArticleBymenuId(int menuId);
      /**
       * ��������
       * @param article ���µĶ���
       * @return 
       */
      public int addArticle(Article article);
       /**
        * ��������
        * @param article
        * @return
        */
      public int updateArticle(Article article);
      /**
       * ɾ������
       * @param nId ���±��id
       * @return
       */
      public int deleteArticle(int nId);
}
