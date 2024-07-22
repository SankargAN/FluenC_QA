package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ticket {

	@FindBy (xpath = "/html[1]/body[1]/aside[1]/div[1]/ul[1]/li[6]/a[1]") public WebElement mastermenu_side;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/select[1]") public WebElement institution_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[1]") public WebElement new_ticket_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[2]/div[1]/div[1]/select[1]") public WebElement issue_category_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[2]/div[1]/div[2]/input[1]") public WebElement issuesummary_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/fieldset[2]/div[1]/div[4]/input[1]") public WebElement issuedate_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/input[1]") public WebElement ticket_save_pom;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/form[1]/div[2]/a[1]") public WebElement ticket_cancel_pom;
}
