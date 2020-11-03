package com.cg.spring.rest.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Employee {
 
 	// Defining employee id as primary key
 	@Id
 	@Column
 	private int eid;
 	@Column
 	private String name;
 	@Column
 	private double salary;
 
 	public int getEid() {
       	return eid;
 	}
 
 	public void setEid(int eid) {
       	this.eid = eid;
 	}
 
 	public String getName() {
       	return name;
 	}
 
 	public void setName(String name) {
       	this.name = name;
 	}
 
 	public double getSalary() {
       	return salary;
 	}
 
 	public void setSalary(double salary) {
       	this.salary = salary;
 	}
 
}
 
