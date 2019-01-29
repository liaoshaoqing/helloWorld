package com.zwx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zwx.dao.ArticleDao;
import com.zwx.entity.Article;
import com.zwx.util.DBUtil;

public class ArticleDaoImpl implements ArticleDao {
	private Connection conn =null;
    private PreparedStatement pstmt=null;
    private ResultSet rs =null;
    DBUtil dbutil =new DBUtil();
	@Override
	/***
	 * 得到所有的文章集合
	 */
	public List<Article> getArticle() {
	   String sql="select nId,nTitle,nContent,nReleaseTime,nClicks,nOperator,nFrom,menuId from article ";
		return getArticleBysql(sql);
	}
    /**
     * 根据文章编号查询，得到文章实体
     */
	@Override
	public Article getArticleById(int nId) {
		 String sql="select nId,nTitle,nContent,nReleaseTime,nClicks,nOperator,nFrom,menuId from article "
		 		+ " where nId=?";
		 List<Article> list=getArticleBysql(sql,nId);
		 if(list.size()>0){
			 return list.get(0);
		 }
		return null;
	}

	@Override
	public Article getArticleByTitle(String nTitle) {
		// TODO Auto-generated method stub
		return null;
	}
     
	/**
	 * 根据目录编号查询，得到文章实体集合
	 */
	public List<Article> getArticleBymenuId(int menuId) {
		 String sql="select nId,nTitle,nContent,nReleaseTime,nClicks,nOperator,nFrom,menuId from article "
			 		+ " where menuId=?";	 
		return getArticleBysql(sql,menuId);
	}
    /**
     * 增加文章
     */
	@Override
	public int addArticle(Article article) {
		StringBuilder sb=new StringBuilder();
		sb.append("insert into article(nTitle,nContent,nReleaseTime,nClicks,nOperator,nFrom,menuId) ");
		sb.append(" values(?,?,?,?,?,?,?)");
		Object[] obj={article.getnTitle(),article.getnContent(),article.getnReleaseTime(),
				article.getnClick(),article.getnOperator(),article.getnFrom(),article.getMenuId() };
		return DBUtil.exeSql(sb.toString(),obj);
	}
    /**
     * 更新文章
     */
	@Override
	public int updateArticle(Article article) {
	  StringBuilder sb=new StringBuilder();
	  sb.append(" update article set nTitle=?,nContent=?,nReleaseTime=?,nClicks=?,nOperator=?,nFrom=?,menuId=? ");
	  sb.append(" where nId=? ");
	  Object[] obj={article.getnTitle(),article.getnContent(),article.getnReleaseTime(),
				article.getnClick(),article.getnOperator(),article.getnFrom(),article.getMenuId(),article.getnId() };
		return DBUtil.exeSql(sb.toString(),obj);
	}

	/**
	 * 删除文章
	 */
	public int deleteArticle(int nId) {
		String sql="delete from article where nId=?";
		return DBUtil.exeSql(sql, nId);
	}
	
	private List<Article> getArticleBysql(String sql,Object...obj){
		List<Article> list=new ArrayList<Article>();
		conn= DBUtil.get_Connection();
		
		 try {
			pstmt=conn.prepareStatement(sql);
			if(obj.length>0){
				for (int i = 0; i < obj.length; i++) {
					pstmt.setObject(i+1, obj[i]);
				}
			}
			rs=pstmt.executeQuery();
			while(rs.next()){
				Article article =new Article();
				article.setMenuId(rs.getInt("menuId"));
				article.setnClick(rs.getInt("nClicks"));
				article.setnContent(rs.getString("nContent"));
				article.setnFrom(rs.getString("nFrom"));
				article.setnId(rs.getInt("nId"));
				article.setnOperator(rs.getString("nOperator"));
				article.setnReleaseTime(rs.getTimestamp("nReleaseTime"));
				article.setnTitle(rs.getString("nTitle"));
				list.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeAll(rs, pstmt, conn);
		}
		return list;
	}

}
