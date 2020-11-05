package com.atmecs.employeedatabase.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	private String employee_name;
	private String email;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 private EmployeeDetails employeedetails;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private Set<Skills> skills;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_projects", joinColumns = {
			@JoinColumn(referencedColumnName = "emp_id")
	})
	private Set<Projects> projects;
	
	
	public Employee() {
		super();
	}
	public Employee(int emp_id, String employee_name, String email) {
		super();
		this.emp_id = emp_id;
		this.employee_name = employee_name;
		this.email = email;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	public EmployeeDetails getEmployeedetails() {
		return employeedetails;
	}
	public void setEmployeedetails(EmployeeDetails employeedetails) {
		this.employeedetails = employeedetails;
	}
	public Set<Skills> getSkills() {
		return skills;
	}
	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}
	public Set<Projects> getProjects() {
		return projects;
	}
	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}
	
	
	
	

}
