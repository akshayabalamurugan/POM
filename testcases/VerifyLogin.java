package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomepage;
import pages.MyLeadsPage;

public class VerifyLogin extends BaseClass {
	@BeforeTest
	public void excelName() {
		excelFileName="login";
	}
	
	
	
	@Test (dataProvider = "data")
	public void runLogin(String username, String password ) {
		
		LoginPage lp= new LoginPage();
		lp.typePassword(username);
		lp.typePassword(password);
		lp.clickLogin();
		
	}

}
