package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class Search {
	WebDriver driver = null;
	@Given("^User has navigated to the website to search$")
	public void goToSiteSearch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1:58714/Homepage.html");
}
	@And("^Finds the search bar in the website header$")
	public void findSearch(){
	driver.findElement(By.id("textbar"));
	}
	
	@Then("^enters search information$")
	public void enterSearchInfo(){
	driver.findElement(By.id("textbar")).sendKeys("Search Request");
	}
	
	
	@And("^Clicks Submit$")
	public void clickSubmit(){
	driver.findElement(By.id("submit")).click();
	}
}
