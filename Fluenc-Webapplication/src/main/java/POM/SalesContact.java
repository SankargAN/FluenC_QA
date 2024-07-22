package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesContact {
	
	//Master Setup
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/button[1]") public WebElement sales_master_setup;
	//@FindBy (xpath = "/html/body/aside/div/ul/li[5]/ul/li[2]") public WebElement sales_contact;
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[2]")public WebElement sales_contact;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[1]") public WebElement new_sales_contact;
	
	//Add new sales contcat
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]") public WebElement sales_type;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]/option[2]") public WebElement sales_type_option;

	//FullName
	@FindBy (xpath = "/html/body/div/div/form/div/div[2]/input") public WebElement sc_Pomfullname;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/input[1]") public WebElement pomEmail;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[2]/input[1]") public WebElement pomPhone;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/select[1]") public WebElement pomSelect;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/select[1]/option[2]") public WebElement pomInternalEmp;
	
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[5]/input[1]") public WebElement sales_save;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[5]/a[1]") public WebElement sales_cancel;
}


