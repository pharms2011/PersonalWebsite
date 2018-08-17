package DAOTests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.inertia.beans.Skills;
import com.inertia.dao.SkillsDAO;
import com.inertia.dao.SkillsDAOImpl;

public class SkillsTest {
	
	public static SkillsDAOImpl skillsDAO = new SkillsDAOImpl();
	//@Autowired
	//public static SkillsDAO skillsDAO;
	
	//@Test
	public void saveTest() {
		Skills skill = new Skills(0, "Java","Advanced","Programming Language");
		assertTrue(skillsDAO.saveSkill(skill));
	}
	//@Test
		public void deleteTest() {
			//Skills skill = new Skills(0, "Java","Advanced","Programming Language");
			assertTrue(skillsDAO.deleteSkill(0));
		}
	//@Test
	public void getTest() {
		Skills skill = skillsDAO.getSkillById(1000);
		System.out.println(skill);
		assertNotNull(skill);
	}
	//@Test
	public void getAllTest() {
		ArrayList<Skills> skills = (ArrayList<Skills>) skillsDAO.getSkills();
		System.out.println(skills);
		assertNotNull(skills);
	}
}
