package com.dtu.bluecats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtu.bluecats.entity.User;
import com.dtu.bluecats.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return service.save(user);
	}
}
