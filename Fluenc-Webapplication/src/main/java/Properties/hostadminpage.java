package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class hostadminpage {
	public static Properties hostadmin_details;
	
	public hostadminpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/HostAdmin");
		try {
			hostadmin_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			hostadmin_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String master_setup() {
		String master_setup = hostadmin_details.getProperty("master_setup");
		return master_setup;
	}	
	public String hostadmin() {
		String hostadmin = hostadmin_details.getProperty("hostadmin");
		return hostadmin;
	}
	public String account_password() {
		String new_host_admin = hostadmin_details.getProperty("new_host_admin");
		return new_host_admin;
	}
	public String full_name() {
		String full_name = hostadmin_details.getProperty("full_name");
		return full_name;
	}
	public String email() {
		String email = hostadmin_details.getProperty("email");
		return email;
	}
	public String ha_password() {
		String ha_password = hostadmin_details.getProperty("ha_password");
		return ha_password;
	}
	public String ha_conf_password() {
		String ha_conf_password = hostadmin_details.getProperty("ha_conf_password");
		return ha_conf_password;
	}
	public String sub_role() {
		String sub_role = hostadmin_details.getProperty("sub_role");
		return sub_role;
	}
}
