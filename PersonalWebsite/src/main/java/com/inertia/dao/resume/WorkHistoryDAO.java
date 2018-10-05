package com.inertia.dao.resume;

import java.util.Collection;

import com.inertia.beans.resume.WorkHistory;

public interface WorkHistoryDAO {
	
	public WorkHistory getWorkHistoryById(int id);
	
	public Collection<WorkHistory> getAllWorkHistory();
	
	public void saveWorkHistory(WorkHistory workHistory);
	
	public void updateWorkHistory(WorkHistory workHistory);
	
	public void deleteWorkHistory(int id);
}
