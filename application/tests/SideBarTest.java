package tests;

import org.junit.Test;

import com.google.common.base.Verify;
import static org.testfx.api.FxAssert.*;
import org.junit.*;
import org.testfx.*;
import org.testfx.matcher.base.NodeMatchers;

public class SideBarTest extends AbstractTest {

	final String LOAD_BUTTON = "#loadButton";
	final String SAVE_BUTTON = "#saveButton";
	final String CLOSE_BUTTON = "#closeButton";
	final String VALIDATE_BUTTON = "#validateButton";
	final String STEPDEFS_BUTTON = "#createStepDefsButton";
	final String SELENIUM_BUTTON = "#seleniumViewButton";
	final String LABEL = "#nameLabel";
	
	@Test
	public void clickOnLoadButton(){
		
		verifyThat(LOAD_BUTTON, NodeMatchers.isNotNull());
		verifyThat(LOAD_BUTTON, NodeMatchers.hasText("Load Test Case"));
		clickOn("#loadButton");
	}
	
	@Test
	public void clickOnSaveButton(){
		clickOn("#saveButton");
	}
	
	@Test
	public void clickOnValidateButton(){
		clickOn("#validateButton");
	}
	
	@Test
	public void clickOnStepDefsButton(){
		clickOn("#createStepDefsButton");
	}
	
	@Test
	public void clickOnSeleniumButton(){
		
		
		clickOn("#seleniumViewButton");

	}
	
	@Test
	public void checkLabelExists(){	
		verifyThat(LABEL, NodeMatchers.isNotNull());
		verifyThat(LABEL, NodeMatchers.hasText("Created by Charandeep Rai"));
	}
	
}
