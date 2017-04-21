package presenter;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.StyledTextArea;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.stage.FileChooser;
import model.saveFile;

public class CloseAlertPresenter {

    @FXML
    private Button saveButtonAlert;

    @FXML
    private Button cancelAlert;

    @FXML
    private Button closeButtonAlert;
    
    @FXML
    private MainPresenter code;
    
    @FXML
    private SplitPane AlertStage;

    @FXML
    public void ExitApplication(ActionEvent event) {
    	Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }
    
    @FXML
    public void SaveFile(ActionEvent event){
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Save File");
		File file = fileChooser.showSaveDialog(AlertStage.getScene().getWindow());
		if (file != null) {
	//		saveFile.savetext(((code.getText(), file);
		}
    }
    
    @FXML
    public void CloseAlert(ActionEvent event) throws IOException{
    	((Closeable) AlertStage).close();
    }
    
	
}
