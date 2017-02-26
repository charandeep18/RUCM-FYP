package presenter;

import java.awt.Desktop;
import java.io.File;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import org.fxmisc.richtext.RichTextChange;
import org.fxmisc.richtext.StyleClassedTextArea;

import model.openFile;
import model.saveFile;
import model.checkSyntax;

public class GherkinPresenter {
	    
// FXML Containers for GherkinView
	
		@FXML
	    private AnchorPane MainStage;
		
	    @FXML
	    private GridPane GridPane;
	
// FXML Containers for MenuBar and MenuItems	
		
		@FXML
	    private MenuBar MenuBar;
		
	    @FXML
	    private MenuItem loadFile;		
		
	    @FXML
	    private MenuItem saveContents;
	    
	    @FXML
	    private MenuItem exit;
	    
//FXML Items for GUI-Left
	    
		@FXML
	    private Button loadButton;    

	    @FXML
	    private Button closeButton;
	    
	    @FXML
	    private Button saveButton;
	    
	    @FXML
	    private Button validateButton;

//FXML Items for GUI-Right 		

	    @FXML
	    public StyleClassedTextArea readTextArea;
	    
	    @FXML
	    public static TextArea validationArea;
	   
	    @FXML
	    public void OpenFile(ActionEvent event) {
	    	// Setting the filter to show only text files
	    	FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT Files (*.txt)","*.txt");
	    	
	    	FileChooser filechooser = new FileChooser();
	    	filechooser.getExtensionFilters().add(filter);
	    	filechooser.setTitle("Open File");
	   	
	    	File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
	    	if(file != null){
	    	readTextArea.replaceText(openFile.readFile(file));
	    	}
	    }
	    
	    @FXML
	    public void SaveFile(ActionEvent event) {
	    	FileChooser fileChooser = new FileChooser();
	    	fileChooser.setTitle("Save File");
			File file = fileChooser.showSaveDialog(MainStage.getScene().getWindow());
			if (file != null) {
				saveFile.savetext(readTextArea.getText(), file);
			}
	    }
	    
	    @FXML
	    public void ExitApplication(ActionEvent event) {
			Platform.exit();
			System.exit(0);
			System.out.println("Program has closed successfully");
	    }
	    
	    @FXML
	    public void validateText(ActionEvent event) {
	    	String text = validationArea.getText();
	    	System.out.print(text);
	    }
	    
	    @FXML
	    public void checkSyntax(ActionEvent event){
	    model.checkSyntax check = new model.checkSyntax();
	    	  
	    }
	    
	}
	

