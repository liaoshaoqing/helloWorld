package com.zwx.biz;

import java.util.List;

import com.zwx.entity.User;

public interface UserBiz {
	/**
	 * 获取所有的用户列表
	 * @return 用户集合
	 */
    public List<User> getUserAll();
    /**
     * 用户登录
     * @param loginId
     * @param loginpwd
     * @return 登录者
     */
    public User login(String loginId,String loginpwd);
    /**
     * 用户注册/增加
     * @param user
     * @return
     */
    public int addUser(User user);
    /**
     * 删除用户信息
     * @param userId
     * @return
     */
    public int deleteUser(int userId );
    /**
     * 更新用户
     * @param user
     * @return
     */
    public int modifyUser(User user);
    /**
     * 根据用户编号
     * @param userId
     * @return
     */
    public User getUserById(int userId);
    /**
     * 分页查询
     * @param PageIndex
     * @param PageSize
     * @return
     */
    public List<User> getUserPage(int PageIndex,int PageSize );
    /**
     * 获取用户总记录数
     * @return
     */
    public int getUserCounts();
    /**
     * 获取总页数
     * @return 页容量
     */
  
	public int getPageCount(int PageSize);
	/**
	 * 根据姓名进行模糊查询
	 * @param realName
	 * @return
	 */
	
	public List<User> getUserByPara(String realName);
}
