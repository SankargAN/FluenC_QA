package pricing;

import org.testng.annotations.Test;

import POM.price;
import Properties.pricepage;
import Utilities.BaseClass;

public class pricing_001 extends BaseClass {
	
	@Test
	public static void pricing_page() throws InterruptedException {
		
		click(price_Pom.mastermenu);
		Thread.sleep(3000);
		
		click(price_Pom.pricemenu_pom);
		Thread.sleep(1000);
		//clear(price_Pom.price_text_pom);
		sendData(price_Pom.price_text_pom, pricePage_details.pricetext());
		Thread.sleep(1000);
		sendData(price_Pom.discount_pom, pricePage_details.pricedp());
		Thread.sleep(1000);
		sendData(price_Pom.intrastate_pom, pricePage_details.intrast());
		Thread.sleep(1000);
		sendData(price_Pom.interstate_pom, pricePage_details.interst());
		Thread.sleep(1000);
		sendData(price_Pom.Priceinclgst_pom, pricePage_details.priceig());
		Thread.sleep(1000);
		
		click(price_Pom.price_save_pom);
		Thread.sleep(1000);
	}

	
}
