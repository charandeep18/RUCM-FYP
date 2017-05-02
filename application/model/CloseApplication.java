package model;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class CloseApplication {
	
	public static void ExitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
	}
	
}
