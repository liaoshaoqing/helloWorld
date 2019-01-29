package com.zwx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zwx.dao.MenuDao;
import com.zwx.entity.Menu;
import com.zwx.util.DBUtil;

public class MenuDaoImpl implements MenuDao {
    private Connection conn=null;
    private PreparedStatement pstmt=null;
    private ResultSet rs=null;
	public List<Menu> getMenu() {
	List <Menu> list =new ArrayList<Menu>();
	String sql="select menuId,menuTitle,menuContent,parentId,menuLevel from menu";
	conn=DBUtil.get_Connection();
	try {
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			Menu menu =new Menu();
			menu.setMenuId(rs.getInt("menuId"));
			menu.setMenuTitle(rs.getString("menuTitle"));
		    menu.setMenuContent(rs.getString("menuContent"));
		    menu.setParentId(rs.getInt("parentId"));
		    menu.setMenulevel(rs.getInt("menulevel"));
		    list.add(menu);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DBUtil.closeAll(rs, pstmt, conn);
	}
		return list;
	}

}
