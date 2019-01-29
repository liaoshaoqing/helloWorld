package com.zwx.biz;

import java.util.List;

import com.zwx.entity.User;

public interface UserBiz {
	/**
	 * ��ȡ���е��û��б�
	 * @return �û�����
	 */
    public List<User> getUserAll();
    /**
     * �û���¼
     * @param loginId
     * @param loginpwd
     * @return ��¼��
     */
    public User login(String loginId,String loginpwd);
    /**
     * �û�ע��/����
     * @param user
     * @return
     */
    public int addUser(User user);
    /**
     * ɾ���û���Ϣ
     * @param userId
     * @return
     */
    public int deleteUser(int userId );
    /**
     * �����û�
     * @param user
     * @return
     */
    public int modifyUser(User user);
    /**
     * �����û����
     * @param userId
     * @return
     */
    public User getUserById(int userId);
    /**
     * ��ҳ��ѯ
     * @param PageIndex
     * @param PageSize
     * @return
     */
    public List<User> getUserPage(int PageIndex,int PageSize );
    /**
     * ��ȡ�û��ܼ�¼��
     * @return
     */
    public int getUserCounts();
    /**
     * ��ȡ��ҳ��
     * @return ҳ����
     */
  
	public int getPageCount(int PageSize);
	/**
	 * ������������ģ����ѯ
	 * @param realName
	 * @return
	 */
	
	public List<User> getUserByPara(String realName);
}
