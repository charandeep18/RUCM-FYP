package view.oldGUI;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIMain extends Application {

	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("RUCM - Use Case Creator");
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(GUIMenuBar.mainmenuPane);
		borderPane.setLeft(GUILeft.leftgrid);
		
		Scene scene = new Scene(borderPane, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setOnCloseRequest(e -> closeProgram());
}
	
    private void closeProgram(){
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }
}