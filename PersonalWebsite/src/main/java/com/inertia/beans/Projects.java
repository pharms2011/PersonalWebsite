package com.inertia.beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
@Table(name = "PROJECTS")
public class Projects {
	
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(int projectId, String description, String connection, String connectionType) {
		super();
		this.projectId = projectId;
		this.description = description;
		this.connection = connection;
		this.connectionType = connectionType;
	}

	@Id
	@Column(name = "PROJECTS_ID")
	private int projectId;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "Connection")
	private String connection;
	
	@Column(name = "CONNECTION_TYPE")
	private String connectionType;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
    @JoinTable(
            name = "PROJECTS_SKILLS", 
            joinColumns = { @JoinColumn(name = " PROJECTS_ID") }, 
            inverseJoinColumns = { @JoinColumn(name = "SKILLS_ID") }
        )
    private Collection<Skills> skills = new ArrayList();

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", description=" + description + ", connection=" + connection
				+ ", connectionType=" + connectionType + "]";
	}

	public Collection<Skills> getSkills() {
		return skills;
	}

	public void setSkills(Collection<Skills> skills) {
		this.skills = skills;
	}
}
