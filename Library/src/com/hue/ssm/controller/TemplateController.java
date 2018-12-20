package com.hue.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
	@RequestMapping("templatePage")
	public String template(){
		return "template";
		
	}
}
