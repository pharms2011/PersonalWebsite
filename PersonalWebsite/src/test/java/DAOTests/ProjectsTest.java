package DAOTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.inertia.beans.projects.Projects;
import com.inertia.beans.resume.Skills;
import com.inertia.dao.resume.ProjectsDAO;
import com.inertia.dao.resume.ProjectsDAOImpl;
import com.inertia.dao.resume.SkillsDAOImpl;
import com.inertia.util.HibernateUtil;

public class ProjectsTest {
	
	ProjectsDAOImpl projectDAO = new ProjectsDAOImpl();
	SkillsDAOImpl skillsDAO = new SkillsDAOImpl();

	//@Test
	public void saveProjectTest() {
		ArrayList<Skills> skills = new ArrayList<Skills>();
		skills.add(skillsDAO.getSkillById(1000));
		Projects project = new Projects(0,"Projet 2","Git.com","Git");
		//project.setSkills(skills);
		projectDAO.saveProject(project);
	}

	//@Test
	public void getProject() {
		Projects project = projectDAO.getProjectById(1010);
		assertNotNull(project);
	}

	//@Test
	public void upateProjectTest() {
		Projects project = projectDAO.getProjectById(1010);
		project.setDescription("test");
		projectDAO.upateProject(project);
		Projects newProject = projectDAO.getProjectById(1010);
		assertEquals("test",newProject.getDescription());
	}

	//@Test
	public void getProjectsSkills() {
		Projects project = projectDAO.getProjectById(1010);
		System.out.println(project);
		ArrayList<Skills> skills = new ArrayList<Skills>();
		Skills skill = skillsDAO.getSkillById(1000);
		skills.add(skill);
		project.setSkills(skills);
		projectDAO.saveProject(project);
		assertNotNull(project.getSkills());
	}
	
	//@Test
	public void deleteProjectTest() {
		projectDAO.deleteProject(1000);
		Projects project = projectDAO.getProjectById(1000);
		System.out.println(project);
		assertNull(project);
	}
}
