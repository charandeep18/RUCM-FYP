package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveFile {

	public static void saveText(String content, File file) {
    	try {
    		
    		// Saves the file with a .feature annotation to dictate the file type. 
    		FileWriter fileWriter = new FileWriter(file);
    		fileWriter.write(content);
    		//Closes the fileWriter after the code has been written.
    		fileWriter.close();
    		
    	} catch (IOException ex) {
    		Logger.getLogger(
    				SaveFile.class.getName()).log(
    						Level.SEVERE, null, ex);
    	}
		
	}

}

	



