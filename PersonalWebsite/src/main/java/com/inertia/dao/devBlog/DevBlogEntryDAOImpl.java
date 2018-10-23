package com.inertia.dao.devBlog;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.beans.devBlog.DevBlogLink;
import com.inertia.util.HibernateUtil;

@Repository("devBlogDao")
public class DevBlogEntryDAOImpl implements DevBlogEntryDAO{

	@Override
	public DevBlogEntry getDevBlogEntry(int id) {
		Session s = HibernateUtil.getSession();
		DevBlogEntry perBlogEntry = (DevBlogEntry)s.get(DevBlogEntry.class, id);
		s.close();
		return perBlogEntry;
	}

	@Override
	public ArrayList<DevBlogEntry> getAllDevBlogEntrys() {
		Session s = HibernateUtil.getSession();
		ArrayList<DevBlogEntry> allEntries = (ArrayList<DevBlogEntry>) s.createQuery("from DevBlogEntry").list();
		s.close();
		return allEntries;
	}

	@Override
	public void saveDevBlogEntry(DevBlogEntry devBlogEntry) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		if(!devBlogEntry.getLinks().isEmpty()) {
			ArrayList<DevBlogLink> links = (ArrayList<DevBlogLink>) devBlogEntry.getLinks();
			devBlogEntry.setLinks(null);
			int key = (int) s.save(devBlogEntry);
			for(DevBlogLink link: links) {
				link.setDevBlogEntryId(key);
				s.save(link);
			}
		}
		else {
			s.save(devBlogEntry);
		}
		tx.commit();	
		s.close();	
	}

	@Override
	public String deleteDevBlogEntry(int key) {
		Session s = HibernateUtil.getSession();
		DevBlogEntry devBlogEntry = (DevBlogEntry)s.get(DevBlogEntry.class, key);
		String title = devBlogEntry.getTitle();
		Transaction tx = s.beginTransaction();
		s.delete(devBlogEntry);
		tx.commit();
		s.close();
		return title;
	}

	@Override
	public void updateEntry(DevBlogEntry devBlogEntry) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(devBlogEntry);
		tx.commit();
		s.close();
	}

	@Override
	public ArrayList<DevBlogEntry> getPubDevBlogEntrys() {
		Session s = HibernateUtil.getSession();
		ArrayList<DevBlogEntry> allEntries = (ArrayList<DevBlogEntry>) s.createQuery("from DevBlogEntry").list();
		s.close();
		ArrayList<DevBlogEntry> pubEntries = new ArrayList<DevBlogEntry>();
		for(DevBlogEntry entry : allEntries) {
			if(entry.getPublished().equals("Y")) {
				pubEntries.add(entry);
			}
		}
		return pubEntries;
	}

}
