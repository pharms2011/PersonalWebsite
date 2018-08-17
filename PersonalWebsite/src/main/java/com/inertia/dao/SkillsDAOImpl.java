package com.inertia.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.Skills;
import com.inertia.util.HibernateUtil;

@Repository("skillsDAO")
public class SkillsDAOImpl implements SkillsDAO{

	@Override
	public Collection<Skills> getSkills() {
		Session s = HibernateUtil.getSession();
		ArrayList<Skills> allSkills = (ArrayList<Skills>) s.createQuery("from Skills").list();
		s.close();
		return allSkills;
	}

	@Override
	public Skills getSkillById(int id) {
		Session s = HibernateUtil.getSession();
		Skills skill = (Skills)s.get(Skills.class, id);
		s.close();
		return skill;
	}

	@Override
	public boolean saveSkill(Skills skill) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.persist(skill);
		tx.commit();
		s.close();
		return true;
	}

	@Override
	public boolean deleteSkill(int id) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		Skills skill = (Skills)s.get(Skills.class, id);
		s.delete(skill);
		tx.commit();
		s.close();
		return true;
	}
	
	@Override
	public boolean updateSkill(Skills skill) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.update(skill);
		tx.commit();
		s.close();
		return true;
	}
}
