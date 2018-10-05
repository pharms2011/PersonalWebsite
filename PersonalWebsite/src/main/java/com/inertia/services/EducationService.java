package com.inertia.services;

import java.util.ArrayList;

import com.inertia.beans.resume.Education;

public interface EducationService {
	
	public Education getEducationById(int id);
	
	public ArrayList<Education> getAllEducation();
	
	public void saveEducation(Education education);
	
	public void updateEducation(Education education);
	
	public void deleteEducation(int id);
}
