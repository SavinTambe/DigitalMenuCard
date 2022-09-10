package com.example.demo.entities;

public class CustomerRegister {
String custname;
String username;
String custemail;
String custcontactno;
String custaddress;
String password;
String role;
public CustomerRegister() {
	super();
}
public CustomerRegister(String custname, String username, String custemail, String custcontactno, String custaddress,
		String password, String role) {
	super();
	this.custname = custname;
	this.username = username;
	this.custemail = custemail;
	this.custcontactno = custcontactno;
	this.custaddress = custaddress;
	this.password = password;
	this.role = role;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCustemail() {
	return custemail;
}
public void setCustemail(String custemail) {
	this.custemail = custemail;
}
public String getCustcontactno() {
	return custcontactno;
}
public void setCustcontactno(String custcontactno) {
	this.custcontactno = custcontactno;
}
public String getCustaddress() {
	return custaddress;
}
public void setCustaddress(String custaddress) {
	this.custaddress = custaddress;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
 
 
 
 
}
