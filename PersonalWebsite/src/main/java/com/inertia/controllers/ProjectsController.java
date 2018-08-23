package com.inertia.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inertia.beans.Projects;
import com.inertia.services.ProjectService;

@RequestMapping("/projects")
@Controller("projectsContoller")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectsController {

	@Autowired
	ProjectService projectsService;
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Collection<Projects>> getAllProjects() {
		ArrayList<Projects> projects = projectsService.getAllProjects();
		if(projects != null) {
			return new ResponseEntity<>(projects, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Projects> getProject(@PathVariable int id){
		Projects project = projectsService.getProjectById(id);
		if(project != null) {
			return new ResponseEntity<>(project, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/save")
	public Projects saveProject(@RequestBody Projects project) {
		projectsService.saveProject(project);
		return project;
	}
	
	@PutMapping("/update")
	public Projects updateProject(Projects project) {
		projectsService.updateProject(project);
		return project;
	}
}
