package taxClass;

import org.testng.annotations.Test;

import POM.taxclass;
import Properties.taxclassPage;
import Utilities.BaseClass;

public class taxclass_001 extends BaseClass {
	
	@Test
	public static void pricing_page() throws InterruptedException {
		
		click(taxclass_Pom.mastermenu_side);
		Thread.sleep(1000);
		click(taxclass_Pom.taxclass_menu_pom);
		Thread.sleep(1000);
		click(taxclass_Pom.newtax_btn_pom);
		Thread.sleep(1000);
		
		sendData(taxclass_Pom.taxtitle_pom, taxclassPage_details.taxTitle());
		Thread.sleep(1000);
		sendData(taxclass_Pom.taxdes_pom, taxclassPage_details.taxDes());
		Thread.sleep(1000);
		sendData(taxclass_Pom.taxper_pom, taxclassPage_details.taxPre());
		Thread.sleep(1000);
		
		click(taxclass_Pom.taxsave_pom);
		
	}

}
