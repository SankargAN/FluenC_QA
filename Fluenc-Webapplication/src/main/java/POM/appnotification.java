package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class appnotification {

	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[8]/a[1]") public WebElement appnotification_sidemenu_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]") public WebElement title_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/textarea[1]") public WebElement message_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]") public WebElement institution_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]") public WebElement save_btn_pom;
}
