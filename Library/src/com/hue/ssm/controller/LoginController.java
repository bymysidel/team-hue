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
		//��ȡsessionID
		String sessionId = request.getSession().getId();
		//��ȡsession�е�user����
		
		
		if(user!=null){
			LoginSession loginSession = loginService.findLoginSessionById(id);
			//�ж��Ƿ�ͬһ�������¼��ͬһ���������һ��session��ͳһ������ٴε�¼��дsessionID�����ݿ⣬ֱ����ת
			if(loginSession!=null&&loginSession.getSessionId().equals(sessionId)){
				return "forward:myBorrow";
			}
			//�жϵ�ǰsessionId�Ƿ��session���е���ͬ������ͬ��˵�����˺��Ѿ�����һ�ص��½��
			if(loginSession!=null&&!loginSession.getSessionId().equals(sessionId)){
				request.setAttribute("msg","�����������ط���½�������˳���");
				return "forward:loginPage";
			}
			
			//�ж������˺��Ƿ���ȷ
			if(id==user.getUserId()&&password.equals(user.getPassword())){
				request.getSession().setAttribute("user_session",user);
				
				//����service��sessionId  ͬuserId д�����ݿ�
				loginService.saveLoginSession(id,sessionId);
				return "redirect:myBorrow";
			}else{
				request.setAttribute("msg","�������");
				return "forward:loginPage";
			}
			
		}else{
			request.setAttribute("msg","û�и��û���");
			return "forward:loginPage";
		}
		
			
				
	}
	@RequestMapping("loginPage")
	public String loginPage(){
		return "login";
	}
}
