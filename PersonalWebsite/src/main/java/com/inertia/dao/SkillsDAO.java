package com.inertia.dao;

import java.util.Collection;

import com.inertia.beans.Skills;

public interface SkillsDAO {
	
	public Collection<Skills> getSkills();
	
	public Skills getSkillById(int id);
	
	public boolean deleteSkill(int id);
	
	public boolean saveSkill(Skills skill);
	
	public boolean updateSkill(Skills skill);
}
