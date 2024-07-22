package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class loginpage {
	public static Properties login_details;
	
	public loginpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/Login");
		try {
			login_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			login_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String URL() {
		String URL = login_details.getProperty("URL");
		return URL;
	}	
	public String account_your_email() {
		String account_your_email = login_details.getProperty("account_your_email");
		return account_your_email;
	}
	public String account_password() {
		String account_password = login_details.getProperty("account_password");
		return account_password;
	}
}
