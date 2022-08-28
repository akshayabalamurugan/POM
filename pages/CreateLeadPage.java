package pages;

import org.openqa.selenium.By;

import base.BaseClass;


public class CreateLeadPage extends BaseClass{

	
	public CreateLeadPage enterCompanyName(String companyname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		return this;
	}
	

	public CreateLeadPage enterFirstName(String firstname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
	
	
	public CreateLeadPage enterLastName(String lastname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("lastname");
		return this;
	}
	
	
	public ViewLeadsPage createLead() {
		getDriver().findElement(By.className("smallSubmit")).click();
		return new ViewLeadsPage();
	}
}
