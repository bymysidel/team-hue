package com.hue.ssm.mapper;

import com.hue.ssm.pojo.LoginSession;

public interface LoginSessionMapper {
	public boolean addLoginSession(LoginSession loginSession);
	public boolean deleteLoginSession(String sessionId);
	public LoginSession selectLoginSessionById(int userId);
	public LoginSession selectLoginSessionBySessionId(String sessionId);
	public boolean deleteAllSession();
}
