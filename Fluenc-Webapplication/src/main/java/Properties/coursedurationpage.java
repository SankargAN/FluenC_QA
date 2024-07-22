package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class coursedurationpage {
public static Properties courseduration_details;
	
	public coursedurationpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/courseduration");
		try {
			courseduration_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			courseduration_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String durationdays() {
		String durationdays = courseduration_details.getProperty("durationdays_data");
		return durationdays;
	}
	
}
