package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Login;

import com.example.demo.services.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService lservice;
	@GetMapping("/alllogin")
	public List<Login> getAll(){
		return lservice.getAll();
	}
}
