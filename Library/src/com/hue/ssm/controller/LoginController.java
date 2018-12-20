package com.hue.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hue.ssm.pojo.LoginSession;
import com.hue.ssm.pojo.User;
import com.hue.ssm.service.LoginService;
import com.hue.ssm.service.UserService;

@Controller
public class LoginController {
	@Autowired 
	private UserService userService;
	@Autowired
	private LoginService loginService;
	@RequestMapping("login")
	public String login(HttpServletRequest request,String userId,String password){
		int id = Integer.parseInt(userId);
		User user = userService.findUserById(id);
		//获取sessionID
		String sessionId = request.getSession().getId();
		//获取session中的user对象
		
		
		if(user!=null){
			LoginSession loginSession = loginService.findLoginSessionById(id);
			//判断是否同一浏览器登录（同一浏览器共用一个session）统一浏览器再次登录则不写sessionID入数据库，直接跳转
			if(loginSession!=null&&loginSession.getSessionId().equals(sessionId)){
				return "forward:myBorrow";
			}
			//判断当前sessionId是否和session表中的相同，不相同则说明该账号已经在另一地点登陆了
			if(loginSession!=null&&!loginSession.getSessionId().equals(sessionId)){
				request.setAttribute("msg","你已在其他地方登陆，请先退出！");
				return "forward:loginPage";
			}
			
			//判断密码账号是否正确
			if(id==user.getUserId()&&password.equals(user.getPassword())){
				request.getSession().setAttribute("user_session",user);
				
				//调用service将sessionId  同userId 写进数据库
				loginService.saveLoginSession(id,sessionId);
				return "redirect:myBorrow";
			}else{
				request.setAttribute("msg","密码错误！");
				return "forward:loginPage";
			}
			
		}else{
			request.setAttribute("msg","没有该用户！");
			return "forward:loginPage";
		}
		
			
				
	}
	@RequestMapping("loginPage")
	public String loginPage(){
		return "login";
	}
}
