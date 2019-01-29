package com.zwx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zwx.dao.UserDao;
import com.zwx.entity.User;
import com.zwx.util.DBUtil;

public class UserDaoImpl implements UserDao {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	DBUtil dbutil = new DBUtil();

	/**
	 * 得到所有的用户，返回用户集合
	 */
	public List<User> getUser() {
		String sql = "select uid, loginId, loginPwd, realName, phone, birthday, gender, address, email, qq from user";
		return getUserBySql(sql);
	}

	/**
	 * 根据用户编号查询，返回用户实体
	 */
	public User getUserById(int useId) {
		String sql = "select uid, loginId, loginPwd, realName, phone, birthday, gender, address, email, qq from user"
				+ " where uid=?";
		List<User> list = getUserBySql(sql, useId);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据登录名查询，返回用户实体
	 */

	public User getUserById(String loginId) {

		String sql = "select uid, loginId, loginPwd, realName, phone, birthday, gender, address, email, qq from user"
				+ " where loginId=?";
		List<User> list = getUserBySql(sql, loginId);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据姓名和地址进行模糊查询。返回用户集合
	 */
	public List<User> getUserByName(String realName) {
		StringBuilder sb = new StringBuilder();
		sb.append("select uid, loginId, loginPwd, realName, phone, birthday, gender, address, email, qq from user");
		sb.append(" where realName like '%?%' ");
		
		return getUserBySql(sb.toString(), realName);

	}

/*
	  public static void main(String[] args) { UserDaoImpl udi=new
	  UserDaoImpl(); List<User> list= udi.getUserByName("李", "合肥"); 
	  for (User user : list) 
	  { System.out.println(user.getRealName()); }
	  
	  }*/
	

	/**
	 * 增加用户
	 */
	public int addUser(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append(" insert into user (loginId, loginPwd, realName, phone, birthday, gender, address, email, qq) ");
		sb.append(" values( ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
		Object[] obj = { user.getLoginId(), user.getLoginPwd(),
				user.getRealName(), user.getPhone(), user.getBirthday(),
				user.getGender(), user.getAddress(), user.getEmail(),
				user.getQq() };
		return DBUtil.exeSql(sb.toString(), obj);
	}

	/**
	 * 更新用户，返回受影响的行数
	 */
	public int updateUser(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append("update user set loginId=?,loginPwd=?,realName=?,phone=?,birthday=?,gender=?,address=?,email=?,qq=? ");
		sb.append(" where uid=?");

		Object[] obj = { user.getLoginId(), user.getLoginPwd(),
				user.getRealName(), user.getPhone(), user.getBirthday(),
				user.getGender(), user.getAddress(), user.getEmail(),
				user.getQq(), user.getUid() };
		return DBUtil.exeSql(sb.toString(), obj);
	}

	/**
	 * 删除用户
	 */
	public int deleteUser(int userId) {
		String sql = "delete from user where uid=?";
		return DBUtil.exeSql(sql, userId);
	}

	/**
	 * 共有的查询方法
	 * 
	 * @param sql
	 * @param obj
	 *            sql所需的参数
	 * @return 用户对象集合
	 */
	private List<User> getUserBySql(String sql, Object... obj) {
		List<User> list = new ArrayList<User>();
		conn = dbutil.get_Connection();
		try {
			pstmt = conn.prepareStatement(sql);
			if (obj.length > 0) {
				for (int i = 0; i < obj.length; i++) {
					pstmt.setObject(i + 1, obj[i]);
				}
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUid(rs.getInt("uid"));
				user.setLoginId(rs.getString("loginId"));
				user.setLoginPwd(rs.getString("loginPwd"));
				user.setBirthday(rs.getDate("birthday"));
				user.setGender(rs.getString("gender"));
				user.setPhone(rs.getString("phone"));
				user.setRealName(rs.getString("realName"));
				user.setQq(rs.getString("qq"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbutil.closeAll(rs, pstmt, conn);
		}

		return list;

	}

	/**
	 * 分页查询
	 */
	@Override
	public List<User> getUserByPage(int PageIndex, int PageSize) {
		String sql = "select * from user limit " + (PageIndex - 1) * PageSize
				+ "," + PageSize;
		return getUserBySql(sql);
	}

	/**
	 * public static void main(String[] args) { UserDaoImpl udi=new
	 * UserDaoImpl(); List<User> list=udi.getUserByPage(2,5); for (User user :
	 * list) { System.out.println(user.getRealName()); } }
	 */

	/**
	 * 获取总记录数
	 */
	@Override
	public int getUserCounts() {
		int count = 0;
		String sql = "select count(*) as usercount FROM user ";
		conn = DBUtil.get_Connection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("usercount");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, pstmt, conn);
		}
		return count;
	}

	/**
	 * 获取总页数
	 */
	@Override
	public int getPageCount(int PageSize) {
		int count = getUserCounts();
		if (count % PageSize == 0) {
			return count % PageSize;
		}
		return (count % PageSize) + 1;
	}

}
