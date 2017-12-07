package com.ssm.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserDAO;
import com.ssm.entity.User;
@Service("uservice")
public class UserService {
	@Resource(name="udao")
	private UserDAO udao;
	
	public User findByName(String sname){
		return udao.findByName(sname);
	}
}
