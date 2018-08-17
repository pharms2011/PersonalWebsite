package com.inertia.services;

import java.util.ArrayList;

import com.inertia.beans.WorkHistory;

public interface WorkHistoryService {
	
	public WorkHistory getWorkHistoryById(int id);
	
	public ArrayList<WorkHistory> getAllWorkHistory();
	
	public void saveWorkHistory(WorkHistory workHistory);
	
	public void updateWorkHistory(WorkHistory workHistory);
	
	public void deleteWorkHistory(int id);
}
