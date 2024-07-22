package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class salescontactpage {
	public static Properties salescontact_details;
	
	public salescontactpage () {
		File file = new File(System.getProperty("user.dir")+"/TestData/salesContact");
		try {
			salescontact_details = new Properties();
			FileInputStream input = new FileInputStream(file);
			salescontact_details.load(input);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String sales_master_setup() {
		String sales_master_setup = salescontact_details.getProperty("sales_master_setup");
		return sales_master_setup;
	}
	public String sales_contact() {
		String sales_contact = salescontact_details.getProperty("sales_contact");
		return sales_contact;
	}
	public String new_sales_contact() {
		String new_sales_contact = salescontact_details.getProperty("new_sales_contact");
		return new_sales_contact;
	}
	public String sales_type() {
		String sales_type = salescontact_details.getProperty("sales_type");
		return sales_type;
	}
	public String sales_type_option() {
		String sales_type_option = salescontact_details.getProperty("sales_type_option");
		return sales_type_option;
	}

	public String pro_fullname() {
		String pro_fullname = salescontact_details.getProperty("Datafullname");
		return pro_fullname;
	}
	public String proEmail() {
		String proEmail = salescontact_details.getProperty("DataEmail");
		return proEmail;
	}
	public String proPhone() {
		String proPhone = salescontact_details.getProperty("DataPhone");
		return proPhone;
	}
	public String proIntEmp() {
		String proIntEmp = salescontact_details.getProperty("DataInternalEmp");
		return proIntEmp;
	}
	
	public String sales_save() {
		String sales_save = salescontact_details.getProperty("sales_save");
		return sales_save;
	}
	public String sales_cancel() {
		String sales_cancel = salescontact_details.getProperty("sales_cancel");
		return sales_cancel;
	}
}
