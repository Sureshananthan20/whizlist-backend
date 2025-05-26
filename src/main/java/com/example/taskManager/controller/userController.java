package com.example.taskManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskManager.Entity.user;
import com.example.taskManager.Service.userService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class userController {
	@Autowired
	userService userservice;
	
	@PostMapping("/register")
	public String Register(@RequestParam String name ,@RequestParam String pass) {
		user User=new user();
		User.setUsername(name);
		User.setPassword(pass);
		userservice.Registeruser(User);
		return "Registered sucessfully Go back to Login Page!!!";
	}
	
	@GetMapping("/login")
	public int getUserId(@RequestParam String username,@RequestParam String password) {
		
		return userservice.getUserId(username,password);
	}

	
}
