package com.inertia.dao.perBlog;

import java.util.ArrayList;

import com.inertia.beans.perBlog.PerBlogEntry;

public interface PerBlogEntryDAO {
	
	public PerBlogEntry getDevBlogEntry(int id);  
	
	public ArrayList<PerBlogEntry> getAllDevBlogEntrys();
	
	public void savePerBlogEntry(PerBlogEntry perBlogEntry);
	
	public String deletePerBlogEntry(int id);
	
	public void updateEntry(PerBlogEntry perBlogEntry);
}
