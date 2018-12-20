package com.hue.ssm.mapper;

import java.util.HashMap;

import com.hue.ssm.pojo.User;

public interface UserMapper {
	public User selectUserById(int userId);
	public int addUser(User user);//��������user��id
	public boolean deleteUserById(int userId);
	public boolean updateUser(User user);
	public boolean updateLevelById(HashMap<String, Integer> hashMap);//�޸��û���Ȩ��,map�з�"level","userId"
	
	public boolean addLoginLimitById(int userId);//����û���¼����
	public boolean cancelLoginLimitById(int userId);//ȡ���û���¼����
	
}
