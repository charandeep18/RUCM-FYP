package sampleTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.But;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;

public class validation {
WebDriver driver = null;
	@Given("^user navigates to SAP site$")
	public void user_navigates_to_SAP_site() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chara\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:8080/demoUI5App/webapp/index.html#");
	}

	@Then("^fills out Reference Number$")
	public void fills_out_Reference_Number() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("__input1-inner")).sendKeys("12345678");
	}

//	@But("^It should only be numeric$")
//	public void It_should_only_be_numeric() {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}

	
	@Then("^fills out Contact Names$")
	public void fills_out_Contact_Names() {
		driver.findElement(By.id("__input0-inner")).sendKeys("Hello Rai");
	}
	
//	@But("^It should only allow spaces$")
//	public void It_should_only_allow_spaces() {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}
	
	@Then("^fills out the Description$")
	public void fills_out_the_Description() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("__area0-inner")).sendKeys("This is a test - Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
	}
	
//	@But("^It should only allow alphabets, numeric and spaces$")
//	public void It_should_only_allow_alphabets_numeric_and_spaces() {
//	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
//	}

}
