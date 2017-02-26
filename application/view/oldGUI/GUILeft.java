package view.oldGUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUILeft extends Application {
	
	public static GridPane leftgrid = new GridPane();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	
	leftgrid.setPadding(new Insets(10,20,10,0));
	leftgrid.setVgap(10);
	leftgrid.setHgap(10);
	leftgrid.setGridLinesVisible(true);	
	
	Button loadCase = new Button("Load Test Case");
	GridPane.setConstraints(loadCase, 1, 0);
	
	Button create = new Button("Create Step Definitions");
	GridPane.setConstraints(create, 1, 1);
	
	Button seleniumView = new Button("Selenium View");
	GridPane.setConstraints(seleniumView, 1, 2);
	
	Button exit = new Button("Exit Application");
	GridPane.setConstraints(exit, 1, 3);
	
	leftgrid.getChildren().addAll(loadCase, create, seleniumView, exit);
	
	Scene scene = new Scene(leftgrid, 500, 400);
	primaryStage.setScene(scene);
	primaryStage.show();
	}

}
