package com.example.taskManager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.taskManager.Entity.user;
import com.example.taskManager.Repository.userRepo;

@Service
public class userService {
	@Autowired
	userRepo userrepo;
	public int getUserId(String name, String pass) {
		return userrepo.findByNameAndPass(name,pass);
	}
	
	public void Registeruser(user User) {
		userrepo.save(User);
	}

}
