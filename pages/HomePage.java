package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;


public class HomePage extends BaseClass {

	public HomePage verifyLogin() {
		String expTitle="Leaftaps - TestLeaf Automation Platform";
		String actTiltle= getDriver().getTitle();
		Assert.assertEquals(expTitle, actTiltle);
		return this;
	}
	
	public MyHomepage clickCrmsfaLink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomepage();
	}
}
