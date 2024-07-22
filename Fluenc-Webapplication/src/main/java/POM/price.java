package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class price {

	//Side manu
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/button[1]") public WebElement mastermenu;
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]") public WebElement pricemenu_pom;
	
	//Main page
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]") public WebElement price_text_pom;
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/input[1]") public WebElement discount_pom;
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/select[1]") public WebElement intrastate_pom;
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/select[1]") public WebElement interstate_pom;
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/input[1]") public WebElement Priceinclgst_pom;
	
	//Button
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]") public WebElement price_save_pom;
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]") public WebElement price_cancel_pom;
}
