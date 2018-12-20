package com.hue.ssm.pojo;

public class LoginRecord {
	private int recordId;
	private int r_userId;
	private String loginTime;
	private String logoutTime;
	private String logoutMethod;
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public int getR_userId() {
		return r_userId;
	}
	public void setR_userId(int r_userId) {
		this.r_userId = r_userId;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(String logoutTime) {
		this.logoutTime = logoutTime;
	}
	public String getLogoutMethod() {
		return logoutMethod;
	}
	public void setLogoutMethod(String logoutMethod) {
		this.logoutMethod = logoutMethod;
	}
	@Override
	public String toString() {
		return "LoginRecord [recordId=" + recordId + ", r_userId=" + r_userId + ", loginTime=" + loginTime
				+ ", logoutTime=" + logoutTime + ", logoutMethod=" + logoutMethod + "]";
	}
}
