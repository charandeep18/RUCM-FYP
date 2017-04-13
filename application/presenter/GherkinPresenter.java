package presenter;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collection;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.RichTextChange;
import org.fxmisc.richtext.StyleClassedTextArea;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;

import model.Console;
import model.openFile;
import model.saveFile;
//import model.checkSyntax;

public class GherkinPresenter implements Initializable {
	    
// FXML Containers for GherkinView
	
		@FXML
	    private BorderPane MainStage;
		
	    @FXML
	    private GridPane GridPane;
	
// FXML Containers for MenuBar and MenuItems	
		
		@FXML
	    private MenuBar MenuBar;
		
		@FXML
		private Menu menuFile;
		
	    @FXML
	    private MenuItem loadFile;		
		
	    @FXML
	    private MenuItem saveContents;
	    
	    @FXML
	    private MenuItem exit;
		
	    @FXML
		private Menu menuView;
		
		@FXML
		private Menu menuRunOptions;
		
		@FXML
		private Menu menuHelp;
		
		@FXML
		private MenuItem menuHelpItem;
		
//FXML Items for GUI-Left
	    
		@FXML
	    private Button loadButton;    

	    @FXML
	    private Button closeButton;
	    
	    @FXML
	    private Button saveButton;
	    
	    @FXML
	    private Button validateButton;
	    
	    @FXML
	    private Button seleniumViewButton;
	    
	    @FXML
	    private Button createStepDefsButton;
	    
	    @FXML
	    private Label nameLabel;
	    
//FXML Items for Main Body of the GUI	

	    @FXML
	    private TextArea code;


	   
//FXML Items for GUI-Right - Current Code;
	    
	    @FXML
	    private AnchorPane codeArea;
	    
        @FXML
	    public TextArea readTextArea;
	    
	    @FXML
	    private AnchorPane consoleArea;
	    
	    @FXML
	    private TextArea console;
	    
// Non FXML Items
	    private PrintStream ps;
	    
	    @FXML
	    public void OpenFile(ActionEvent event) {
	    	// Setting the filter to show only text files
	    //	FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT Files (*.txt)","*.txt");
	    	
	    	FileChooser filechooser = new FileChooser();
	    	//filechooser.getExtensionFilters().add(filter);
	    	filechooser.setTitle("Open File");
	   	
	    	File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
	    	if(file != null){
	    	code.setText(openFile.readFile(file));
	    	}
	    }
	    
	    @FXML
	    public void SaveFile(ActionEvent event) {
	    	FileChooser fileChooser = new FileChooser();
	    	fileChooser.setTitle("Save File");
			File file = fileChooser.showSaveDialog(MainStage.getScene().getWindow());
			if (file != null) {
				saveFile.savetext(code.getText(), file);
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
	    	String text = readTextArea.getText();
	    	text.toString();
	    	System.out.print(text);
	    }
	    
	    @FXML
	    public void checkSyntax(ActionEvent event){
//			readTextArea.setParagraphGraphicFactory(LineNumberFactory.get(readTextArea));
//			readTextArea.richChanges().filter(ch -> !ch.getInserted().equals(ch.getRemoved()))
//			.subscribe(change -> {
//	        //    readTextArea.setStyleSpans(0, checkSyntax.computeHighlighting(readTextArea.getText()));
	///		});
	    }

		@FXML
	    public void OpenHelp(ActionEvent event){
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
		public void ActivateConsole(ActionEvent event) {
	        System.setOut(ps);
	        System.setErr(ps);
	      //  System.out.println("Hello World");
	        
	    String [] textarray = code.getText().split("\\n");  
	    System.out.println(textarray);    
	        
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			ps = new PrintStream(new Console(console));
		}
		
		
		
	    
	}
	

