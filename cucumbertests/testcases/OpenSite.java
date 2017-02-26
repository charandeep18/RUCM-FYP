package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;

public class OpenSite {
	WebDriver driver = null;
	@Given("^user navigates to SAP website$")
	public void goToSiteLogin() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("www.google.com");
	

	}
}
