package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class pricepage {
	public static Properties price_details;
	
	public pricepage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/priceData");
		try {
			price_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			price_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String pricemaster() {
		String pricemaster = price_details.getProperty("mastermenu");
		return pricemaster;
	}
	public String price_side_menu() {
		String price_side_menu = price_details.getProperty("price_menu_data");
		return price_side_menu;
	}
	public String pricetext() {
		String pricetext = price_details.getProperty("data_price");
		return pricetext;
	}
	public String pricedp() {
		String pricedp = price_details.getProperty("data_discount");
		return pricedp;
	}
	public String intrast() {
		String intrast = price_details.getProperty("data_intra");
		return intrast;
	}
	public String interst() {
		String intrast = price_details.getProperty("data_inter");
		return intrast;
	}
	public String priceig() {
		String priceig = price_details.getProperty("data_inter");
		return priceig;
	}
}
