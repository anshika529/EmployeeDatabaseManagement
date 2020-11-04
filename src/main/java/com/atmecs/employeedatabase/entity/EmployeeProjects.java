package com.atmecs.employeedatabase.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class EmployeeProjects {
	private int project_id;
private String name;

public EmployeeProjects(int project_id, String name) {
	super();
	this.project_id = project_id;
	this.name = name;
}
public EmployeeProjects() {
	super();
}

public int getProject_id() {
	return project_id;
}
public void setProject_id(int project_id) {
	this.project_id = project_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}



}
