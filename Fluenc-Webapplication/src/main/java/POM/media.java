package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class media {

	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[7]/button[1]") public WebElement managecontent_side;
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]") public WebElement media_menu_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/a[1]") public WebElement upload_media_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]") public WebElement choose_file_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]") public WebElement upload_btn_pom;
}
