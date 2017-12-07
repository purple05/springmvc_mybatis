package com.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.User;
import com.ssm.service.UserService;

@Controller
public class UserController {
	@Resource(name="uservice")
	private UserService us;
	
	@RequestMapping("/index.do")
	public void index(){
		User user = us.findByName("test2");
		System.out.println(user);
	}
}
