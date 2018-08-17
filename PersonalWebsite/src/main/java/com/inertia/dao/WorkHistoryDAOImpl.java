package com.inertia.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.Skills;
import com.inertia.beans.WorkHistory;
import com.inertia.util.HibernateUtil;

@Repository("workHistoryDAO")
public class WorkHistoryDAOImpl implements WorkHistoryDAO{

	@Override
	public WorkHistory getWorkHistoryById(int id) {
		Session s = HibernateUtil.getSession();
		WorkHistory workHistory = (WorkHistory)s.get(WorkHistory.class, id);
		s.close();
		return workHistory;
	}

	@Override
	public Collection<WorkHistory> getAllWorkHistory() {
		Session s = HibernateUtil.getSession();
		ArrayList<WorkHistory> allWorkHistory = (ArrayList<WorkHistory>) s.createQuery("from WorkHistory").list();
		s.close();
		return allWorkHistory;
	}

	@Override
	public void saveWorkHistory(WorkHistory workHistory) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.persist(workHistory);
		tx.commit();
		s.close();
	}

	@Override
	public void updateWorkHistory(WorkHistory workHistory) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(workHistory);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteWorkHistory(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		WorkHistory workHistory = (WorkHistory)s.get(WorkHistory.class, id);
		s.delete(workHistory);
		tx.commit();
		s.close();
	}

}
