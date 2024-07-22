package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursedDuration {

	//Side menu
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/button[1]") public WebElement mastermenu_side;
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[5]/a[1]") public WebElement course_menu_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]") public WebElement durationDays_pom;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]") public WebElement cd_save_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/a[1]") public WebElement cd_cancel_pom;
}
