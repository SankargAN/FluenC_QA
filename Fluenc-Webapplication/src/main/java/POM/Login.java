package POM;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class Login {

	//Login
	@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/a[1]") public WebElement login_again;
	@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]") public WebElement your_email;
	@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]") public WebElement password;
	@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/input[2]") public WebElement sign_in;
	
	//Forgot Password
	@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/form[1]/div[1]/input[1]") public WebElement fp_your_email;
	@FindBy (xpath = "/html[1]/body[1]/main[1]/div[1]/section[1]/div[1]/form[1]/input[2]") public WebElement fp_reset_password;

}
