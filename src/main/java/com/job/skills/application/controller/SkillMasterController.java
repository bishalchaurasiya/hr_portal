package com.job.skills.application.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.job.skills.application.services.SkillMasterService;
import com.job.skills.application.entities.SkillGroupMaster;

@RestController
public class SkillMasterController {

	    @Autowired
		private SkillMasterService skillMasterService;
	   
	    @PostMapping("/addSkill")
	    public SkillGroupMaster addSkillMaster(@RequestBody SkillGroupMaster skillmaster) {
			return skillMasterService.saveSkill(skillmaster);	
	    }
	    
	    @PostMapping("/addSkills")
	    public List<SkillGroupMaster> addSkillMaster (@RequestBody List<SkillGroupMaster> skillmasters){
			return skillMasterService.saveSkills(skillmasters);
	    	
	    }
	    
	    @GetMapping ("/skills")
	    public List<SkillGroupMaster> findAllSkillMasters(){
			return skillMasterService.getSkills();
			
	    }
	    
	    @GetMapping ("/skill/{id}")
	    public SkillGroupMaster findSkillById(@PathVariable int id) {
			return skillMasterService.getSkillsById(id);	
	    	
	    }
	    
	    @PutMapping("/update")
	    public SkillGroupMaster updateSkillMaster(@RequestBody SkillGroupMaster skillmaster ) {
			return skillMasterService.updateSkillMaster(skillmaster);
				
	    }
	    
	    @DeleteMapping ("/delete/{id}")
	    public String deleteSkillMaster(@PathVariable int id) {
			return skillMasterService.deleteSkill(id);
	    	
	    }	
}
