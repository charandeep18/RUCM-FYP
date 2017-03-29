package view;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ConsoleViewSwing extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		final SwingNode swingNode = new SwingNode();
		swingContent(swingNode);
		
		StackPane pane = new StackPane();
		pane.getChildren().add(swingNode);
		
		primaryStage.setTitle("Console View");
		primaryStage.setScene(new Scene(pane, 300, 200));
		primaryStage.show();
		
		
	}
	
	public void swingContent(final SwingNode swingNode) {
		
	}
}
