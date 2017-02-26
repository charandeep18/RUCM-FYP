package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;


public class Openwebpage {
WebDriver driver = null;
@Given("^user navigates to Website$")
public void goToSite() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\chara\\Desktop\\chromedriver.exe");
driver = new ChromeDriver();
driver.navigate().to("http://127.0.0.1:58714/Homepage.html");
}

@And("^find the link to the webpage$")
public void findSite2(){
driver.findElement(By.id("link1"));
}

@Then("^click on the link$")
public void clickSite2(){
driver.findElement(By.id("link1")).click();
}




}