package com.zwx.dao;

import java.util.List;

import com.zwx.entity.User;

public interface UserDao {
	/**
	 * 得到所有的用户
	 * @return 用户对象集合
	 */
     public List<User> getUser();
     /**
      * 根据用户Id查询
      * @param useId
      * @return 用户实体
      */
     public User getUserById(int useId);
      /**
       * 根据登录名查询
       * @param loginId
       * @return 用户实体 
       */
     public User getUserById(String loginId);
     /**
      * 根据姓名进行模糊查询
      * @param realName
      * @return
      */
     public List<User> getUserByName(String realName);
     /**
      * 新增用户
      * @param user 用户对象
      * @return 受影响的行数
      */
     public int addUser(User user);
      /**
       *  更新用户
       * @param user
       * @return
       */
     public int updateUser(User user);
     /**
      * 删除用户
      * @param user
      * @return
      */
     public int deleteUser(int  userId);
     /**
      * 分页查询
      * @param PageIndex 当前页索引
      * @param PageSize 每页所显示的记录数
      * @return 每页用户的集合
      */
     public List<User> getUserByPage(int PageIndex,int PageSize);
     /**
      * 获取用户总记录数
      * @return
      */
     public int getUserCounts();
     /**
      * 获取总页数
      * @param PageSize 页容量
      * @return
      */
     public int getPageCount(int PageSize);
}
