package tests;

import org.junit.Before;
import org.testfx.framework.junit.ApplicationTest;

import view.MainGUI;

public abstract class TestFXBase extends ApplicationTest  {

	@Before
	public void setUpClass() throws Exception {
		ApplicationTest.launch(MainGUI.class);
	}
	
	
}
