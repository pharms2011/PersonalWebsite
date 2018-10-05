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

import com.inertia.beans.resume.Skills;
import com.inertia.services.SkillsServiceImpl;

@RequestMapping("/skills")
@Controller("skillsController")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillsController {
	
	@Autowired
	private SkillsServiceImpl skillService;
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Collection<Skills>> getAllSkills(){
		ArrayList<Skills> skills = (ArrayList<Skills>) skillService.getAll();
		if(skills != null) {
			return new ResponseEntity<>(skills, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(skills, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Skills> getSkillById(@PathVariable int id){
		Skills skill = (Skills) skillService.getSkill(id);
		if(skill != null) {
			return new ResponseEntity<>(skill, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(skill, HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/save")
	public Skills saveSkill(@RequestBody Skills skill) {
		skillService.saveSkill(skill);
		return skill;
	}
	
	@PutMapping("/update")
	public Skills updateSkill(@RequestBody Skills skill) {
		skillService.updateSkill(skill);
		return skill;
	}
	
	@PutMapping("/delete")
	public Skills deleteSkill(@RequestBody Skills skill) {
		skillService.deleteSkill(skill.getSkillsId());
		return skill;
	}
}
