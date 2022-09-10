package com.example.demo.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Login;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class CustomerController {
@Autowired
CustomerService cservice;

@Autowired
LoginService lservice;

@GetMapping("/all")
public List<Customer> getAll(){
	return cservice.getAll();
}

@PostMapping("/registerc")
public  Customer registerCustomer(@RequestBody CustomerRegister cr) {

	Login l=new Login(cr.getUsername(),cr.getPassword(),"customer");
	Login inserted =lservice.add(l);
	Customer c=new Customer( cr.getCustname(),cr.getCustemail(),cr.getCustcontactno(),cr.getCustaddress(), inserted);
	
	return cservice.add(c);
}


}
