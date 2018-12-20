package com.hue.ssm.serviceImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hue.ssm.mapper.BorrowMapper;
import com.hue.ssm.mapper.MyBorrowMapper;
import com.hue.ssm.pojo.Borrow;
import com.hue.ssm.pojo.MyBorrow;
import com.hue.ssm.service.MyBorrowService;

@Service
public class MyBorrowServiceImpl implements MyBorrowService{
	@Autowired
	private MyBorrowMapper myBorrowMapper;
	@Override
	public List<MyBorrow> findMyBorrow(int userId) {
		// TODO Auto-generated method stub
		return myBorrowMapper.selectMyBorrowById(userId);
	}
	@Override
	public List<MyBorrow> findPages(String currentPage, String pageSize,int userId) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		int pagesize = Integer.parseInt(pageSize);
		int startIndex = (Integer.parseInt(currentPage)-1)*pagesize;
		hashMap.put("userId",userId);
		hashMap.put("startIndex",startIndex);
		hashMap.put("pageSize",pagesize);
		return myBorrowMapper.selectPage(hashMap);
	}
	
}
