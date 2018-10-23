package com.inertia.dao.devBlog;

import java.util.ArrayList;
import java.util.Collection;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.beans.devBlog.DevBlogLink;

public interface DevBlogEntryDAO {
	
	public DevBlogEntry getDevBlogEntry(int id);  
	
	public ArrayList<DevBlogEntry> getAllDevBlogEntrys();
	
	public ArrayList<DevBlogEntry> getPubDevBlogEntrys();
	
	public void saveDevBlogEntry(DevBlogEntry devBlogEntry);
	
	public String deleteDevBlogEntry(int key);
	
	public void updateEntry(DevBlogEntry devBlogEntry);
	
}
