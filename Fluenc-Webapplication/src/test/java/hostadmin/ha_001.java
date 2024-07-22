package hostadmin;

import org.testng.annotations.Test;

import Properties.hostadminpage;
import Utilities.BaseClass;



public class ha_001 extends BaseClass {

	@Test 
	public static void login() throws InterruptedException {
	
		click(hostadmin_Pom.master_setup);
		Thread.sleep(1000);
		click(hostadmin_Pom.hostadmin);
		Thread.sleep(1000);
		click(hostadmin_Pom.new_host_admin);
		Thread.sleep(1000);
		sendData(hostadmin_Pom.full_name, hostadminPage_details.full_name());
		Thread.sleep(1000);
		selectByVisibleText(hostadmin_Pom.role,hostadminPage_details.sub_role() );
		Thread.sleep(1000);
		sendData(hostadmin_Pom.email, hostadminPage_details.email());
		Thread.sleep(1000);
		sendData(hostadmin_Pom.ha_password, hostadminPage_details.ha_conf_password());
		Thread.sleep(1000);
		sendData(hostadmin_Pom.ha_conf_password, hostadminPage_details.ha_conf_password());
		Thread.sleep(1000);
		click(hostadmin_Pom.save);
		Thread.sleep(1000);
//		click(hostadmin_Pom.ha_cancel);
		
		
	}
}
