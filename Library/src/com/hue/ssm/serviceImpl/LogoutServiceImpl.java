package com.hue.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hue.ssm.mapper.LoginSessionMapper;
import com.hue.ssm.service.LogoutService;

@Service
public class LogoutServiceImpl implements LogoutService{
	@Autowired
	private LoginSessionMapper loginSessionMapper;
	@Override
	public boolean deleteLoginSession(String sessionId) {
		// TODO Auto-generated method stub
		return loginSessionMapper.deleteLoginSession(sessionId);
	}

}
