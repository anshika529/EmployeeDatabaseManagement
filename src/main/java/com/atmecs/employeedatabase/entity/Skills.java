package com.atmecs.employeedatabase.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {
	@Id
	private int skill_id;
	private String Skill_name;

	@ManyToOne
	private Employee emp;

	public Skills() {
		super();
	}

	public Skills(int skill_id, String skill_name) {
		super();
		this.skill_id = skill_id;
		Skill_name = skill_name;
	}

	public int getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}

	public String getSkill_name() {
		return Skill_name;
	}

	public void setSkill_name(String skill_name) {
		Skill_name = skill_name;
	}

}
