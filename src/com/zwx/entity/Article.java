package com.zwx.entity;

import java.sql.Timestamp;

public class Article {
     private int nId;
     private String nTitle;
     private String nContent;
     private Timestamp nReleaseTime;
     private int nClick;
     private String nOperator;
     private String nFrom;
     private int menuId;
     
        
	public Article() {
	
	}
	
	public Article(int nId, String nTitle, String nContent,
			Timestamp nReleaseTime, int nClick, String nOperator, String nFrom,
			int menuId) {
		super();
		this.nId = nId;
		this.nTitle = nTitle;
		this.nContent = nContent;
		this.nReleaseTime = nReleaseTime;
		this.nClick = nClick;
		this.nOperator = nOperator;
		this.nFrom = nFrom;
		this.menuId = menuId;
	}


	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
		this.nId = nId;
	}
	public String getnTitle() {
		return nTitle;
	}
	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}
	public String getnContent() {
		return nContent;
	}
	public void setnContent(String nContent) {
		this.nContent = nContent;
	}
	public Timestamp getnReleaseTime() {
		return nReleaseTime;
	}
	public void setnReleaseTime(Timestamp nReleaseTime) {
		this.nReleaseTime = nReleaseTime;
	}
	public int getnClick() {
		return nClick;
	}
	public void setnClick(int nClick) {
		this.nClick = nClick;
	}
	public String getnOperator() {
		return nOperator;
	}
	public void setnOperator(String nOperator) {
		this.nOperator = nOperator;
	}
	public String getnFrom() {
		return nFrom;
	}
	public void setnFrom(String nFrom) {
		this.nFrom = nFrom;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
     
     
}
