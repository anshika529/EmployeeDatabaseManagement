package com.atmecs.employeedatabase.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	private String name;

	
	private int emp_id;
private EmployeeDetails empdetails;

@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")


	public EmployeeDetails getEmpdetails() {
	return empdetails;
}

public void setEmpdetails(EmployeeDetails empdetails) {
	this.empdetails = empdetails;
}

	public Employee() {
		super();
	}

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return emp_id;
	}

	public void setId(int emp_id) {
		this.emp_id = emp_id;
	}
}
