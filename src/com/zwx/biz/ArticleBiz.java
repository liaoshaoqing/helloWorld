package com.zwx.biz;

import java.util.List;

import com.zwx.entity.Article;

public interface ArticleBiz {
	/**
	 * ��ȡ���е������б�
	 * @return ���¼���
	 */
    public List<Article> getArticleAll();
    /**
     * ��������
     * @param article
     * @return
     */
    public int addArticle(Article article);
    /**
     * ɾ������
     * @param nId ���±��
     * @return
     */
    public int deleteArticle(int nId);
    /**
     * ��������
     * @param article
     * @return
     */
    public int modifyArticle(Article article);
    /**
     * �������±�� ��ѯ
     * @param nId
     * @return ����ʵ��
     */
    public Article getArticleById(int nId);
    /**
     * ����Ŀ¼��Ų�ѯ
     * @param menuId Ŀ¼���
     * @return ���¼���
     */
    public List<Article> getArticleByMenuId(int menuId);
}
