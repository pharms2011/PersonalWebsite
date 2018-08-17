package com.inertia.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WORK_HISTORY")
public class WorkHistory {

	public WorkHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WorkHistory(int workHistoryId, String startMonth, String endMonth, String title, String startYear,String endYear) {
		super();
		this.workHistoryId = workHistoryId;
		this.startMonth = startMonth;
		this.endMonth = endMonth;
		this.title = title;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	@Id
	@Column(name = "WORK_HISTORY_ID")
	private int workHistoryId;
	
	@Column(name = "START_MONTH")
	private String startMonth;
	
	@Column(name = "END_MONTH")
	private String endMonth;
	
	@Column(name = "TITLE")
	String title;
	
	@Column(name = "START_YEAR")
	String startYear;
	
	@Column(name = "END_YEAR")
	String endYear;

	@Override
	public String toString() {
		return "WorkHistory [workHistoryId=" + workHistoryId + ", startMonth=" + startMonth + ", endMonth=" + endMonth
				+ ", title=" + title + ", startYear=" + startYear + ", endYear=" + endYear + "]";
	}

	public int getWorkHistoryId() {
		return workHistoryId;
	}

	public void setWorkHistoryId(int workHistoryId) {
		this.workHistoryId = workHistoryId;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
}
