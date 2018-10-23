package com.inertia.beans.perBlog;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PER_BLOG_ENTRY")
public class PerBlogEntry {
	
	public PerBlogEntry() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PerBlog_IdSequence")
    @SequenceGenerator(allocationSize=1,name="PerBlog_IdSequence",sequenceName="PER_BLOG_SEQ")
	@Column(name = "PER_BLOG_ENTRY_ID")
	private int perBlogEntryId;
	
	@Column(name = "PER_BLOG_ENTRY")
	private String perBlogEntry;
	
	@Column(name = "ENTRY_DATE")
	private Date entryDate;
	
	@Column(name = "PUBLISHED")
	private String published;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PER_BLOG_ENTRY_ID", referencedColumnName = "PER_BLOG_ENTRY_ID")
	private List<PerBlogPic> pictures = new ArrayList<PerBlogPic>();
	
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

	public List<PerBlogPic> getPictures() {
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

	@Override
	public String toString() {
		return "PerBlogEntry [perBlogEntryId=" + perBlogEntryId + ", perBlogEntry=" + perBlogEntry + ", entryDate="
				+ entryDate + ", published=" + published + ", pictures=" + pictures + ", title=" + title + "]";
	}

}
