package com.hue.ssm.mapper;

import java.util.HashMap;
import java.util.List;



import com.hue.ssm.pojo.MyBorrow;

public interface MyBorrowMapper {
  public List<MyBorrow> selectMyBorrowById(int userId);
  public List<MyBorrow> selectPage(HashMap hashMap);
}
