package com.hue.ssm.service;

import com.hue.ssm.pojo.LoginSession;

public interface LoginService {
	public boolean initLoginSession();//����������ʱ��ɾ��session�������м�¼����ʼ��
	public LoginSession findLoginSessionById(int userId);
	public boolean saveLoginSession(int userId,String sessionId);
}
