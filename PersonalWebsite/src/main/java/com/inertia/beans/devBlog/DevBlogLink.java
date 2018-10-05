package com.inertia.beans.devBlog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEV_BLOG_LINK")
public class DevBlogLink {
	
	public DevBlogLink() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DevBlogLink(int devBlogLinkId, String devBlogLink, int devBlogEntryId) {
		super();
		this.devBlogLinkId = devBlogLinkId;
		this.devBlogLink = devBlogLink;
		this.devBlogEntryId = devBlogEntryId;
	}


	@Id
	@Column(name = "DEV_BLOG_LINK_ID")
	private int devBlogLinkId;
	
	@Column(name = "DEV_BLOG_LINK")
	private String devBlogLink;
	
	
	@Column(name = "DEV_BLOG_ENTRY_ID")
	private int devBlogEntryId;


	public int getDevBlogLinkId() {
		return devBlogLinkId;
	}


	public void setDevBlogLinkId(int devBlogLinkId) {
		this.devBlogLinkId = devBlogLinkId;
	}


	public String getDevBlogLink() {
		return devBlogLink;
	}


	public void setDevBlogLink(String devBlogLink) {
		this.devBlogLink = devBlogLink;
	}


	public int getDevBlogEntryId() {
		return devBlogEntryId;
	}


	public void setDevBlogEntryId(int devBlogEntryId) {
		this.devBlogEntryId = devBlogEntryId;
	}


	@Override
	public String toString() {
		return "DevBlogLink [devBlogLinkId=" + devBlogLinkId + ", devBlogLink=" + devBlogLink + ", devBlogEntryId="
				+ devBlogEntryId + "]";
	}

}
