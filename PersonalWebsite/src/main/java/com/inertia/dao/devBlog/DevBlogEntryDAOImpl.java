package com.inertia.dao.devBlog;

import java.util.ArrayList;

import org.hibernate.Session;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.util.HibernateUtil;

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
		s.save(devBlogEntry);
		s.close();	
	}

	@Override
	public String deleteDevBlogEntry(DevBlogEntry devBlogEntry) {
		Session s = HibernateUtil.getSession();
		String title = devBlogEntry.getTitle();
		s.delete(devBlogEntry);
		s.close();
		return title;
	}

	@Override
	public void updateEntry(DevBlogEntry devBlogEntry) {
		Session s = HibernateUtil.getSession();
		s.saveOrUpdate(devBlogEntry);
		s.close();
	}

}
