package com.hue.ssm.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hue.ssm.service.LoginService;
import com.hue.ssm.serviceImpl.LoginServiceImpl;


public class ApplicationContextListener implements ServletContextListener{
	private LoginService loginService;

	/*public  void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}*/
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//ServletContextListener.super.contextDestroyed(sce);
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ServletContext sc = sce.getServletContext();
		final WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(sc);
		        
		        
		if(applicationContext!=null){
			
			loginService = (LoginService)applicationContext.getBean("LoginServiceImpl");
			loginService.initLoginSession();
			System.out.println("登陆系统已初始化");
		}else{
			System.out.println("获取application上下文失败");
		}
		
	}
	
}	
