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

import com.inertia.beans.WorkHistory;
import com.inertia.services.WorkHistoryServiceImpl;

@RequestMapping("/workHistory")
@Controller("workHistoryController")
@CrossOrigin(origins = "http://localhost:4200")
public class WorkHistoryController {

	@Autowired
	private WorkHistoryServiceImpl workHistoryService;
	
	@GetMapping("/all")
	@ResponseBody
	public ResponseEntity<Collection<WorkHistory>> getAllWorkHistory(){
		ArrayList<WorkHistory> WorkHistory = (ArrayList<WorkHistory>) workHistoryService.getAllWorkHistory();
		if(WorkHistory != null) {
			return new ResponseEntity<>(WorkHistory, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(WorkHistory, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<WorkHistory> getWorkHistoryById(@PathVariable int id){
		WorkHistory WorkHistory = (WorkHistory) workHistoryService.getWorkHistoryById(id);
		if(WorkHistory != null) {
			return new ResponseEntity<>(WorkHistory, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(WorkHistory, HttpStatus.NO_CONTENT);
		}
	}
	
	@PostMapping("/save")
	public WorkHistory saveWorkHistory(@RequestBody WorkHistory WorkHistory) {
		workHistoryService.saveWorkHistory(WorkHistory);
		return WorkHistory;
	}
	
	@PutMapping("/update")
	public WorkHistory updateWorkHistory(@RequestBody WorkHistory WorkHistory) {
		workHistoryService.updateWorkHistory(WorkHistory);
		return WorkHistory;
	}
	
	@PutMapping("/delete")
	public WorkHistory deleteWorkHistory(@RequestBody WorkHistory workHistory) {
		workHistoryService.deleteWorkHistory(workHistory.getWorkHistoryId());
		return workHistory;
	}
}
