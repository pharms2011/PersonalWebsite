package com.inertia.services;

import java.util.Collection;

import com.inertia.beans.resume.Skills;

public interface SkillsService {
	public Skills getSkill(int id);
	
	public void saveSkill(Skills skill);
	
	public void deleteSkill(int id);
	
	public void updateSkill(Skills skill);
	
	public Collection<Skills> getAll();
}
