package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int custid;
	@Column
	String custname;
	@Column
	String custemail;
	@Column
	String custcontactno;
	@Column
	String custaddress;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userid")
	Login userid;
	public Customer() {
		super();
	}
	public Customer( String custname, String custemail, String custcontactno, String custaddress,
			Login userid) {
		super();
		
		this.custname = custname;
		this.custemail = custemail;
		this.custcontactno = custcontactno;
		this.custaddress = custaddress;
		this.userid = userid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
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
	public Login getUserid() {
		return userid;
	}
	public void setUserid(Login userid) {
		this.userid = userid;
	}
	
	
	
}
