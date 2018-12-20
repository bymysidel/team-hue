package com.hue.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hue.ssm.service.LogoutService;

@Controller
public class LogoutController {
	@Autowired
	private LogoutService logoutService;
	@RequestMapping("logout")
	public String logout(HttpServletRequest request){
		//获取session，得到sessionId后从数据库中查找该session的记录并删除，接着销毁session
		HttpSession session = request.getSession();
		String sessionId  =  session.getId();
		logoutService.deleteLoginSession(sessionId);
		System.out.println("session记录删除");
		
		request.getSession().invalidate();
		System.out.println("session销毁");
		return "redirect:loginPage";
		
	}
}
