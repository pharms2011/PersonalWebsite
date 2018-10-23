package com.inertia.dao.perBlog;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.beans.perBlog.PerBlogPic;
import com.inertia.util.HibernateUtil;

@Repository("perBlogEntryDAO")
public class PerBlogEntryDAOImpl implements PerBlogEntryDAO{

	@Override
	public PerBlogEntry getPerBlogEntry(int id) {
		Session s = HibernateUtil.getSession();
		PerBlogEntry perBlogEntry = (PerBlogEntry)s.get(PerBlogEntry.class, id);
		s.close();
		return perBlogEntry;
	}

	@Override
	public ArrayList<PerBlogEntry> getAllPerBlogEntrys() {
		Session s = HibernateUtil.getSession();
		ArrayList<PerBlogEntry> allEntries = (ArrayList<PerBlogEntry>) s.createQuery("from PerBlogEntry").list();
		s.close();
		return allEntries;
	}

	@Override
	public void savePerBlogEntry(PerBlogEntry perBlogEntry) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		if(!perBlogEntry.getPictures().isEmpty()) {
			ArrayList<PerBlogPic> Pictures = (ArrayList<PerBlogPic>) perBlogEntry.getPictures();
			perBlogEntry.setPictures(null);
			int key = (int) s.save(perBlogEntry);
			System.out.println(perBlogEntry);
			for(PerBlogPic pic : Pictures) {
				pic.setPerBlogEntryId(key);
				s.save(pic);
				System.out.println(pic);
			}
		}
		else {
			s.save(perBlogEntry);
		}
		tx.commit();
		s.close();
	}

	@Override
	public String deletePerBlogEntry(int id) {
		Session s = HibernateUtil.getSession();
		PerBlogEntry perBlogEntry = (PerBlogEntry)s.get(PerBlogEntry.class, id);
		String title = perBlogEntry.getTitle();
		Transaction tx = s.beginTransaction();
		s.delete(perBlogEntry);
		tx.commit();
		s.close();
		return title;
	}

	@Override
	public void updateEntry(PerBlogEntry perBlogEntry) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(perBlogEntry);
		tx.commit();
		s.close();
	}

	@Override
	public ArrayList<PerBlogEntry> getPubBlogEntry() {
		Session s = HibernateUtil.getSession();
		ArrayList<PerBlogEntry> allEntries = (ArrayList<PerBlogEntry>) s.createQuery("from PerBlogEntry").list();
		s.close();
		ArrayList<PerBlogEntry> pubEntries = new ArrayList<PerBlogEntry>();
		for(PerBlogEntry entry : allEntries) {
			if(entry.getPublished().equals("Y")) {
				pubEntries.add(entry);
			}
		}
		return pubEntries;
	}

}
