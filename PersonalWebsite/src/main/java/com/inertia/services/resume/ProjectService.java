package com.inertia.services.resume;

import java.util.ArrayList;

import com.inertia.beans.projects.Projects;

public interface ProjectService {
	
	Projects getProjectById(int id);
	
	void saveProject(Projects project);
	
	void updateProject(Projects project);
	
	void deleteProject(int id);
	
	ArrayList<Projects> getAllProjects();
}
