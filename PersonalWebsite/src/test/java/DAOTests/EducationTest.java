package DAOTests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.beans.resume.Education;
import com.inertia.dao.perBlog.PerBlogEntryDAOImpl;
import com.inertia.dao.resume.EducationDAOImpl;

public class EducationTest {
	
	public EducationDAOImpl educationDAO = new EducationDAOImpl();
	public PerBlogEntryDAOImpl blogDao = new PerBlogEntryDAOImpl();
	
	@Test
	public void saveTest() {
		PerBlogEntry perEntry = new PerBlogEntry(0, "Test", null, null, null, null);
		blogDao.savePerBlogEntry(perEntry);
		assertNotNull(perEntry);
	}
	
	//@Test
	public void getTest() {
		assertNotNull(educationDAO.getEducationById(1000));
	}
	
	//@Test
	public void getAllTest() {
		assertNotNull(educationDAO.getAllEducation());
	}
}
