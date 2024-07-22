package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class mediapage {
public static Properties mediapage_details;
	
	public mediapage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/media");
		try {
			mediapage_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			mediapage_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String mediapath() {
		String mediapath = mediapage_details.getProperty("path");
		return mediapath;
	}
}
