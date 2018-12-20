package com.hue.ssm.mapper;

import java.util.List;

import com.hue.ssm.pojo.Borrow;

public interface BorrowMapper {
	public int addBorrow(Borrow borrow);
	public boolean updateBorrow(Borrow borrow);
	public Borrow selectBorrowById(int borrowId);
	public List<Borrow> selectBorrowByBorrowerId(int borrowerId);
	
}
