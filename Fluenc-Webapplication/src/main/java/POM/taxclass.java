package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class taxclass {

	//Side menu
	@FindBy (xpath ="/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/button[1]") public WebElement mastermenu_side;
	@FindBy (xpath="/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[4]/a[1]") public WebElement taxclass_menu_pom;
	
	//Main page
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[1]") public WebElement newtax_btn_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]") public WebElement taxtitle_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]") public WebElement taxdes_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/input[1]") public WebElement taxper_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]") public WebElement taxsave_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/a[1]") public WebElement taxcancel_pom;
}
