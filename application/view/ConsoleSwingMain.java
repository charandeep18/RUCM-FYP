package view;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ConsoleSwingMain {

JTextArea textarea = new JTextArea();	
 	
	private void updateTextArea(final String text) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				textarea.append(text);
			}
		}
	);
	
}
}
