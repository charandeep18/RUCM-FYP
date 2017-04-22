
package presenter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.attribute.standard.DialogTypeSelection;

import java.util.Collection;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Console;
import model.OpenFile;
import model.SaveFile;

import org.fxmisc.richtext.CodeArea;


public class MainPresenter {

    @FXML
    private BorderPane MainStage;

    @FXML
    private MenuBar MenuBar;

    @FXML
    private Menu menuFile;

    @FXML
    private MenuItem saveContents;

    @FXML
    private MenuItem loadFile;

    @FXML
    private MenuItem exit;

    @FXML
    private Menu menuView;

    @FXML
    private Menu menuRunOptions;

    @FXML
    private Menu menuHelp;

    @FXML
    private MenuItem helpMenuItem;

    @FXML
    private GridPane GridPane;

    @FXML
    private Button newButton;
    
    @FXML
    private Button saveButton;

    @FXML
    private Button loadButton;

    @FXML
    private Button createStepDefsButton;

    @FXML
    private Button closeButton;

    @FXML
    private Button seleniumViewButton;

    @FXML
    private Button validateButton;

    @FXML
    private Label nameLabel;

    @FXML 
    private CodeArea code;

    @FXML
    private TextArea console;
    
 // Non FXML Items
    
 // Creation of a new PrintStream object   
    private PrintStream ps;
    
 // Buttons used for the exit application java alert box    
    private ButtonType saveAlertButton = new ButtonType ("Save");
    private ButtonType closeAlertButton = new ButtonType ("Do Not Save");
    private ButtonType cancelAlertButton = new ButtonType ("Cancel");

 // Buttons used for the new test case alert box
    private ButtonType yesAlertButton = new ButtonType ("Yes");
    private ButtonType noAlertButton = new ButtonType ("No");
    
    
    public void initialize(URL location, ResourceBundle resources) {
    	ps = new PrintStream(new Console(console));
	}
    
    @FXML
    public void ActivateConsole(ActionEvent event) {
        //System.setOut(ps);
        System.setErr(ps);
        System.out.println("Hello World");        
        String [] textarray = code.getText().split("\\n");  
        System.out.println(textarray);    
    }

    @FXML
    public void ExitApplication(ActionEvent event) {
    	Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }

    @FXML
   
    public void OpenCloseAlert(ActionEvent event){
    Alert alert = new Alert(AlertType.WARNING);
    alert.initStyle(StageStyle.DECORATED);
    alert.setTitle("Exit Application");
    alert.setHeaderText("Are you sure you want to exit this application?");
    alert.setContentText("Any unsaved progress will be deleted.");
    
    alert.getButtonTypes().setAll(saveAlertButton, closeAlertButton, cancelAlertButton);
    
    Optional<ButtonType> result  = alert.showAndWait();
    if (result.get() == saveAlertButton){
    	SaveFile(event);
    } else if (result.get() == closeAlertButton) {
    	ExitApplication(event);
    } else if (result.get() == cancelAlertButton) {
    	alert.close();
    }
    
    }
    
    @FXML
    public void OpenFile(ActionEvent event) {
    	// Setting the filter to show only feature files
    	FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Feature Files (*.feature)","*.feature");
    	FileChooser filechooser = new FileChooser();
    	filechooser.getExtensionFilters().add(filter);
    	filechooser.setTitle("Open File");
   	
    	File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
    	if(file != null){
    	code.replaceText(OpenFile.readFile(file));
    }
    }
    @FXML
    public void OpenHelp(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/HelpView.fxml"));
			Parent parent1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Help Guide");
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.initStyle(StageStyle.DECORATED);
			stage.setScene(new Scene(parent1));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }

    @FXML
    public void SaveFile(ActionEvent event) {
    	FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Feature Files (*.feature)","*.feature");
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.getExtensionFilters().add(filter);
    	fileChooser.setTitle("Save File");
		File file = fileChooser.showSaveDialog(MainStage.getScene().getWindow());
		if (file != null) {
			SaveFile.savetext(code.getText(), file);
		}
    }
    
    @FXML
    public void newFile(){
        Alert alert = new Alert(AlertType.WARNING);
        alert.initStyle(StageStyle.DECORATED);
        alert.setTitle("New Feature File");
        alert.setHeaderText("Are you sure you want to create a new feature file?");
        alert.setContentText("Any unsaved progress will be deleted.");
        
        alert.getButtonTypes().setAll(yesAlertButton, noAlertButton);
        
        Optional<ButtonType> result  = alert.showAndWait();
        if (result.get() == yesAlertButton){
        	code.getText();
        	code.replaceText("");
        } else if (result.get() == noAlertButton) {
        	alert.close();
        }
    }



	public CodeArea getText() {
		return code;
	}
	
}