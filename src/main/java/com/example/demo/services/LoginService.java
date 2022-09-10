package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository lrepo;
	public List<Login> getAll(){
		return lrepo.findAll();
	}
	
	public Login add(Login l) {
		return lrepo.save(l);
	}
}
