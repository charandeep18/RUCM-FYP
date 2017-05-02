package tests;

import org.junit.Assert;
import org.junit.Test;
import org.testfx.matcher.base.NodeMatchers;
import org.testfx.api.FxRobotException;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.util.WaitForAsyncUtils;

public class MenuBarTest extends AbstractTest {

	//final String MENU_BAR ="#MenuBar"; 
	//final String MENU_FILE ="#menuFile";
	final String MENU_VIEW ="#menuView";
	final String MENU_RUNOPTIONS="#menuRunOptions";
	final String MENU_HELP="#menuHelp";
	final String SAVE_CONTENTS = "#saveContents";
	final String LOAD_CONTENTS = "#loadFile";
	//final String EXIT_APPLICATION = "#exit";
	final String MENU_HELPITEM="#helpMenuItem";
	final String HELP_TABPANE="#helpTabPane";
	
	final String MENU_BAR ="#MenuBar"; 
	final String MENU_FILE ="#menuFile";
	final String SAVE_FILE ="#saveContents";
	final String LOAD_FILE ="#loadFile";
	final String TEST = "#test";
	final String EXIT_APPLICATION = "#exit";
			
	
	
//	@Test
//	public void closeApplicationTest(){
//		clickOn("#menuFile");
//		verifyThat(EXIT_APPLICATION, NodeMatchers.isNotNull());
//	}
	
//	@Test
//	public void fileMenuTest(){
//		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
//		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
//		clickOn("#menuFile");
//	}
	
//	@Test
//	public void sampleTest(){
//		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
//		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
//		clickOn("#menuFile");
//	}
	
	
	
//	@Test
//	public void loadFileMenuTest(){
//		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
//		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
//		clickOn("#menuFile");
//		sleep(1000);
//		verifyThat(LOAD_FILE, NodeMatchers.isNotNull());
//	}
	
	
	@Test
	public void loadFileMenuTest(){
		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
		clickOn("#menuFile");
		verifyThat(LOAD_FILE, NodeMatchers.isNotNull());
		verifyThat(LOAD_FILE, NodeMatchers.hasText("Load Text File"));
		clickOn(LOAD_FILE);
	}
//	
//	@Test
//	public void saveFileMenuTest(){
//		verifyThat(MENU_FILE, NodeMatchers.isNotNull());
//		verifyThat(MENU_FILE, NodeMatchers.hasText("File"));
//		clickOn("#menuFile");
//		verifyThat(SAVE_CONTENTS, NodeMatchers.isNotNull());
//		//verifyThat(SAVE_CONTENTS, NodeMatchers.hasText("Save Text File"));
//		clickOn("#saveContents");
//	}
//	
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
//	


}
