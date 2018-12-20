package com.hue.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hue.ssm.pojo.LoginSession;
import com.hue.ssm.pojo.User;
import com.hue.ssm.service.LoginService;

public class LoginInterceptor implements HandlerInterceptor {
	@Autowired
	private LoginService loginService;
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		User user = null;
		HttpSession session = request.getSession();
		String uri = request.getRequestURI();
		//����¼�����⣬����������
		if(uri.contains("login")){
			System.out.println("��½��������uri true");
			
			return true;
				
			

		}
		//��ȡsession�ж��Ƿ��¼
		
		user = (User)session.getAttribute("user_session");
		if(user!=null){
			System.out.println("��½���������ѵ�¼״̬");
			return true;
		}
		request.setAttribute("msg","����δ��¼�����ȵ�¼��");
		System.out.println("��½��������δ��¼״̬");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}
	
}
