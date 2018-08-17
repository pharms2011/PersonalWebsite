package com.inertia.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SKILLS")
public class Skills {
	
	public Skills(int skillsId, String description, String level, String skillType) {
		super();
		this.skillsId = skillsId;
		this.description = description;
		this.level = level;
		this.skillType = skillType;
	}

	@Id
	@Column(name = "SKILLS_ID")
	private int skillsId;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "LVL")
	private String level;
	
	@Column(name = "SKILL_TYPE")
	private String skillType;
	
	public Skills() {
		
	}

	public int getSkillsId() {
		return skillsId;
	}

	public void setSkillsId(int skillsId) {
		this.skillsId = skillsId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	@Override
	public String toString() {
		return "skills [skillsId=" + skillsId + ", description=" + description + ", level=" + level + ", skillType="
				+ skillType + "]";
	}
}
