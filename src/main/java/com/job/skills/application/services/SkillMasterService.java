package com.job.skills.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.skills.application.entities.SkillGroupMaster;
import com.job.skills.application.repositories.SkillMasterRepo;

@Service
public class SkillMasterService {

	@Autowired
	private SkillMasterRepo repo;
    
    //Post:It will save single skill object
    public SkillGroupMaster saveSkill(SkillGroupMaster skillmaster) {
		return repo.save(skillmaster);

    }
    //Post:It will save List of Multiple skills objects.
    public List<SkillGroupMaster> saveSkills(List<SkillGroupMaster> skillmaster) {
		return repo.saveAll(skillmaster);
    	
    }         
    
    //Get: It will return all the skills available in DB
    public List<SkillGroupMaster> getSkills(){
    	return repo.findAll();
    	
    }
    //Get: It will return the specific skill based on the Id 
    public SkillGroupMaster getSkillsById(int id) {
		return repo.findById(id).orElse(null);
    	
    }
    //Delete
    public String deleteSkill (int id) {
		repo.deleteById(id);
		return "Skill removed!!" + id;
    	
    }
	//Update
	public SkillGroupMaster updateSkillMaster(SkillGroupMaster skillMaster) {
		SkillGroupMaster existingSkillMaster=repo.findById(skillMaster.getSkill_group_id()).orElse(null);
		existingSkillMaster.setSkill_group_name(skillMaster.getSkill_group_name());
      //existingSkillMaster.setSkill_group_id(skillMaster.getSkill_group_id());
		return repo.save(existingSkillMaster);
	}
	
    }
