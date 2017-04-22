package model;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class CloseApplication {

	public void ExitApplication() {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
	}
	
}
