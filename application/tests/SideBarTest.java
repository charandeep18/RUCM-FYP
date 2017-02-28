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
		verifyThat(SAVE_BUTTON, NodeMatchers.isNotNull());
		verifyThat(SAVE_BUTTON, NodeMatchers.hasText("Save Test Case"));
		clickOn("#saveButton");
	}
	
	@Test
	public void clickOnValidateButton(){
		verifyThat(VALIDATE_BUTTON, NodeMatchers.isNotNull());
		verifyThat(VALIDATE_BUTTON, NodeMatchers.hasText("Validate Script"));
		clickOn("#validateButton");
	}
	
	@Test
	public void clickOnStepDefsButton(){
		verifyThat(STEPDEFS_BUTTON, NodeMatchers.isNotNull());
		verifyThat(STEPDEFS_BUTTON, NodeMatchers.hasText("Create Step Defs"));
		clickOn("#createStepDefsButton");
	}
	
	@Test
	public void clickOnSeleniumButton(){
		verifyThat(SELENIUM_BUTTON, NodeMatchers.isNotNull());
		verifyThat(SELENIUM_BUTTON, NodeMatchers.hasText("Selenium View"));
		clickOn("#seleniumViewButton");

	}
	
	@Test
	public void checkLabelExists(){	
		verifyThat(LABEL, NodeMatchers.isNotNull());
		verifyThat(LABEL, NodeMatchers.hasText("Created by Charandeep Rai"));
	}
	
	@Test
	public void clickOnCloseButton(){
		verifyThat(CLOSE_BUTTON, NodeMatchers.isNotNull());
		verifyThat(CLOSE_BUTTON, NodeMatchers.hasText("Exit Application"));
		clickOn("#closeButton");
	}
	
}
