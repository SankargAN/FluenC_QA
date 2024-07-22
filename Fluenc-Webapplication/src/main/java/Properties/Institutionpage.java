package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Institutionpage {

	public static Properties institution_details;
	
	public Institutionpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/InstitutionData");
		try {
			institution_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			institution_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String ins_title() {
		String ins_title = institution_details.getProperty("Datatitle");
		return ins_title;
	}
	public String addline() {
		String addline = institution_details.getProperty("line_data");
		return addline;
	}
	public String ins_arecode() {
		String ins_arecode = institution_details.getProperty("areacode_data");
		return ins_arecode;
	}
	public String ins_city() {
		String ins_city = institution_details.getProperty("city_data");
		return ins_city;
	}
	public String ins_ccode() {
		String ins_ccode = institution_details.getProperty("citycode_data");
		return ins_ccode;
	}
	public String ins_state() {
		String ins_state = institution_details.getProperty("state_data");
		return ins_state;
	}
	public String ins_pincode() {
		String ins_pincode = institution_details.getProperty("pincode_data");
		return ins_pincode;
	}
	public String ins_email() {
		String ins_email = institution_details.getProperty("email_data");
		return ins_email;
	}
	public String ins_phone() {
		String ins_phone = institution_details.getProperty("phone_data");
		return ins_phone;
	}
	public String ins_domain() {
		String ins_domain = institution_details.getProperty("domains_data");
		return ins_domain;
	}
	public String ins_sales() {
		String ins_sales = institution_details.getProperty("sales_data");
		return ins_sales;
	}
}
