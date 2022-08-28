package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DataFromExcel;


public class BaseClass {
	
	public String excelFileName="";
	
	private static final ThreadLocal<RemoteWebDriver> remoteDriver= new ThreadLocal<RemoteWebDriver>();
	 
	public void setDriver() {
		remoteDriver.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
		return remoteDriver.get();
	}
	
	@BeforeMethod
	public void browserSetUp() {
		WebDriverManager.chromedriver().setup();
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/control/login");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@DataProvider(name="data")
	public String[][] dataset() throws IOException {
		String[][] data= DataFromExcel.readData(excelFileName);
		return data;
	}
	
}
