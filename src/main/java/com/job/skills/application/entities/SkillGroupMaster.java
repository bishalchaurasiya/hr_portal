package com.job.skills.application.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class SkillGroupMaster {
	
	public SkillGroupMaster() {
		
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int skill_group_id;
	private String skill_group_name;
    // private String skills_name;
	
	@OneToMany (targetEntity = SkillMaster.class,cascade = CascadeType.ALL)
	@JoinColumn (name="ss_fk",referencedColumnName = "skill_group_id")
	private List<SkillMaster> skillmaster;
	public SkillGroupMaster(int skill_group_id, String skill_group_name, List<SkillMaster> skillmaster) {
		super();
		this.skill_group_id = skill_group_id;
		this.skill_group_name = skill_group_name;
		this.skillmaster = skillmaster;
	}
	public int getSkill_group_id() {
		return skill_group_id;
	}
	public void setSkill_group_id(int skill_group_id) {
		this.skill_group_id = skill_group_id;
	}
	public String getSkill_group_name() {
		return skill_group_name;
	}
	public void setSkill_group_name(String skill_group_name) {
		this.skill_group_name = skill_group_name;
	}
	public List<SkillMaster> getSkillmaster() {
		return skillmaster;
	}
	public void setSkillmaster(List<SkillMaster> skillmaster) {
		this.skillmaster = skillmaster;
	}
	@Override
	public String toString() {
		return "SkillGroupMaster [skill_group_id=" + skill_group_id + ", skill_group_name=" + skill_group_name
				+ ", skillmaster=" + skillmaster + "]";
	}
	
	
	
}