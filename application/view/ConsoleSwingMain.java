package view;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ConsoleSwingMain {

JTextArea textarea = new JTextArea();	
 	
	private void updateTextArea(final String text) {
		//Implementing the Swing Utilities Method
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				textarea.append(text);
			}
		}
	);
	}
		
	private void Streams() {
		OutputStream output = new OutputStream () {

			@Override
			public void write(int w) throws IOException {
				updateTextArea(String.valueOf((char) w));
			}
			
			@Override
			public void write(byte[] b, int off, int len) throws IOException{
				updateTextArea(new String(b, off, len));
			}
			
			@Override
			public void write(byte[] b) throws IOException {
				
			}
		}
	}
	
}

