package ticket;

import Properties.ticketpage;
import POM.ticket;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class ticket_001 extends BaseClass {
	
	@Test
	public static void ticket() throws InterruptedException {
	
		click(ticket_Pom.mastermenu_side);
		Thread.sleep(1000);
		
		click(ticket_Pom.new_ticket_pom);
		Thread.sleep(1000);
		
		sendData(ticket_Pom.institution_pom, ticketpage_details.ticketinstitution());
		Thread.sleep(1000);
		sendData(ticket_Pom.issue_category_pom, ticketpage_details.ticketissuecat());
		Thread.sleep(1000);
		sendData(ticket_Pom.issuesummary_pom, ticketpage_details.ticketsummary());
		Thread.sleep(1000);
		sendData(ticket_Pom.issuedate_pom, ticketpage_details.ticketissuedate());
		Thread.sleep(1000);
		click(ticket_Pom.ticket_save_pom);

	}
}
