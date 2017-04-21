package view;

import java.io.IOException;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import presenter.MainPresenter;
import java.awt.*;


import model.CodeSyntax;



public class MainGUI extends Application {
	

	
	@Override
	public void start(Stage mainStage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));	
			mainStage.setTitle("RUCM Application");
				mainStage.setScene(new Scene(root, 694, 623));	
				mainStage.setResizable(true);
				mainStage.show();	
		} catch (IOException e) {
				e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}

