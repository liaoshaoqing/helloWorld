package com.zwx.entity;

public class Menu {
    private int menuId;
    private String menuTitle;
    private String menuContent;
    private int parentId;
    private int menulevel;
	
    
    public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	public Menu(int menuId, String menuTitle, String menuContent, int parentId,
			int menulevel) {
		super();
		this.menuId = menuId;
		this.menuTitle = menuTitle;
		this.menuContent = menuContent;
		this.parentId = parentId;
		this.menulevel = menulevel;
	}


	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuTitle() {
		return menuTitle;
	}
	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}
	public String getMenuContent() {
		return menuContent;
	}
	public void setMenuContent(String menuContent) {
		this.menuContent = menuContent;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getMenulevel() {
		return menulevel;
	}
	public void setMenulevel(int menulevel) {
		this.menulevel = menulevel;
	}
    
    
}
