package com.inertia.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.Education;
import com.inertia.util.HibernateUtil;

@Repository("educationDAO")
public class EducationDAOImpl implements EducationDAO{

	@Override
	public Education getEducationById(int id) {
		Session s = HibernateUtil.getSession();
		Education education = (Education)s.get(Education.class, id);
		s.close();
		return education;
	}

	@Override
	public Collection<Education> getAllEducation() {
		Session s = HibernateUtil.getSession();
		ArrayList<Education> alleducation = (ArrayList<Education>) s.createQuery("from Education").list();
		s.close();
		return alleducation;
	}

	@Override
	public void saveEducation(Education education) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.persist(education);
		tx.commit();
		s.close();
	}

	@Override
	public void updateEducation(Education education) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(education);
		tx.commit();
		s.close();
	}

	@Override
	public void deleteEducation(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Education education = (Education)s.get(Education.class, id);
		s.delete(education);
		tx.commit();
		s.close();
	}

}
