package presenter;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class HelpPresenter {

    @FXML
    private AnchorPane helpAnchor;

    @FXML
    private TabPane helpTabPane;

    @FXML
    private Tab aboutTab;

    @FXML
    private TextArea aboutTextArea;

    @FXML
    private Tab helpTab;

    @FXML
    private AnchorPane helpTextArea;
    
    @FXML
    public void ExitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }
    
    
	
}
