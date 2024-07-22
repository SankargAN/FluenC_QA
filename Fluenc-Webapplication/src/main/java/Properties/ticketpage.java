package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ticketpage {
public static Properties ticketpage_details;
	
	public ticketpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/ticket");
		try {
			ticketpage_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			ticketpage_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String ticketinstitution() {
		String ticketinstitution = ticketpage_details.getProperty("institution_data");
		return ticketinstitution;
	}
	public String ticketissuecat() {
		String ticketissuecat = ticketpage_details.getProperty("issue_category");
		return ticketissuecat;
	}
	public String ticketsummary() {
		String ticketsummary = ticketpage_details.getProperty("issue_summary_data");
		return ticketsummary;
	}
	public String ticketissuedate() {
		String ticketissuedate = ticketpage_details.getProperty("issue_date");
		return ticketissuedate;
	}
}
