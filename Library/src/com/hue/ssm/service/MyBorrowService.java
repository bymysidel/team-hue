package com.hue.ssm.service;

import java.util.List;


import com.hue.ssm.pojo.MyBorrow;

public interface MyBorrowService {
	public List<MyBorrow> findMyBorrow(int userId);
	public List<MyBorrow> findPages(String currentPage,String pageSize,int userId);
}
