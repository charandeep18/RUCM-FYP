/**
 * The MainGUI class is the runner class used for application, the aim for this class is to load in the starting FXML file and load up the stage around it. 
 */

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

	private CodeArea leftCode;

	@Override
	public void start(Stage mainStage) throws Exception {
		try {
			// The root is the variable of Parent which acts as the FXML base class for any scene and stage objects
			Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
			
			/**
			 * Required code needed to implement the RichTextFX CodeArea, there
			 * are issues with the implementation however as the
			 * computerHighlighting and richChanges method do not function if
			 * the CodeArea object is used with the JavaFX FXML bindings.
			 *
			 * leftCode.setParagraphGraphicFactory(LineNumberFactory.get(leftCode));
			 * leftCode.richChanges().filter(ch ->!ch.getInserted().equals(ch.getRemoved())).subscribe(change -> {
			 * leftCode.setStyleSpans(0,CodeSyntax.computeHighlighting(leftCode.getText())); });
			 * 
			 */
			
			// The code below sets the size, title, and resizability of the JavaFX stage
			mainStage.setTitle("RUCM Application");
			mainStage.setScene(new Scene(root, 694, 623));
			mainStage.setResizable(true);
			mainStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

// The main class which is executed when the project is run
	public static void main(String[] args) {
		launch(args);
	}
}
