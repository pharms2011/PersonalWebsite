package com.inertia.dao;

import java.util.Collection;

import com.inertia.beans.Education;

public interface EducationDAO {
	
	public Education getEducationById(int id);
	
	public Collection<Education> getAllEducation();
	
	public void saveEducation(Education education);
	
	public void updateEducation(Education education);
	
	public void deleteEducation(int id);
}
