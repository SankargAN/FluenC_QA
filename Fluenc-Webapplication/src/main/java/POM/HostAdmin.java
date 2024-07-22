package POM;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HostAdmin {

	//Master Setup Host Admin
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/button[1]") public WebElement master_setup;
	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[5]/ul[1]/li[1]") public WebElement hostadmin;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[1]") public WebElement new_host_admin;
	
	// New host admin
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]") public WebElement full_name;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/select[1]") public WebElement role;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/select[1]/option[2]") public WebElement role_super;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/input[1]") public WebElement emp_id;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[2]/input[1]") public WebElement position;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[2]/div[1]/div[1]/input[1]") public WebElement email;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[2]/input[1]") public WebElement ph;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[2]/input[1]") public WebElement Aadhaar;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[3]/div[1]/div[2]/input[1]") public WebElement pan_no;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[4]/div[1]/div[1]/input[1]") public WebElement line1;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[4]/div[1]/div[2]/input[1]") public WebElement line2;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[4]/div[1]/div[3]/input[1]") public WebElement city;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[4]/div[1]/div[4]/select[1]") public WebElement state;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[4]/div[1]/div[5]/input[1]") public WebElement country;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[4]/div[1]/div[6]/input[1]") public WebElement pincode;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[5]/div[1]/div[1]/input[1]") public WebElement ha_password;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[5]/div[1]/div[2]/input[1]") public WebElement ha_conf_password;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/input[1]") public WebElement save;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/a[1]") public WebElement ha_cancel;
}
