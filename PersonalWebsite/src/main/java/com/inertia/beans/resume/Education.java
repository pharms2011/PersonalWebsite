package com.inertia.beans.resume;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EDUCATION")
public class Education {

	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Education(int educationId, String school, String major, String startMonth, String endMonth, String startYear, String endYear) {
		super();
		this.educationId = educationId;
		this.school = school;
		this.major = major;
		this.startMonth = startMonth;
		this.endMonth = endMonth;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	@Id
	@Column(name = "EDUCATION_ID")
	private int educationId;
	
	@Column(name = "SCHOOL")
	private String school;
	
	@Column(name = "MAJOR")
	private String major;
	
	@Column(name = "DEGREE")
	private String degree;
	
	@Column(name = "START_MONTH")
	private String startMonth;
	
	@Column(name = "END_MONTH")
	private String endMonth;
	
	@Column(name = "START_YEAR")
	private String startYear;
	
	@Column(name = "END_YEAR")
	private String endYear;

	public int getId() {
		return educationId;
	}

	public void setId(int educationId) {
		this.educationId = educationId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	public String getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
}
