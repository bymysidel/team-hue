package com.hue.ssm.service;

import com.hue.ssm.pojo.LoginSession;

public interface LoginService {
	public boolean initLoginSession();//服务器启动时，删除session表中所有记录，初始化
	public LoginSession findLoginSessionById(int userId);
	public boolean saveLoginSession(int userId,String sessionId);
}
