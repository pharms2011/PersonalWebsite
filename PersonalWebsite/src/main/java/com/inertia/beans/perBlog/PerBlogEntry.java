package com.inertia.beans.perBlog;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PER_BLOG_ENTRY")
public class PerBlogEntry {
	
	public PerBlogEntry(int perBlogEntryId, String perBlogEntry, Date entryDate, String published,
			ArrayList<PerBlogPic> pictures, String title) {
		super();
		this.perBlogEntryId = perBlogEntryId;
		this.perBlogEntry = perBlogEntry;
		this.entryDate = entryDate;
		this.published = published;
		this.pictures = pictures;
		this.title = title;
	}

	@Id
	@Column(name = "PER_BLOG_ENTRY_ID")
	private int perBlogEntryId;
	
	@Column(name = "PER_BLOG_ENTRY")
	private String perBlogEntry;
	
	@Column(name = "ENTRY_DATE")
	private Date entryDate;
	
	@Column(name = "PUBLISHED")
	private String published;
	
	@OneToMany(mappedBy = "perBlogEntryId")
	private Collection<PerBlogPic> pictures;
	
	@Column(name = "Title")
	private String title;

	public int getPerBlogEntryId() {
		return perBlogEntryId;
	}

	public void setPerBlogEntryId(int perBlogEntryId) {
		this.perBlogEntryId = perBlogEntryId;
	}

	public String getPerBlogEntry() {
		return perBlogEntry;
	}

	public void setPerBlogEntry(String perBlogEntry) {
		this.perBlogEntry = perBlogEntry;
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

	public Collection<PerBlogPic> getPictures() {
		return pictures;
	}

	public void setPictures(ArrayList<PerBlogPic> pictures) {
		this.pictures = pictures;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
