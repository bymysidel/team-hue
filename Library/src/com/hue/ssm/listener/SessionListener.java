package com.hue.ssm.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hue.ssm.pojo.User;
import com.hue.ssm.service.LogoutService;


public class SessionListener implements HttpSessionListener {
	//不能使用注解注入
	private LogoutService logoutService;
    public  void setLogoutService(LogoutService logoutService) {
		this.logoutService = logoutService;
	}
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		HttpSessionListener.super.sessionCreated(se);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
	
		
		
		
		HttpSession session = se.getSession();
		ServletContext sc = session.getServletContext();
		//获取web容器（spring整合后）
		ApplicationContext applicationContext  = WebApplicationContextUtils.getWebApplicationContext(sc);
		
		String sessionId = session.getId();
		logoutService = (LogoutService)applicationContext.getBean("logoutServiceImpl");
		logoutService.deleteLoginSession(sessionId);
		System.out.println("session超时自动注销");

	}
	
}
