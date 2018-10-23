package com.inertia.services.perBlog;

import java.util.List;

import com.inertia.beans.perBlog.PerBlogEntry;

public interface PerBlogService {

	public void saveEntry(PerBlogEntry perBlogEntry);
	
	public PerBlogEntry get(int id);
	
	public String deleteEntry(int id);
	
	public void updateEntry(PerBlogEntry perBlogEntry);
	
	public String publishEnrty(PerBlogEntry perBlogEntry);
	
	public List<PerBlogEntry> getAll();
	
	public List<PerBlogEntry> getPublished();
	
}
