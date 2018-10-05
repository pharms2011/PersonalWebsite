package com.inertia.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inertia.beans.projects.Projects;
import com.inertia.dao.resume.ProjectsDAO;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectsDAO projectsDAO;

	@Override
	public Projects getProjectById(int id) {
		return projectsDAO.getProjectById(id);
	}

	@Override
	public ArrayList<Projects> getAllProjects() {
		return (ArrayList<Projects>) projectsDAO.getAllProjects();
	}

	@Override
	public void saveProject(Projects project) {
		projectsDAO.saveProject(project);
	}

	@Override
	public void updateProject(Projects project) {
		projectsDAO.upateProject(project);
	}

	@Override
	public void deleteProject(int id) {
		projectsDAO.deleteProject(id);
	}

}
