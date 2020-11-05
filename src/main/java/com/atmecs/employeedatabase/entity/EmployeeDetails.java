package com.atmecs.employeedatabase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class EmployeeDetails {
	@Id
	@Column(name="emp_detail_id")
	private int emp_detail_id;
	private String salary;
	private String experience;
	private String hobby;
	
	
	public EmployeeDetails() {
		super();
	}


	public EmployeeDetails(int emp_detail_id, String salary, String experience, String hobby) {
		super();
		this.emp_detail_id = emp_detail_id;
		this.salary = salary;
		this.experience = experience;
		this.hobby = hobby;
	}


	public int getEmp_detail_id() {
		return emp_detail_id;
	}


	public void setEmp_detail_id(int emp_detail_id) {
		this.emp_detail_id = emp_detail_id;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	
	

}
