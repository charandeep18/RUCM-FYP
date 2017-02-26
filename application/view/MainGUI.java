package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGUI extends Application {
	

	//public static Window mainStage;
	
	@Override
	public void start(Stage mainStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("GherkinView.fxml"));
				mainStage.setTitle("RUCM Application");
				mainStage.setScene(new Scene(root, 694, 623));
				mainStage.setResizable(false);
				mainStage.show();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
