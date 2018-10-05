package com.inertia.util;

import java.util.ArrayList;

import com.inertia.beans.devBlog.*;
import com.inertia.dao.devBlog.DevBlogEntryDAOImpl;

public class Driver {
	
	public static void main(String args[]) {
		
		ArrayList<DevBlogLink> devBlogLinks = new ArrayList<DevBlogLink>();
		DevBlogEntry devEntry = new DevBlogEntry();
		devEntry.setTitle("test");
		DevBlogEntryDAOImpl devDao = new DevBlogEntryDAOImpl();
		System.out.println(devEntry);
		System.out.println(devEntry);
		for(int i = 0; i < 3; i++) {
			devBlogLinks.add(new DevBlogLink(0,i+".com",devEntry.getDevBlogId()));
		}
		//devEntry.setLinks(devBlogLinks);
		System.out.println(devEntry);
		devDao.saveDevBlogEntry(devEntry);
	}
}
