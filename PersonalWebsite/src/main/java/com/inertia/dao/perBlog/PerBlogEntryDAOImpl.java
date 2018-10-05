package com.inertia.dao.perBlog;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.util.HibernateUtil;

@Repository("perBlogEntryDAO")
public class PerBlogEntryDAOImpl implements PerBlogEntryDAO{

	@Override
	public PerBlogEntry getDevBlogEntry(int id) {
		Session s = HibernateUtil.getSession();
		PerBlogEntry perBlogEntry = (PerBlogEntry)s.get(PerBlogEntry.class, id);
		s.close();
		return perBlogEntry;
	}

	@Override
	public ArrayList<PerBlogEntry> getAllDevBlogEntrys() {
		Session s = HibernateUtil.getSession();
		ArrayList<PerBlogEntry> allEntries = (ArrayList<PerBlogEntry>) s.createQuery("from PerBlogEntry").list();
		s.close();
		return allEntries;
	}

	@Override
	public void savePerBlogEntry(PerBlogEntry perBlogEntry) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		tx.begin();
		s.save(perBlogEntry);
		tx.commit();
		s.close();
	}

	@Override
	public String deletePerBlogEntry(int id) {
		Session s = HibernateUtil.getSession();
		PerBlogEntry perBlogEntry = (PerBlogEntry)s.get(PerBlogEntry.class, id);
		String title = perBlogEntry.getTitle();
		s.delete(perBlogEntry);
		s.close();
		return title;
	}

	@Override
	public void updateEntry(PerBlogEntry perBlogEntry) {
		Session s = HibernateUtil.getSession();
		s.saveOrUpdate(perBlogEntry);
		s.close();
	}

}
