package sampleTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;

public class Open {
	WebDriver driver = null;
	@Given("^user navigates to Website$")
	public void user_navigates_to_Website() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\chara\\Desktop\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:8080/demoUI5App/webapp/index.html#");
	}

	@Then("^fills out Contact Name$")
	public void fills_out_Contact_Name() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("__input0-inner")).sendKeys("Charandeep Rai");
		//driver.findElement(By.xpath("/html/body/div[3]/div[3]/section/div/div/div/div/div[2]/div/section/div/div[2]/div/div/div/div/div/div[1]/div/div/div/div[4]/div/input")).sendKeys("Charandeep Rai");
		//driver.sendKeys("Charandeep Rai");
	
	}

	@And("^ticks UOR check$")
	public void ticks_UOR_check() {
		driver.findElement(By.id("__xmlview0--cbIsUOR-CbBg")).click();
	}

	@Then("^enters company as \"([^\"]*)\"$")
	public void enters_company_as(String arg1) {
		driver.findElement(By.id("__xmlview0--variants-arrow")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("__item22")).click();		
	}

	@And("^enters Reigion as \"([^\"]*)\"$")
	public void enters_Reigion_as(String arg1) {
		driver.findElement(By.id("__select0-arrow")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("__item1-__select0-0")).click();		
	}
	
	@Then("^clicks on Navigation One$")
	public void clicks_on_Navigation_One() {
		driver.findElement(By.id("__button0-inner")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement element = driver.findElement(By.id("__button0-inner"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).sendKeys(Keys.RETURN).perform();
	}
	
	@Then("^checks to see if on Navigation One page$")
	public void checks_to_see_if_on_Navigation_One() {
		boolean present;
		try {
		   driver.findElement(By.id("__text9"));
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
	}
}
