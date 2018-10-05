package com.inertia.dao.devBlog;

import java.util.ArrayList;

import com.inertia.beans.devBlog.DevBlogEntry;

public interface DevBlogEntryDAO {
	
	public DevBlogEntry getDevBlogEntry(int id);  
	
	public ArrayList<DevBlogEntry> getAllDevBlogEntrys();
	
	public void saveDevBlogEntry(DevBlogEntry devBlogEntry);
	
	public String deleteDevBlogEntry(DevBlogEntry devBlogEntry);
	
	public void updateEntry(DevBlogEntry devBlogEntry);
}
