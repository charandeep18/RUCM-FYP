package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;


import javafx.collections.ObservableList;

import presenter.MainPresenter;

public class SaveFile {

	public static void savetext(String content, File file) {
    	try {
    		FileWriter fileWriter = new FileWriter(file + ".feature");
    		fileWriter.write(content);
    		fileWriter.close();
    		
    	} catch (IOException ex) {
    		Logger.getLogger(
    				SaveFile.class.getName()).log(
    						Level.SEVERE, null, ex);
    	}
		
	}

}

	



