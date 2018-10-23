package com.inertia.services.devBlog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.dao.devBlog.DevBlogEntryDAO;

@Service("devBlogService")
public class DevBlogServiceImpl implements DevBlogService{
	
	@Autowired
	DevBlogEntryDAO devBlogDao;

	@Override
	public String deleteDevBlogEntry(int key) {
		return devBlogDao.deleteDevBlogEntry(key);
	}

	@Override
	public void saveDevBlogEntry(DevBlogEntry devBlogEntry) {
		devBlogDao.saveDevBlogEntry(devBlogEntry);
	}

	@Override
	public void publishEntry(DevBlogEntry devBlogEntry) {
		devBlogEntry.setPublished("Y");
		if(devBlogEntry.getDevBlogId() == 0) {
			devBlogDao.saveDevBlogEntry(devBlogEntry);
		}

		else{
			devBlogDao.updateEntry(devBlogEntry);
		}
	}

	@Override
	public void updateEntry(DevBlogEntry devBlogEntry) {
		devBlogDao.updateEntry(devBlogEntry);
	}

	@Override
	public List<DevBlogEntry> getAll() {
		return devBlogDao.getAllDevBlogEntrys();
	}

	@Override
	public List<DevBlogEntry> getPublished() {
		return devBlogDao.getPubDevBlogEntrys();
	}

	@Override
	public DevBlogEntry getDevBlogEntry(int id) {
		return devBlogDao.getDevBlogEntry(id);
	}

}
