package com.atmecs.employeedatabase.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Projects {
	@Id
	@Column(name = "id")
	private int project_id;
	private String project_name;
	private String report_manager;

	@ManyToMany(mappedBy = "projects")
	private Set<Employee> employee;

	public Projects() {
		super();
	}

	public Projects(int project_id, String project_name, String report_manager) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.report_manager = report_manager;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getReport_manager() {
		return report_manager;
	}

	public void setReport_manager(String report_manager) {
		this.report_manager = report_manager;
	}

}
