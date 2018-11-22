package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public Map<String, Object> getUser(Integer userId) {
		return userService.getUser(userId);
	}
	@GetMapping("/test2")
	public String a() {
		return "aaa";
	}
}
