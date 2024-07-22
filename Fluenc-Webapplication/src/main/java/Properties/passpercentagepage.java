package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class passpercentagepage {
public static Properties passpercentage_details;
	
	public passpercentagepage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/passpercentage");
		try {
			passpercentage_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			passpercentage_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String passpertext() {
		String passpertext = passpercentage_details.getProperty("passpercent_data");
		return passpertext;
	}
}
