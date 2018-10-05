package com.inertia.dao.resume;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.projects.Projects;
import com.inertia.beans.resume.Skills;
import com.inertia.util.HibernateUtil;

@Repository("projectsDAO")
public class ProjectsDAOImpl implements ProjectsDAO{

	@Override
	public Projects getProjectById(int id) {
		Session s = HibernateUtil.getSession();
		Projects project = (Projects)s.get(Projects.class, id);
		System.out.println(project + " "+id);
		s.close();
		return project;
	}

	@Override
	public void deleteProject(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Projects project = (Projects)s.get(Projects.class, id);
		s.delete(project);
		tx.commit();
	}

	@Override
	public void upateProject(Projects project) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(project);
		tx.commit();
	}

	@Override
	public void saveProject(Projects project) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.persist(project);
		tx.commit();
	}

	@Override
	public Collection<Skills> getProjectsSkills(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Projects project = (Projects)s.get(Projects.class, id);
		tx.commit();
		return project.getSkills();
	}

	@Override
	public Collection<Projects> getAllProjects() {
		Session s = HibernateUtil.getSession();
		ArrayList<Projects> allProjects = (ArrayList<Projects>) s.createQuery("from Projects").list();
		s.close();
		return allProjects;
	}
	
}
