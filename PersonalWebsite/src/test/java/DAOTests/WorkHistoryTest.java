package DAOTests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.inertia.beans.resume.WorkHistory;
import com.inertia.dao.resume.WorkHistoryDAO;
import com.inertia.dao.resume.WorkHistoryDAOImpl;

public class WorkHistoryTest {
	
	public WorkHistoryDAOImpl workHistoryDAO = new WorkHistoryDAOImpl();
	
	//@Test
	public void addWorkHistory() {
		//WorkHistory wh = new WorkHistory(0,"January", "July", "Revaature", "21018","2018");
		//workHistoryDAO.saveWorkHistory(wh);
	}
	
	//@Test
	public void getWorkHistory() {
		WorkHistory wh = workHistoryDAO.getWorkHistoryById(1000);
		System.out.println(wh);
		assertNotNull(wh);
	}
}
