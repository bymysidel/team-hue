package com.hue.ssm.pojo;

public class LoginSession {
	private String sessionId;
	private int s_userId;
	private String createdTime;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public int getS_userId() {
		return s_userId;
	}
	public void setS_userId(int s_userId) {
		this.s_userId = s_userId;
	}
	public String getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	@Override
	public String toString() {
		return "LoginSession [sessionId=" + sessionId + ", s_userId=" + s_userId + ", createdTime=" + createdTime + "]";
	}
}
