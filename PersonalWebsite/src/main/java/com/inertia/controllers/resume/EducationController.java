package com.inertia.controllers.resume;

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

import com.inertia.beans.resume.Education;
import com.inertia.services.resume.EducationServiceImpl;

@RequestMapping("/education")
@Controller("educationController")
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {
	
	@Autowired
	private EducationServiceImpl educationService;
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Collection<Education>> getAllEducation(){
		ArrayList<Education> Education = (ArrayList<Education>) educationService.getAllEducation();
		if(Education != null) {
			return new ResponseEntity<>(Education, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(Education, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("get/{id}")
	@ResponseBody
	public ResponseEntity<Education> getEducationById(@PathVariable int id){
		Education education = (Education) educationService.getEducationById(id);
		if(education != null) {
			return new ResponseEntity<>(education, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(education, HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/save")
	public Education saveEducation(@RequestBody Education education) {
		educationService.saveEducation(education);
		return education;
	}
	
	@PutMapping("/update")
	public Education updateEducation(@RequestBody Education education) {
		educationService.updateEducation(education);
		return education;
	}
	
	@PutMapping("/delete")
	public Education deleteEducation(@RequestBody Education education) {
		educationService.deleteEducation(education.getId());
		return education;
	}
}
