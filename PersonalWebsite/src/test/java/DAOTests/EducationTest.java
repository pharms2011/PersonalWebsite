package DAOTests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.inertia.beans.Education;
import com.inertia.dao.EducationDAOImpl;

public class EducationTest {
	
	public EducationDAOImpl educationDAO = new EducationDAOImpl();
	
	@Test
	public void saveTest() {
		Education education = new Education(0,"University of Northern Colorado","Mathematics","August","May","2015","2013");
		educationDAO.saveEducation(education);
		assertNotNull(education);
	}
	
	@Test
	public void getTest() {
		assertNotNull(educationDAO.getEducationById(1000));
	}
	
	@Test
	public void getAllTest() {
		assertNotNull(educationDAO.getAllEducation());
	}
	public static void main(String[] args) {
		EducationDAOImpl educationDAO = new EducationDAOImpl();
		Education education = new Education(0,"University of Northern Colorado","Mathematics","August","May","2015","2013");
		educationDAO.saveEducation(education);
	}
}
