package com.sgic.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.start.criteria.UserCriteria;
import com.sgic.start.entity.User;
import com.sgic.start.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("user/search")
	public List<User> searchUser(UserCriteria userCriteria){
		return userService.search(userCriteria);
	}
	
	@GetMapping("user")
	public List<User> findByFirstName(String name){
		return userService.findByFirstName(name);
	}
}
