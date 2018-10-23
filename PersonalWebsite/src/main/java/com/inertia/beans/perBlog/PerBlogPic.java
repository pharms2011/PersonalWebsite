package com.inertia.beans.perBlog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PER_BLOG_PIC")
public class PerBlogPic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PerBlogPic_IdSequence")
    @SequenceGenerator(allocationSize=1,name="PerBlogPic_IdSequence",sequenceName="PER_BLOG_PIC_SEQ")
	@Column(name = "PER_BLOG_PIC_ID")
	private int perBlogPicId;
	
	@Column(name = "PER_BLOG_ENTRY_ID")
	private int perBlogEntryId;
	
	@Column(name = "PER_BLOG_PIC")
	private String perBlogPic;

	public int getPerBlogPicId() {
		return perBlogPicId;
	}

	public void setPerBlogPicId(int perBlogPicId) {
		this.perBlogPicId = perBlogPicId;
	}

	public int getPerBlogEntryId() {
		return perBlogEntryId;
	}

	public void setPerBlogEntryId(int perBlogEntryId) {
		this.perBlogEntryId = perBlogEntryId;
	}

	public String getPerBlogPic() {
		return perBlogPic;
	}

	public void setPerBlogPic(String perBlogPic) {
		this.perBlogPic = perBlogPic;
	}

	@Override
	public String toString() {
		return "PerBlogPic [perBlogPicId=" + perBlogPicId + ", perBlogEntryId=" + perBlogEntryId + ", perBlogPic="
				+ perBlogPic + "]";
	}

}
