package com.inertia.controllers.perBlog;

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

import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.beans.resume.Education;
import com.inertia.services.perBlog.PerBlogService;;

@RequestMapping("/perBlog")
@Controller("perBlogController")
@CrossOrigin(origins = "http://localhost:4200")
public class PerBlogController {
	
	@Autowired
	PerBlogService perBlogService;

	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Collection<PerBlogEntry>> getAllEducation(){
		ArrayList<PerBlogEntry> entry = (ArrayList<PerBlogEntry>) perBlogService.getAll();
		if(entry != null) {
			return new ResponseEntity<>(entry, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(entry, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/published")
	@ResponseBody
	public ResponseEntity<Collection<PerBlogEntry>> getPublishedEntries(){
		ArrayList<PerBlogEntry> entry = (ArrayList<PerBlogEntry>) perBlogService.getPublished();
		if(entry != null) {
			return new ResponseEntity<>(entry, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(entry, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("get/{id}")
	@ResponseBody
	public ResponseEntity<PerBlogEntry> getEducationById(@PathVariable int id){
		PerBlogEntry entry = (PerBlogEntry) perBlogService.get(id);
		if(entry != null) {
			return new ResponseEntity<>(entry, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(entry, HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/save")
	public String saveEducation(@RequestBody PerBlogEntry entry) {
		perBlogService.saveEntry(entry);
		return entry.getTitle();
	}
	
	@PutMapping("/update")
	public String  updateEducation(@RequestBody PerBlogEntry entry) {
		perBlogService.updateEntry(entry);
		return entry.getTitle();
	}
	
	@PutMapping("/delete")
	public String deleteEducation(@RequestBody PerBlogEntry entry) {
		return perBlogService.deleteEntry(entry.getPerBlogEntryId());
	}
	
}
