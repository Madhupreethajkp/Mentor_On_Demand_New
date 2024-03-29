package com.example.Microservice.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice.model.Admin;
import com.example.Microservice.repo.AdminRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminRepository adminrepo;
	
	@GetMapping("/login/{username}/{password}")
	public Admin checkUser(@PathVariable ("username") String username,@PathVariable ("password") String password)
	{
		System.out.println("login");
		Admin _admin=adminrepo.findUser(username,password);
		System.out.println("login");
		return _admin;
	}
	

	
}
