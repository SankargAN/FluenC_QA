package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class institution {

	//Left Side menu
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[3]/a[1]") public WebElement institution_menu;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[1]") public WebElement oi_new_institution;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/input[1]") public WebElement oi_title_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[1]/div[1]/input[1]") public WebElement oi_line_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[2]/div[2]/input[1]") public WebElement oi_areacode_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[3]/div[1]/input[1]") public WebElement oi_city_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[3]/div[2]/input[1]") public WebElement oi_city_code_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[4]/div[1]/select[1]") public WebElement oi_state_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[4]/div[2]/input[1]") public WebElement oi_pincode_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[5]/div[1]/div[2]/input[1]") public WebElement oi_email_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[5]/div[1]/div[3]/input[1]") public WebElement oi_phone_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[7]/div[1]/div[1]/select[1]") public WebElement oi_domain_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[8]/div[1]/div[1]/select[1]") public WebElement oi_sales_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]") public WebElement oi_save_pom;
  }
