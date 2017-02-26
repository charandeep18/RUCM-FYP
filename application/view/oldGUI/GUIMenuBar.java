package view.oldGUI;



import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

public class GUIMenuBar extends Application{
	
	//Main Pane and Menu Stage
	static HBox mainmenuPane = new HBox();
	static public Stage menuStage = new Stage();
	
	//MenuBar
	private MenuBar menuBar = new MenuBar();
	
	//FileChooser and FileWriter
	private Desktop desktop = Desktop.getDesktop();
	private final FileChooser fileChooser = new FileChooser();
//	private FileWriter filerWriter = new FileWriter();
	
	//fileMenu and fileMenu Items
	private Menu fileMenu = new Menu("File");
	private MenuItem open = new MenuItem("Open text file");
	private MenuItem save = new MenuItem("Save text file");
	private MenuItem close = new MenuItem("Close Program");

	
	//viewMenu and viewMenu Items
	private Menu viewMenu = new Menu("View");
	private MenuItem gherkinRUCM = new MenuItem("Gherkin/RUCM");
	private MenuItem selenium = new MenuItem("Selenium");
	
	//runMenu and runMenu Items
	private Menu runMenu = new Menu("Run Options");
	private MenuItem chrome = new MenuItem("Open Chrome");
	private MenuItem firefox = new MenuItem("Open FireFox");
	
	//helpMenu
	private Menu helpMenu = new Menu("Help");
	private MenuItem about = new MenuItem("About");
	private MenuItem guide = new MenuItem("Guide");
	
	public static void main(String[] args) {
		launch(args);
	}	
	
	@Override
	public void start(Stage menuStage) throws Exception {
	fileMenu.getItems().addAll(open,save,close);
	close.setOnAction(e -> SharedMethods.closeProgram());
	open.setOnAction(e -> {
        File file = fileChooser.showOpenDialog(menuStage);
        fileChooser.setTitle("Open Gherkin File");
        if (file != null) {
            openFile(file);
        }
	});
	save.setOnAction(e -> {
		File file = fileChooser.showSaveDialog(menuStage);
		fileChooser.setTitle("Save Gherkin File");
		if (file != null) {
			saveFile(file,"");
		}
	});
	viewMenu.getItems().addAll(gherkinRUCM,selenium);
	runMenu.getItems().addAll(chrome,firefox);
	helpMenu.getItems().addAll(about,guide);
	about.setOnAction(e-> {
		GUIAbout.display("About this software", "About this software");
	});
	guide.setOnAction(e-> {
		GUIHelp.display("Help using this software", "Help Using this software");
	});
	menuBar.getMenus().addAll(fileMenu,viewMenu,runMenu,helpMenu);
	

	mainmenuPane.getChildren().add(menuBar);	
	Scene scene = new Scene(mainmenuPane, 500, 400);
	
	menuStage.setScene(scene);
	menuStage.show();
	}
	
    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
                GUIMenuBar.class.getName()).log(
                    Level.SEVERE, null, ex
                );
        }
    }
    
    private void saveFile(File file, String content) {
    	try {
    		FileWriter fileWriter = null;
    		fileWriter = new FileWriter(file);
    		fileWriter.write(content);
    		fileWriter.close();
    	} catch (IOException ex) {
    		Logger.getLogger(
    				GUIMenuBar.class.getName()).log(
    						Level.SEVERE, null, ex);
    	}
    }
    
//    private void closeProgram(){
//		Platform.exit();
//		System.exit(0);
//		System.out.println("Program has closed successfully");
//    }
}