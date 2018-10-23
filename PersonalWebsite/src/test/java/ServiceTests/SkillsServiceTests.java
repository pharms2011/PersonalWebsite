package ServiceTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.inertia.beans.resume.Skills;
import com.inertia.services.resume.SkillsServiceImpl;

public class SkillsServiceTests {
	
	SkillsServiceImpl skillsService = new SkillsServiceImpl();
	
	//@Test
	public void getTest() {
		System.out.println(skillsService);
		Skills skill = new Skills(0,"Python","Basic","Programming Language");
		skillsService.saveSkill(skill);
		Skills newSkill = skillsService.getSkill(1000);
		assertNotNull(newSkill);
	}
	
	//@Test
	public void updateTest() {
		Skills skill = skillsService.getSkill(1000);
		skill.setDescription("test");
		skillsService.updateSkill(skill);
		Skills newSkill = skillsService.getSkill(1000);
		assertEquals("test", newSkill.getDescription());
	}
	
	//@Test
	public void getAllTest() {
		ArrayList<Skills> skills = (ArrayList<Skills>) skillsService.getAll();
		assertNotNull(skills.size());
	}
	
	//@Test
	public void deleteTest() {
		skillsService.deleteSkill(1001);
		ArrayList<Skills> skills = (ArrayList<Skills>) skillsService.getAll();
		assertEquals(1,skills.size());
	}
}
