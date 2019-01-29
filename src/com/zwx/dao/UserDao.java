package com.zwx.dao;

import java.util.List;

import com.zwx.entity.User;

public interface UserDao {
	/**
	 * �õ����е��û�
	 * @return �û����󼯺�
	 */
     public List<User> getUser();
     /**
      * �����û�Id��ѯ
      * @param useId
      * @return �û�ʵ��
      */
     public User getUserById(int useId);
      /**
       * ���ݵ�¼����ѯ
       * @param loginId
       * @return �û�ʵ�� 
       */
     public User getUserById(String loginId);
     /**
      * ������������ģ����ѯ
      * @param realName
      * @return
      */
     public List<User> getUserByName(String realName);
     /**
      * �����û�
      * @param user �û�����
      * @return ��Ӱ�������
      */
     public int addUser(User user);
      /**
       *  �����û�
       * @param user
       * @return
       */
     public int updateUser(User user);
     /**
      * ɾ���û�
      * @param user
      * @return
      */
     public int deleteUser(int  userId);
     /**
      * ��ҳ��ѯ
      * @param PageIndex ��ǰҳ����
      * @param PageSize ÿҳ����ʾ�ļ�¼��
      * @return ÿҳ�û��ļ���
      */
     public List<User> getUserByPage(int PageIndex,int PageSize);
     /**
      * ��ȡ�û��ܼ�¼��
      * @return
      */
     public int getUserCounts();
     /**
      * ��ȡ��ҳ��
      * @param PageSize ҳ����
      * @return
      */
     public int getPageCount(int PageSize);
}
