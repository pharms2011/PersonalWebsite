package com.inertia.services.perBlog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.dao.perBlog.PerBlogEntryDAO;

@Service("perBlogService")
public class PerBlogServiceImpl implements PerBlogService{
	
	@Autowired
	PerBlogEntryDAO perBlogDao;

	@Override
	public void saveEntry(PerBlogEntry perBlogEntry) {
		perBlogDao.savePerBlogEntry(perBlogEntry);
	}

	@Override
	public String deleteEntry(int id) {
		return perBlogDao.deletePerBlogEntry(id);
	}

	@Override
	public void updateEntry(PerBlogEntry perBlogEntry) {
		perBlogDao.updateEntry(perBlogEntry);
	}

	@Override
	public String publishEnrty(PerBlogEntry perBlogEntry) {
		perBlogEntry.setPublished("Y");
		if(perBlogEntry.getPerBlogEntryId() == 0) {
			perBlogDao.savePerBlogEntry(perBlogEntry);
		}
		else {
			perBlogDao.updateEntry(perBlogEntry);
		}
		return perBlogEntry.getTitle();
	}

	@Override
	public List<PerBlogEntry> getAll() {
		return perBlogDao.getAllPerBlogEntrys();
	}

	@Override
	public PerBlogEntry get(int id) {
		return perBlogDao.getPerBlogEntry(id);
	}

	@Override
	public List<PerBlogEntry> getPublished() {
		return perBlogDao.getPubBlogEntry();
	}
	
}
