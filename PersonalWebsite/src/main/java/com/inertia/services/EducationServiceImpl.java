package com.inertia.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inertia.beans.Education;
import com.inertia.dao.EducationDAO;

@Service("educationService")
public class EducationServiceImpl implements EducationService{

	@Autowired
	EducationDAO educationDAO;
	
	@Override
	public Education getEducationById(int id) {
		return educationDAO.getEducationById(id);
	}

	@Override
	public ArrayList<Education> getAllEducation() {
		return (ArrayList<Education>) educationDAO.getAllEducation();
	}

	@Override
	public void saveEducation(Education education) {
		educationDAO.saveEducation(education);
	}

	@Override
	public void updateEducation(Education education) {
		educationDAO.updateEducation(education);
	}

	@Override
	public void deleteEducation(int id) {
		educationDAO.deleteEducation(id);
	}

}
