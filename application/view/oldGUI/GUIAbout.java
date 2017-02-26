package view.oldGUI;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GUIAbout {

	private static Button closeButton = new Button("Close the window");
	private static TextArea textArea = new TextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."); 
	
	
	
	public static void display(String message, String title){
		Stage aboutWindow = new Stage();
		aboutWindow.setTitle("About the RUCM Editor");
		aboutWindow.setMinWidth(400);
		aboutWindow.setMinHeight(500);
		aboutWindow.initModality(Modality.APPLICATION_MODAL);
		
		closeButton.setOnAction(e-> aboutWindow.close());
		textArea.setDisable(true);
		textArea.setWrapText(true);
		
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(textArea, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene aboutScene = new Scene(layout);
		aboutWindow.setScene(aboutScene);
		aboutWindow.showAndWait();
	}
	
}
