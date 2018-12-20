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
		//³ýµÇÂ¼ÇëÇóÍâ£¬¶¼½øÐÐÀ¹½Ø
		if(uri.contains("login")){
			System.out.println("µÇÂ½À¹½ØÆ÷£ºuri true");
			
			return true;
				
			

		}
		//»ñÈ¡sessionÅÐ¶ÏÊÇ·ñµÇÂ¼
		
		user = (User)session.getAttribute("user_session");
		if(user!=null){
			System.out.println("µÇÂ½À¹½ØÆ÷£ºÒÑµÇÂ¼×´Ì¬");
			return true;
		}
		request.setAttribute("msg","Äú»¹Î´µÇÂ¼£¬ÇëÏÈµÇÂ¼£¡");
		System.out.println("µÇÂ½À¹½ØÆ÷£ºÎ´µÇÂ¼×´Ì¬");
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		return false;
	}
	
}
