package com.ssm.dao;

import org.springframework.stereotype.Repository;

import com.ssm.entity.User;
@Repository("udao")
public interface UserDAO {
	void save(User user);
	User findByName(String name);
}
