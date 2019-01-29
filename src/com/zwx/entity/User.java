package com.zwx.entity;

import java.sql.Date;

public class User {
	  private int uid;
	     private String loginId;
	     private String loginPwd;
	     private String realName;
	     private String gender;
	     private Date birthday;
	     private String phone;
	     private String qq;
	     private String email;
	     private String address;
	     
	     
	     
		@Override
		public String toString() {
			return "User [uid=" + uid + ", loginId=" + loginId + ", loginPwd="
					+ loginPwd + ", realName=" + realName + ", gender=" + gender
					+ ", birthday=" + birthday + ", phone=" + phone + ", qq=" + qq
					+ ", email=" + email + ", address=" + address + "]";
		}

		public User() {
		}
		
		public User(int uid, String loginId, String loginPwd, String realName,
				String gender, Date birthday, String phone, String qq,
				String email, String address) {
			super();
			this.uid = uid;
			this.loginId = loginId;
			this.loginPwd = loginPwd;
			this.realName = realName;
			this.gender = gender;
			this.birthday = birthday;
			this.phone = phone;
			this.qq = qq;
			this.email = email;
			this.address = address;
		}

		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getLoginId() {
			return loginId;
		}
		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}
		public String getLoginPwd() {
			return loginPwd;
		}
		public void setLoginPwd(String loginPwd) {
			this.loginPwd = loginPwd;
		}
		public String getRealName() {
			return realName;
		}
		public void setRealName(String realName) {
			this.realName = realName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getQq() {
			return qq;
		}
		public void setQq(String qq) {
			this.qq = qq;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
