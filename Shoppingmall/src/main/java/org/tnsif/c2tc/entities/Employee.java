package org.tnsif.c2tc.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Employee {
	@Id
 private long id;
 private String name;
 private LocalDate dob;
 private float salary;
 private String address;
 private String designation;
 private String shop;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getShop() {
	return shop;
}
public void setShop(String shop) {
	this.shop = shop;
}
 
 
}
