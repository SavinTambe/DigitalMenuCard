package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logindetails")
public class Login
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int userid;
	@Column
String username;
	@Column
String password;
	@Column
String Role;
	public Login() {
		super();
	}
	public Login(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		Role = role;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}

	
	
	
}
