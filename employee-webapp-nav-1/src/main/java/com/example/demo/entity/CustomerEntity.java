package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int custid;
@Column
String custname;
@Column
String custadd;
public CustomerEntity() {
	
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
public String getCustadd() {
	return custadd;
}
public void setCustadd(String custadd) {
	this.custadd = custadd;
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", custname=" + custname + ", custadd=" + custadd + "]";
}
public CustomerEntity(int custid, String custname, String custadd) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.custadd = custadd;
}
}