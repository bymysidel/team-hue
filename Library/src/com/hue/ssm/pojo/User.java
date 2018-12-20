package com.hue.ssm.pojo;

public class User {
	private int userId;
	private String userName;
	private String password;
	private int sex;
	private String tel;
	private String email;
	private String dept;
	private int inBorrowingCounts; //�ڽ�����
	private int borrowLimit; //�ڽ��������ֵ
	private int level; //�˺ŵȼ� ��1����Ա   2��ͨ�û�  3���״̬
	private int loginLimit;//ͬʱ��½���� 0�ɵ�¼  1���ɵ�½
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getInBorrowingCounts() {
		return inBorrowingCounts;
	}
	public void setInBorrowingCounts(int inBorrowingCounts) {
		this.inBorrowingCounts = inBorrowingCounts;
	}
	public int getBorrowLimit() {
		return borrowLimit;
	}
	public void setBorrowLimit(int borrowLimit) {
		this.borrowLimit = borrowLimit;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLoginLimit() {
		return loginLimit;
	}
	public void setLoginLimit(int loginLimit) {
		this.loginLimit = loginLimit;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", sex=" + sex
				+ ", tel=" + tel + ", email=" + email + ", dept=" + dept + ", inBorrowingCounts=" + inBorrowingCounts
				+ ", borrowLimit=" + borrowLimit + ", level=" + level + ", loginLimit=" + loginLimit + "]";
	}
}
