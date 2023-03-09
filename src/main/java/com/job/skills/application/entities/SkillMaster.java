package com.job.skills.application.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkillMaster {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int skill_id;
	private String skill_name;
	public SkillMaster(int skill_id, String skill_name) {
		super();
		this.skill_id = skill_id;
		this.skill_name = skill_name;
	}
	public int getSkill_id() {
		return skill_id;
	}
	public void setSkill_id(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public SkillMaster() {
		
	}
	@Override
	public String toString() {
		return "SkillMaster [skill_id=" + skill_id + ", skill_name=" + skill_name + "]";
	}
	
	
}
