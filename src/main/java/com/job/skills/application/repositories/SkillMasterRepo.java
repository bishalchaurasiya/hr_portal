package com.job.skills.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.skills.application.entities.SkillGroupMaster;

@Repository
public interface SkillMasterRepo extends JpaRepository<SkillGroupMaster,Integer>  {
	
}
