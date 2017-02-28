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
	final String MENU_VIEW ="#menuView";
	final String MENU_RUNOPTIONS="#menuRunOptions";
	final String MENU_HELP="#menuHelp";
	final String SAVE_CONTENTS = "#saveContents";
	final String LOAD_CONTENTS = "#loadFile";
	final String EXIT_APPLICATION = "#exit";
	
//	@Test
//	public void closeApplicationTest(){
//		clickOn("#menuFile");
//		clickOn("#exit");
//	}
	
	@Test
	public void fileMenuTest(){
		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
		clickOn("#menuFile");
	}
	
	@Test
	public void loadFileMenuTest(){
		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
		clickOn("#menuFile");
		verifyThat(LOAD_CONTENTS, NodeMatchers.isNotNull());
		//verifyThat(LOAD_CONTENTS, NodeMatchers.hasText("Load Text File"));
		clickOn("#loadFile");
	}
	
	@Test
	public void saveFileMenuTest(){
		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
		clickOn("#menuFile");
		verifyThat(SAVE_CONTENTS, NodeMatchers.isNotNull());
		//verifyThat(SAVE_CONTENTS, NodeMatchers.hasText("Save Text File"));
		clickOn("#saveContents");
	}
	


}
