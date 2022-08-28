package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	
	
	@BeforeTest
	public void excelName() {
		excelFileName="CreateLead";
	}
	

	@Test (dataProvider = "data")
	public void runCreateLead(String username, String password, String companyname, String firstname, String lastname) {
	
		LoginPage lp= new LoginPage();
		lp.typeUsername(username)
		.typePassword(password)
		.clickLogin()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLeadLink()
		.enterCompanyName(companyname)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.createLead();
		
	}
	
}

