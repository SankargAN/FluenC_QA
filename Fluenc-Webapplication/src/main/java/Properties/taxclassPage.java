package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class taxclassPage {
	public static Properties taxclass_details;
	
	public taxclassPage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/taxclassData");
		try {
			taxclass_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			taxclass_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String taxTitle() {
		String taxTitle = taxclass_details.getProperty("title_data");
		return taxTitle;
	}
	public String taxDes() {
		String taxDes = taxclass_details.getProperty("description_data");
		return taxDes;
	}
	public String taxPre() {
		String taxPre = taxclass_details.getProperty("percent_data");
		return taxPre;
	}
}
