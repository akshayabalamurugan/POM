package pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import base.BaseClass;


public class LoginPage extends BaseClass{
	
	public LoginPage typeUsername(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
	
	public LoginPage typePassword(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
	

	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
