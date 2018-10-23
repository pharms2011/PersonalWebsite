package DAOTests;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import com.inertia.beans.devBlog.DevBlogEntry;
import com.inertia.beans.devBlog.DevBlogLink;
import com.inertia.beans.perBlog.PerBlogEntry;
import com.inertia.beans.perBlog.PerBlogPic;
import com.inertia.beans.resume.Education;
import com.inertia.dao.devBlog.DevBlogEntryDAOImpl;
import com.inertia.dao.perBlog.PerBlogEntryDAOImpl;
import com.inertia.dao.resume.EducationDAOImpl;

public class EducationTest {
	
	public EducationDAOImpl educationDAO = new EducationDAOImpl();
	public PerBlogEntryDAOImpl blogDao = new PerBlogEntryDAOImpl();
	
	//@Test
	public void saveTest() {
		PerBlogEntry perEntry = new PerBlogEntry();
		//ArrayList<PerBlogPic> devBlogLinks = new ArrayList<PerBlogPic>();
		perEntry.setTitle("Test");
		//perEntry.setPictures(devBlogLinks);;
		for(int i = 0; i < 3; i++) {
			PerBlogPic link = new PerBlogPic();
			link.setPerBlogPic(i+".com");
			perEntry.getPictures().add(link);
		}
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
