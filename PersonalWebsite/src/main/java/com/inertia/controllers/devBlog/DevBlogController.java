package com.inertia.controllers.devBlog;

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

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.services.devBlog.DevBlogService;
import com.inertia.services.perBlog.PerBlogService;

@RequestMapping("/devBlog")
@Controller("perBlogController")
@CrossOrigin(origins = "http://localhost:4200")
public class DevBlogController {
	
	@Autowired
	DevBlogService devBlogService;
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Collection<DevBlogEntry>> getAllEducation(){
		ArrayList<DevBlogEntry> entry = (ArrayList<DevBlogEntry>) devBlogService.getAll();
		if(entry != null) {
			return new ResponseEntity<>(entry, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(entry, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/published")
	@ResponseBody
	public ResponseEntity<Collection<DevBlogEntry>> getPublishedEntries(){
		ArrayList<DevBlogEntry> entry = (ArrayList<DevBlogEntry>) devBlogService.getPublished();
		if(entry != null) {
			return new ResponseEntity<>(entry, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(entry, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("get/{id}")
	@ResponseBody
	public ResponseEntity<DevBlogEntry> getEducationById(@PathVariable int id){
		DevBlogEntry entry = (DevBlogEntry) devBlogService.getDevBlogEntry(id);
		if(entry != null) {
			return new ResponseEntity<>(entry, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(entry, HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/save")
	public String saveEducation(@RequestBody DevBlogEntry entry) {
		devBlogService.saveDevBlogEntry(entry);
		return entry.getTitle();
	}
	
	@PutMapping("/update")
	public String  updateEducation(@RequestBody DevBlogEntry entry) {
		devBlogService.updateEntry(entry);
		return entry.getTitle();
	}
	
	@PutMapping("/delete")
	public String deleteEducation(@RequestBody PerBlogEntry entry) {
		return devBlogService.deleteDevBlogEntry(entry.getPerBlogEntryId());
	}

}
