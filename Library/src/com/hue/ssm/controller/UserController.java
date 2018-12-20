package com.hue.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
@RequestMapping("myBorrow")
public String myBorrow(){
	
	return "myBorrow";
}
}
