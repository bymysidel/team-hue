package com.hue.ssm.mapper;

import java.util.HashMap;

import com.hue.ssm.pojo.User;

public interface UserMapper {
	public User selectUserById(int userId);
	public int addUser(User user);//返回新增user的id
	public boolean deleteUserById(int userId);
	public boolean updateUser(User user);
	public boolean updateLevelById(HashMap<String, Integer> hashMap);//修改用户的权限,map中放"level","userId"
	
	public boolean addLoginLimitById(int userId);//添加用户登录限制
	public boolean cancelLoginLimitById(int userId);//取消用户登录限制
	
}
