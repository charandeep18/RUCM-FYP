package model;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ConsoleController {

	@FXML
	private TextArea console;
	private PrintStream printstream;
	
	public void initialize() {
		printstream = new PrintStream(new Console(console));
	}
	
	public void button(ActionEvent event) {
		System.setErr(printstream);
		System.setOut(printstream);
		System.out.println("IT WORKS");
	}
	
	public class Console extends OutputStream {
		private TextArea console;

		public Console(TextArea console){
			this.console = console;
		}
		
		public void appendText(String valueOf) {
			Platform.runLater(() -> console.appendText(valueOf));
		}
		
		@Override
		public void write(int b) throws IOException {
			appendText(String.valueOf((char)b));
		}
		
		
		
	}
	
	
}
