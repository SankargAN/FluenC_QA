package passpercentage;

import Properties.passpercentagepage;
import POM.passpercentage;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class passper_001 extends BaseClass {
	
	@Test
	public static void passpercentage() throws InterruptedException {
	
		click(passpercentage_Pom.mastermenu_side);
		Thread.sleep(1000);
		
		click(passpercentage_Pom.passper_menu_pom);
		Thread.sleep(1000);
		
		sendData(passpercentage_Pom.percentage_pom,passpercentagepage_details.passpertext() );
		Thread.sleep(1000);
		
		click(passpercentage_Pom.pp_save_pom);
	}
}
