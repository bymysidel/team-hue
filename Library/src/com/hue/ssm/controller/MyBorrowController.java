package com.hue.ssm.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.hue.ssm.pojo.MyBorrow;
import com.hue.ssm.pojo.User;
import com.hue.ssm.service.MyBorrowService;

@Controller
public class MyBorrowController {
@Autowired
private MyBorrowService myBorrowService;
	
@RequestMapping("myBorrowList")
public @ResponseBody List<MyBorrow> myBorrowList(HttpServletRequest request,String currentPage,String pageSize){
	User user = (User)request.getSession().getAttribute("user_session");
	int userId = user.getUserId();
	System.out.println(pageSize);
	return myBorrowService.findPages(currentPage,pageSize,userId);
}
@RequestMapping("myBorrowCounts")
public @ResponseBody HashMap<String, Integer> myBorrowCounts(HttpServletRequest request){
	User user = (User)request.getSession().getAttribute("user_session");
    List<MyBorrow> list = myBorrowService.findMyBorrow(user.getUserId());
	HashMap<String, Integer> hashMap = new HashMap<>();
	hashMap.put("counts",list.size());
	return hashMap;
}


}
