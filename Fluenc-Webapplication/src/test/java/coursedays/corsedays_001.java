package coursedays;

import Properties.coursedurationpage;

import org.testng.annotations.Test;

import POM.CoursedDuration;
import Utilities.BaseClass;

public class corsedays_001 extends BaseClass {
	
	@Test
	public static void pricing_page() throws InterruptedException {
	
		click(CoursedDuration_Pom.mastermenu_side);
		Thread.sleep(1000);
		
		click(CoursedDuration_Pom.course_menu_pom);
		Thread.sleep(1000);
		
		sendData(CoursedDuration_Pom.durationDays_pom, coursedurationpage_details.durationdays());
		Thread.sleep(1000);
		
		click(CoursedDuration_Pom.cd_save_pom);
	}
}
