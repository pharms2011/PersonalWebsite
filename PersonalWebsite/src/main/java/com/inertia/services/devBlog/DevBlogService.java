package com.inertia.services.devBlog;

import java.util.List;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.beans.perBlog.PerBlogEntry;

public interface DevBlogService {
	
	public String deleteDevBlogEntry(int key);
	
	public DevBlogEntry getDevBlogEntry(int id);
	
	public void saveDevBlogEntry(DevBlogEntry devBlogEntry);
	
	public void publishEntry(DevBlogEntry devBlogEntry);
	
	public void updateEntry(DevBlogEntry devBlogEntry);
	
	public List<DevBlogEntry> getAll();
	
	public List<DevBlogEntry> getPublished();

}
