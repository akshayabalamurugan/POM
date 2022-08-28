package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomepage extends BaseClass {

	public MyLeadsPage clickLeadsTab() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
}
