package tests;

import org.junit.Assert;
import org.junit.Test;
import org.testfx.matcher.base.NodeMatchers;
import org.testfx.api.FxRobotException;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.api.FxRobot.*;
import org.testfx.util.WaitForAsyncUtils;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class HelpTabTest extends AbstractTest {
	
	final String MENU_HELP="#menuHelp";
	final String MENU_HELPITEM="#helpMenuItem";
	final String HELP_TABPANE="#helpTabPane";
	final String HELP_ANCHOR="#helpAnchor";
	final String HELP_ABOUTTAB="#aboutTab";
	final String HELP_ABOUTTEXTAREA="#aboutTextArea";
	final String HELP_TAB="#helpTab";
	final String HELP_HELPTEXTAREA="#helpTextArea";
	
	
	@Test
	public void openHelpStage(){
		verifyThat(MENU_HELP, NodeMatchers.isNotNull());
		verifyThat(MENU_HELP, NodeMatchers.hasText("Help"));
		clickOn("#menuHelp");
		verifyThat(MENU_HELPITEM, NodeMatchers.isNotNull());
		clickOn("#helpMenuItem");
		sleep(1000);
		verifyThat(HELP_TABPANE, NodeMatchers.isNotNull());			
	}
	
	@Test
	public void switchTabs(){
		verifyThat(MENU_HELP, NodeMatchers.isNotNull());
		verifyThat(MENU_HELP, NodeMatchers.hasText("Help"));
		clickOn("#menuHelp");
		verifyThat(MENU_HELPITEM, NodeMatchers.isNotNull());
		clickOn("#helpMenuItem");
		sleep(1000);
		verifyThat(HELP_TABPANE, NodeMatchers.isNotNull());	
		verifyThat(HELP_TAB, NodeMatchers.isNotNull());
		clickOn("#helpTab");
		verifyThat(HELP_HELPTEXTAREA, NodeMatchers.isNotNull());
		sleep(1000);
		verifyThat(HELP_ABOUTTAB, NodeMatchers.isNotNull());
		clickOn("#aboutTab");
		verifyThat(HELP_ABOUTTEXTAREA, NodeMatchers.isNotNull());
		
		
	}
	
	
	
//	@Test
//	public void helpFileMenuTest(){
//		verifyThat(MENU_HELP, NodeMatchers.isNotNull());
//		verifyThat(MENU_HELP, NodeMatchers.hasText("Help"));
//		clickOn("#menuHelp");
//		verifyThat(MENU_HELPITEM, NodeMatchers.isNotNull());
//		clickOn("#helpMenuItem");
//		sleep(1000);
//		verifyThat(HELP_TABPANE, NodeMatchers.isNotNull());
//	}
	
	
	
}
