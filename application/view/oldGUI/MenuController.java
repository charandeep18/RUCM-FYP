package view.oldGUI;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class MenuController {

    @FXML
    private MenuItem exit;

    @FXML
    void ExitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }

}
