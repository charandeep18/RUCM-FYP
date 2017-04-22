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
			
			
			//  Code used to attempt to bring in the CSS Colour changes into th GUI
			//	leftCode.setParagraphGraphicFactory(LineNumberFactory.get(leftCode));
			//        leftCode.richChanges().filter(ch -> !ch.getInserted().equals(ch.getRemoved())).subscribe(change -> {
			  //      leftCode.setStyleSpans(0, CodeSyntax.computeHighlighting(leftCode.getText()));
			//        });	
			
			
			
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

