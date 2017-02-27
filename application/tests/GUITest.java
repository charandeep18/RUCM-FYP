//package tests;
//
//import static org.junit.Assert.*;
//
//import java.util.concurrent.TimeoutException;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.testfx.api.FxToolkit;
//import org.testfx.framework.junit.ApplicationTest;
//
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.input.KeyCode;
//import javafx.scene.input.MouseButton;
//import javafx.stage.Stage;
//
//public class GUITest extends ApplicationTest{
//
//     Button loadButton;    
//     Button closeButton;
//     Button saveButton;
//     Button validateButton;
//
//   
//
//     
//     
//	@Override
//	public void start(Stage stage) throws Exception {
//		Parent loadNode = FXMLLoader.load(getClass().getResource("/view/GherkinView.fxml"));
//		stage.setScene(new Scene(loadNode));
//		stage.show();
//		stage.toFront();
//	}
//	
////	public <T extends Node> T find (final String query){
////		return lookup
////	}
//	
//	@Before
//	public void setUp(){
////		loadButton = find("#loadButton");
//		
//		
//	}
//	
//
//	@After
//	public void stop() throws TimeoutException{
//	FxToolkit.hideStage();
//	release(new KeyCode[] {
//	});
//	release(new MouseButton[]{
//	});
//	}
//	

//
