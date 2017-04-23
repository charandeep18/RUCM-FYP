package tests;

import org.junit.Test;

import com.google.common.base.Verify;

import javafx.stage.FileChooser;

import static org.testfx.api.FxAssert.*;

import java.io.File;

import org.junit.*;
import org.testfx.*;
import org.testfx.matcher.base.NodeMatchers;

public class SideBarTest extends AbstractTest {

	final String LOAD_BUTTON = "#loadButton";
	final String SAVE_BUTTON = "#saveButton";
	final String CLOSE_BUTTON = "#closeButton";
	final String STEPDEFS_BUTTON = "#createStepDefsButton";
	final String NEW_BUTTON = "#newButton";
	final String LABEL = "#nameLabel";
	final String LEFT_SEPERATOR = "#leftSeperator";
	final String CENTER_SEPERATOR = "#centerSeperator";
	final String RIGHT_SEPERATOR = "#rightSeperator";
	
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
	public void clickOnStepDefsButton(){
		verifyThat(STEPDEFS_BUTTON, NodeMatchers.isNotNull());
		verifyThat(STEPDEFS_BUTTON, NodeMatchers.isVisible());
		verifyThat(STEPDEFS_BUTTON, NodeMatchers.hasText("Create Step Defintions"));
		clickOn("#createStepDefsButton");
	}
	
	@Test
	public void clickOnNewButton(){
		verifyThat(NEW_BUTTON, NodeMatchers.isNotNull());
		verifyThat(NEW_BUTTON, NodeMatchers.isVisible());
		verifyThat(NEW_BUTTON, NodeMatchers.hasText("Create a New Feature File"));
		clickOn("#newButton");
	}

	@Test
	public void checkLabelExists(){	
		verifyThat(LABEL, NodeMatchers.isNotNull());
		verifyThat(LABEL, NodeMatchers.isVisible());
		verifyThat(LABEL, NodeMatchers.hasText("Created by Charandeep Rai for Aston University"));
	}
	
	@Test
	public void checkSeperatorExists(){
		verifyThat(LEFT_SEPERATOR, NodeMatchers.isNotNull());
		verifyThat(LEFT_SEPERATOR, NodeMatchers.isVisible());
		verifyThat(CENTER_SEPERATOR, NodeMatchers.isNotNull());
		verifyThat(CENTER_SEPERATOR, NodeMatchers.isVisible());
		verifyThat(RIGHT_SEPERATOR, NodeMatchers.isNotNull());
		verifyThat(RIGHT_SEPERATOR, NodeMatchers.isVisible());
	}

	
	@Test
	public void clickOnCloseButton(){
		verifyThat(CLOSE_BUTTON, NodeMatchers.isNotNull());
		verifyThat(CLOSE_BUTTON, NodeMatchers.isVisible());
		verifyThat(CLOSE_BUTTON, NodeMatchers.hasText("Exit Application"));
		//clickOn("#closeButton");
	}
	
}
