package com.inertia.dao.resume;

import java.util.Collection;

import com.inertia.beans.resume.Education;

public interface EducationDAO {
	
	public Education getEducationById(int id);
	
	public Collection<Education> getAllEducation();
	
	public void saveEducation(Education education);
	
	public void updateEducation(Education education);
	
	public void deleteEducation(int id);
}
