package institution;

import org.testng.annotations.Test;

import POM.institution;
import Properties.Institutionpage;
import Utilities.BaseClass;

public class institution_menu extends BaseClass {
@Test
	public static void Institution_page() throws InterruptedException {
		
		click(Institutions_Pom.institution_menu);
		Thread.sleep(2000);
		click(Institutions_Pom.oi_new_institution);
		Thread.sleep(1000);
		
		//sendData(Institutions_Pom.oi_title_pom, InstitutionPage_details.institution_title());
		//Thread.sleep(1000);
		
		sendData(Institutions_Pom.oi_title_pom, InstitutionPage_details.ins_title());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_line_pom, InstitutionPage_details.addline());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_areacode_pom, InstitutionPage_details.ins_arecode());
		Thread.sleep(1000);
//		sendData(Institutions_Pom.oi_city_pom, InstitutionPage_details.ins_city());
//		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_city_pom, InstitutionPage_details.ins_city());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_city_code_pom, InstitutionPage_details.ins_ccode());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_state_pom, InstitutionPage_details.ins_state());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_pincode_pom, InstitutionPage_details.ins_pincode());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_email_pom, InstitutionPage_details.ins_email());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_phone_pom, InstitutionPage_details.ins_phone());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_domain_pom, InstitutionPage_details.ins_domain());
		Thread.sleep(1000);
		sendData(Institutions_Pom.oi_sales_pom, InstitutionPage_details.ins_sales());
		Thread.sleep(1000);
		click(Institutions_Pom.oi_save_pom);

	}
}
