
package presenter;


import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

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
import javafx.scene.control.Separator;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.CloseApplication;
import model.Console;
import model.OpenFile;
import model.SaveFile;
import org.fxmisc.richtext.CodeArea;

public class MainPresenter implements Initializable {

	@FXML
	private BorderPane MainStage;

	// Java code for the FXML Menu and MenuBar Items
	@FXML
	private MenuBar MenuBar;

	@FXML
	private Menu menuFile;

	@FXML
	private MenuItem newFile;
	
	@FXML
	private MenuItem saveContents;

	@FXML
	private MenuItem loadFile;

	@FXML
	private MenuItem exit;

	@FXML
	private Menu menuView;
	
	@FXML
	private Menu runOptions;

	@FXML
	private Menu menuHelp;

	@FXML
	private MenuItem helpMenuItem;

	// FXML for the Left Panel of the GUI
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
	private Label nameLabel;
	
	@FXML
	private Separator leftSeperator;
	
	@FXML
	private Separator centerSeperator;
	
	@FXML
	private Separator rightSeperator;

	// FXML for the CodeArea Panel and the Console Panel
	@FXML
	private CodeArea code;

	@FXML
	private TextArea console;
	
	@FXML
	private SplitPane splitPane;

	// Non FXML Items
	// Creation of a new PrintStream object
	private PrintStream ps;
	
	// As the implementation of the project has not been fully realised, the exampleDefinitons file has been created to mimic the output

	private String exampleDefinitions = String.join("\n"
		, ")@Given(^user navigates to Website$)"
		, "public void user_navigates_to_Website() {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
		, "@Then(^they fill out the contact Name$)"
		, "public void they_fill_out_the_contact_Name() {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
		, "@Then(^ticks UOR check$)"
		, "public void ticks_UOR_check() {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
		, "@Then(^enters company as 'FoobarCorporation'$)"
		, "public void enters_company_as(String arg1) {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
		, "@Then(^enters Reigion as 'Birmingham'$)"
		, "public void enters_Reigion_as(String arg1) {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
		, "@Then(^clicks on Navigation One$)"
		, "public void clicks_on_Navigation_One() {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
		, "@Then(^checks to see if on Navigation One page$)"
		, "public void checks_to_see_if_on_Navigation_One_page() {"
		, "// Express the Regexp above with the code you wish you had"
		, "throw new PendingException();"
		, "}"
		, ""
);
	
	// Buttons used for the exit application java alert box
	private ButtonType saveAlertButton = new ButtonType("Save");
	private ButtonType closeAlertButton = new ButtonType("Do Not Save");
	private ButtonType cancelAlertButton = new ButtonType("Cancel");

	// Buttons used for the new test case alert box
	private ButtonType yesAlertButton = new ButtonType("Yes");
	private ButtonType noAlertButton = new ButtonType("No");

	//This method opens an alert box which is a new feature for JavaFX since JavaFX 8u40 - It implements the use of alert boxes
	@FXML
	public void openCloseAlert(ActionEvent event) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("Exit Application");
		alert.setHeaderText("Are you sure you want to exit this application?");
		alert.setContentText("Any unsaved progress will be deleted.");

		alert.getButtonTypes().setAll(saveAlertButton, closeAlertButton, cancelAlertButton);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == saveAlertButton) {
			saveFile(event);
		} else if (result.get() == closeAlertButton) {
			CloseApplication.ExitApplication(event);
		} else if (result.get() == cancelAlertButton) {
			alert.close();
		}

	}

	@FXML
	public void openFile(ActionEvent event) {
		// Setting the filter to show only feature files.
		FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Feature Files (*.feature)", "*.feature");
		FileChooser filechooser = new FileChooser();
		filechooser.getExtensionFilters().add(filter);
		filechooser.setTitle("Open File");
		File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
		if (file != null) {
			code.replaceText(OpenFile.readFile(file));
		}
	}

	@FXML
	public void openHelp(ActionEvent event) {
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
	public void saveFile(ActionEvent event) {
		//Specifies that the only file extensions that can be chosen are .feauture file extensions
		FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Feature Files (*.feature)", "*.feature");
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().add(filter);
		fileChooser.setTitle("Save File");
		File file = fileChooser.showSaveDialog(MainStage.getScene().getWindow());
		if (file != null) {
			//Calls the saveText method for the text displayed in the CodeArea
			SaveFile.saveText(code.getText(), file);
		}
	}

	@FXML
	public void newFile() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.initStyle(StageStyle.DECORATED);
		alert.setTitle("New Feature File");
		alert.setHeaderText("Are you sure you want to create a new feature file?");
		alert.setContentText("Any unsaved progress will be deleted.");

		alert.getButtonTypes().setAll(yesAlertButton, noAlertButton);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == yesAlertButton) {
			code.getText();
			code.replaceText("");
		} else if (result.get() == noAlertButton) {
			alert.close();
		}
	}

	// This initialize method is used to load FXML components after the initial loading of the FXML components above. This initialize method loads in the console from the external class in the model package
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ps = new PrintStream(new Console(console));
	}

	
	@FXML
	public void activateConsole(ActionEvent event) {
		System.setOut(ps);
		System.setErr(ps);
		System.out.println(exampleDefinitions);
		// Starting the implementation of
		String[] textarray = code.getText().split("\\n");
		//System.out.println(textarray);
	}
	
	public CodeArea getText() {
		return code;
	}

}