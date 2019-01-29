package com.zwx.biz.impl;

import java.util.List;

import com.zwx.biz.UserBiz;
import com.zwx.dao.UserDao;
import com.zwx.dao.impl.UserDaoImpl;
import com.zwx.entity.User;

public class UserBizImpl implements UserBiz {
	 private UserDao userDao=new UserDaoImpl();
		@Override
		public List<User> getUserAll() {
			
			return userDao.getUser();
		}

		@Override
		public User login(String loginId, String loginpwd) {
			User user= userDao.getUserById(loginId);
			if(user!=null && user.getLoginPwd().equals(loginpwd)){
				return user;
			}
			return null;
		}

		@Override
		public int addUser(User user) {
		 User user2=userDao.getUserById(user.getLoginId());
		 if(user2==null){
			 int res=userDao.addUser(user);
			  if(res>0){
				  return 1;//�û��������ڣ������ɹ�
			  }
			   return 3;//�û��������ڣ�����ʧ��
		 }
			return 0;//�û�������
		}

		@Override
		public int deleteUser(int userId) {
			return userDao.deleteUser(userId);
		}

		@Override
		public int modifyUser(User user) {
		
			return userDao.updateUser(user);
		}

		@Override
		public User getUserById(int userId) {
			// TODO Auto-generated method stub
			return userDao.getUserById(userId);
		}

		@Override
		public List<User> getUserPage(int PageIndex, int PageSize) {
		
			return userDao.getUserByPage(PageIndex, PageSize);
		}

		@Override
		public int getUserCounts() {
			
			return userDao.getUserCounts();
		}

		@Override
		public int getPageCount(int PageSize) {
		
			return userDao.getPageCount(PageSize);
		}

		@Override
		public List<User> getUserByPara(String realName) {
			
			return userDao.getUserByName(realName);
		}

	
	

}
