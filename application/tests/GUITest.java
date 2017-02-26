package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUITest extends ApplicationTest{

	

	@Override
	public void start(Stage stage) throws Exception {
		Parent loadNode = FXMLLoader.load(getClass().getResource("/view/GherkinView.fxml"));
		stage.setScene(new Scene(loadNode));
		stage.show();
		stage.toFront();
	}
	
//	public <T extends Node> Object find (final String query){
//		return lookup(query).query();
//	}
	
	@Override
	public void stop(){
		
	}
	

}
