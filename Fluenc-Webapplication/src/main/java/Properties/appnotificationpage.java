package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class appnotificationpage {
public static Properties appnotificationpage_details;
	
	public appnotificationpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/appnotification");
		try {
			appnotificationpage_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			appnotificationpage_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String apptitle() {
		String apptitle = appnotificationpage_details.getProperty("notification_title_data");
		return apptitle;
	}
	public String appmessage() {
		String appmessage = appnotificationpage_details.getProperty("message_data");
		return appmessage;
	}
	public String appinstitution() {
		String appinstitution = appnotificationpage_details.getProperty("institution_data");
		return appinstitution;
	}
}
