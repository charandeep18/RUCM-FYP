package tests;

import java.util.concurrent.TimeoutException;

import org.junit.After;
import org.junit.Before;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import view.MainGUI;
//import start.Start;

public abstract class AbstractTest extends ApplicationTest  {

	@Before
	public void setUpClass() throws Exception {
		ApplicationTest.launch(MainGUI.class);
		//ApplicationTest.launch(Start.class);
	}
	
	@Override
	public void start(Stage mainstage) throws Exception {
		mainstage.show();
	}
	
	@After
	public void afterEachTest() throws TimeoutException {
		FxToolkit.hideStage();
		release(new KeyCode[]{});
		release(new MouseButton[]{});
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Node> T find(final String query){
		return (T) lookup(query).queryAll().iterator().next();
	}
}
