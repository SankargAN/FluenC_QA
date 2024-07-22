package salesContact;

import org.testng.annotations.Test;

import Properties.salescontactpage;
import Utilities.BaseClass;


public class sales_001 extends BaseClass {

@Test	
	public static void login() throws InterruptedException {
		
		click(salesContact_Pom.sales_master_setup);
		Thread.sleep(1000);
		
		click(salesContact_Pom.sales_contact);
		Thread.sleep(1000);
		
		click(salesContact_Pom.new_sales_contact);
		Thread.sleep(1000);
		
		selectByIndex(salesContact_Pom.sales_type, 1);
		Thread.sleep(1000);
		
		sendData(salesContact_Pom.sc_Pomfullname, salescontactPage_details.pro_fullname());
		Thread.sleep(1000);
		
		sendData(salesContact_Pom.pomEmail, salescontactPage_details.proEmail());
		Thread.sleep(1000);
		
		sendData(salesContact_Pom.pomPhone, salescontactPage_details.proPhone());
		Thread.sleep(1000);
		
		selectByIndex(salesContact_Pom.pomSelect, 1);
		Thread.sleep(1000);

		click(salesContact_Pom.sales_save);
		Thread.sleep(1000);
	}

	
}
