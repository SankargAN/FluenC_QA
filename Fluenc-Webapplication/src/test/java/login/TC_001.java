package login;

import org.testng.annotations.Test;
import Utilities.BaseClass;

public class TC_001 extends BaseClass {

	@Test (priority = 1)
	public static void open_URL() {
		extentInfo("Open Broswer");
		extentInfo("Enter URL");
		get(loginPage_details.URL());
	}
	@Test (priority = 2)
	public static void login() throws InterruptedException {
		click(login_Pom.login_again);
		Thread.sleep(1000);
		extentInfo("Enter User name");
		sendData(login_Pom.your_email, loginPage_details.account_your_email());
		Thread.sleep(1000);
		extentInfo("Enter Password");
		sendData(login_Pom.password, loginPage_details.account_password());
		Thread.sleep(1000);
		extentInfo("Click on login button");
		click(login_Pom.sign_in);
		
		//implicit_wait(10);
	}
}
