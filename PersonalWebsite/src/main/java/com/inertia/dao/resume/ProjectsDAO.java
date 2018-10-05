package com.inertia.dao.resume;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.inertia.beans.projects.Projects;
import com.inertia.beans.resume.Skills;

public interface ProjectsDAO {
	
	Projects getProjectById(int id);
	
	void deleteProject(int id);
	
	void upateProject(Projects project);
	
	void saveProject(Projects project);
	
	Collection<Projects> getAllProjects();
	
	Collection<Skills> getProjectsSkills(int id);
}
