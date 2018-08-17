package com.inertia.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inertia.beans.Skills;
import com.inertia.dao.SkillsDAO;
import com.inertia.dao.SkillsDAOImpl;

@Service("skillsService")
public class SkillsServiceImpl implements SkillsService{
	@Autowired
	SkillsDAO skillsDAO;
	
	public Skills getSkill(int id){
		return skillsDAO.getSkillById(id);
	}
	
	public void saveSkill(Skills skill){
		skillsDAO.saveSkill(skill);
	}
	
	public void deleteSkill(int id){
		skillsDAO.deleteSkill(id);
	}
	
	public void updateSkill(Skills skill){
		skillsDAO.updateSkill(skill);
	}
	
	public Collection<Skills> getAll(){
		return skillsDAO.getSkills();
	}
}
