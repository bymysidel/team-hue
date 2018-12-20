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
		//��ȡsession���õ�sessionId������ݿ��в��Ҹ�session�ļ�¼��ɾ������������session
		HttpSession session = request.getSession();
		String sessionId  =  session.getId();
		logoutService.deleteLoginSession(sessionId);
		System.out.println("session��¼ɾ��");
		
		request.getSession().invalidate();
		System.out.println("session����");
		return "redirect:loginPage";
		
	}
}
