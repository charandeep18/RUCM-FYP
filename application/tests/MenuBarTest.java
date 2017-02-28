package tests;

import org.junit.Assert;
import org.junit.Test;
import org.testfx.matcher.base.NodeMatchers;
import org.testfx.api.FxRobotException;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.util.WaitForAsyncUtils;

public class MenuBarTest extends AbstractTest {

	final String MENU_BAR ="#MenuBar"; 
	final String MENU_FILE ="#menuFile";
	final String
	
	final String SAVE_CONTENTS = "#saveConents";
	final String LOAD_CONTENTS = "#loadFile";
	final String EXIT_APPLICATION = "#exit";
	
//	@Test
//	public void closeApplicationTest(){
//		clickOn("#menuFile");
//		clickOn("#exit");
//	}
	
	@Test
	public void loadFileMenuTest(){
		clickOn("#menuFile");
		clickOn("#loadFile");
	}
	
	@Test
	public void saveFileMenuTest(){
		clickOn("#menuFile");
		clickOn("#saveContents");
	}

}
