package tests;

import org.junit.Test;

public class SideBarTest extends AbstractTest {

	final String LOAD_BUTTON = "#loadButton";
	final String SAVE_BUTTON = "#saveButton";
	final String CLOSE_BUTTON = "#closeButton";
	final String VALIDATE_BUTTON = "#validateButton";
	
	
	@Test
	public void clickOnLoadButton(){
		clickOn("#loadButton");
	}
	
	@Test
	public void clickOnSaveButton(){
		clickOn("#saveButton");
	}
	
	@Test
	public void clickOnCloseButton(){
		clickOn("#closeButton");
	}
	
	@Test
	public void clickOnValidateButton(){
		clickOn("#validateButton");
	}
	
	
}
