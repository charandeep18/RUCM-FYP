package presenter;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    private AnchorPane aboutAnchor;

    @FXML
    private TextArea aboutTextArea;

    @FXML
    private Tab helpTab;

    @FXML
    private AnchorPane helpTextAnchor;
    
    @FXML
    private TextArea helpTextArea;
    
    @FXML
    private Tab cucumberTab;
    
    @FXML
    private AnchorPane cucumberAnchor;
    
    @FXML
    private TextArea cucumberArea;
	
}
