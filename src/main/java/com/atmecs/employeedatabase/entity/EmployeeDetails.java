package com.atmecs.employeedatabase.entity;

public class EmployeeDetails {
	private int id;
	private int salary;
	private int experience;

	public EmployeeDetails(int id, int salary, int experience) {
		super();
		this.id = id;
		this.salary = salary;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
