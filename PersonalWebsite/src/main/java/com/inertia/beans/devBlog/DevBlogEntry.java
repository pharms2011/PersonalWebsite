package com.inertia.beans.devBlog;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEV_BLOG_ENTRY")
public class DevBlogEntry {
	
	public DevBlogEntry(int devBlogId, String devBlogEntry, Date entryDate, String published, String title,
			ArrayList<DevBlogLink> links) {
		super();
		this.devBlogId = devBlogId;
		this.devBlogEntry = devBlogEntry;
		this.entryDate = entryDate;
		this.published = published;
		this.title = title;
		this.links = links;
	}

	public DevBlogEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevBlogEntry(int devBlogId, String devBlogEntry, Date entryDate, String published,
			ArrayList<DevBlogLink> links) {
		super();
		this.devBlogId = devBlogId;
		this.devBlogEntry = devBlogEntry;
		this.entryDate = entryDate;
		this.published = published;
		this.links = links;
	}

	@Id
	@Column(name = "DEV_BLOG_ENTRY_ID")
	private int devBlogId;
	
	@Column(name = "DEV_ENTRY")
	private String devBlogEntry;
	
	@Column(name = "ENTRY_DATE")
	private Date entryDate;
	
	@Column(name = "PUBLISHED")
	private String published;
	
	@Column(name = "Title")
	private String title;
	
	@OneToMany(mappedBy = "devBlogEntryId")
	private Collection<DevBlogLink> links;
	
	public int getDevBlogId() {
		return devBlogId;
	}

	public void setDevBlogId(int devBlogId) {
		this.devBlogId = devBlogId;
	}

	public String getDevBlogEntry() {
		return devBlogEntry;
	}

	public void setDevBlogEntry(String devBlogEntry) {
		this.devBlogEntry = devBlogEntry;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public Collection<DevBlogLink> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<DevBlogLink> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "DevBlogEntry [devBlogId=" + devBlogId + ", devBlogEntry=" + devBlogEntry + ", entryDate=" + entryDate
				+ ", published=" + published + ", links=" + links + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
