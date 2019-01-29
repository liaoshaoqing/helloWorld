package com.zwx.biz.impl;

import java.util.List;

import com.zwx.biz.MenuBiz;
import com.zwx.dao.MenuDao;
import com.zwx.dao.impl.MenuDaoImpl;
import com.zwx.entity.Menu;

public class MenuBizImpl implements MenuBiz {
    private MenuDao menuDao =new MenuDaoImpl();
	@Override
	public List<Menu> getMenus() {
		
		return menuDao.getMenu();
	}

}
