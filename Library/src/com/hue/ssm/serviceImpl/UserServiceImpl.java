package com.hue.ssm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hue.ssm.mapper.UserMapper;
import com.hue.ssm.pojo.User;
import com.hue.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectUserById(userId);
	}
	
}
