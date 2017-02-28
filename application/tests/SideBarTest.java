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
//		String LABEL = "Created by Charandeep Rai";
//		verifyThat(LABEL, (Label label) -> {
//			String text = label.getText();
//			return text.contains(LABEL);
//		});
		
	verifyThat(LABEL, NodeMatchers.isNotNull());
	verifyThat(LABEL, NodeMatchers.hasText("Createsd by Charandeep Rai"));
	}
	
	
//	@Test
//	public void clickOnCloseButton(){
//		clickOn("#closeButton");
//	}
	
	
}
