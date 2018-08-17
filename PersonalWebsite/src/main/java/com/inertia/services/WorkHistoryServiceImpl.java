package com.inertia.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inertia.beans.WorkHistory;
import com.inertia.dao.WorkHistoryDAO;

@Service("workHistoryService")
public class WorkHistoryServiceImpl implements WorkHistoryService{
	
	@Autowired
	WorkHistoryDAO workHistoryDAO;
	
	@Override
	public WorkHistory getWorkHistoryById(int id) {
		return workHistoryDAO.getWorkHistoryById(id);
	}

	@Override
	public ArrayList<WorkHistory> getAllWorkHistory() {
		return (ArrayList<WorkHistory>) workHistoryDAO.getAllWorkHistory();
	}

	@Override
	public void saveWorkHistory(WorkHistory workHistory) {
		workHistoryDAO.saveWorkHistory(workHistory);
	}

	@Override
	public void updateWorkHistory(WorkHistory workHistory) {
		workHistoryDAO.updateWorkHistory(workHistory);
	}

	@Override
	public void deleteWorkHistory(int id) {
		workHistoryDAO.deleteWorkHistory(id);
	}

}
