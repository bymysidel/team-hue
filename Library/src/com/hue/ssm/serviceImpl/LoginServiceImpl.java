package com.hue.ssm.serviceImpl;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hue.ssm.mapper.LoginSessionMapper;
import com.hue.ssm.pojo.LoginSession;
import com.hue.ssm.service.LoginService;


public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginSessionMapper loginSessionMapper;
	public  void setLoginSessionMapper(LoginSessionMapper loginSessionMapper) {
		this.loginSessionMapper = loginSessionMapper;
	}
	@Override
	public LoginSession findLoginSessionById(int userId) {
		// TODO Auto-generated method stub
		return loginSessionMapper.selectLoginSessionById(userId);
	}
	@Override
	public boolean saveLoginSession(int userId,String sessionId) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createdTime = sdf.format(new Date());
		LoginSession loginSession = new LoginSession();
		loginSession.setCreatedTime(createdTime);
		loginSession.setS_userId(userId);
		loginSession.setSessionId(sessionId);
		return loginSessionMapper.addLoginSession(loginSession);
	}
	//服务器初始化时，删除所有session记录，即清空所有登录状态信息。
	@Override
	public boolean initLoginSession(){
		return loginSessionMapper.deleteAllSession();
	}

}
