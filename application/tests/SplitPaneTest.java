package tests;

import static org.testfx.api.FxAssert.verifyThat;

import org.junit.Test;
import org.testfx.matcher.base.NodeMatchers;

public class SplitPaneTest {

	final String SPLIT_PANE ="#splitPane";
	final String CODE_AREA ="#code";
	final String CONSOLE ="#console";

	@Test
	public void clickOnLoadButton(){
	verifyThat(SPLIT_PANE, NodeMatchers.isNotNull());
}
}