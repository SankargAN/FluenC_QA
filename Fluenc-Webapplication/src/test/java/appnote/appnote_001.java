package appnote;

import Properties.appnotificationpage;
import POM.appnotification;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class appnote_001 extends BaseClass {
	
	@Test
	public static void appnot() throws InterruptedException {
	
		click(appnotification_Pom.appnotification_sidemenu_pom);
		Thread.sleep(1000);
		
		sendData(appnotification_Pom.title_pom, appnotificationpage_details.apptitle());
		Thread.sleep(1000);
		
		sendData(appnotification_Pom.message_pom, appnotificationpage_details.appmessage());
		Thread.sleep(1000);
		
		sendData(appnotification_Pom.institution_pom, appnotificationpage_details.appinstitution());
		Thread.sleep(1000);
		
		click(appnotification_Pom.save_btn_pom);
		Thread.sleep(1000);
		
	}
}
