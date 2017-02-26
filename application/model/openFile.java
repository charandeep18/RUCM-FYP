package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class openFile {

    public static String readFile(File file){
    	//Brings in the BufferedReader IO Library from Java
    	BufferedReader bufferedReader = null;
    	//Brings in the StringBuilder Library from Java
    	StringBuilder stringBuffer = new StringBuilder();
    	
    	try {
    		bufferedReader = new BufferedReader(new FileReader(file));
    		String inputtext;
    		while((inputtext = bufferedReader.readLine()) !=null){
    			stringBuffer.append(inputtext);
    		}
    	} catch (FileNotFoundException fileexception) {
    		Logger.getLogger(
    				presenter.GherkinPresenter.class.getName()).log(Level.SEVERE, null, fileexception);
    	} catch (IOException inputexception) {
    		Logger.getLogger(
    				presenter.GherkinPresenter.class.getName()).log(Level.SEVERE, null, inputexception);
    	} finally {
    		try {
    			bufferedReader.close();
    		} catch (IOException inputexception) {
        		Logger.getLogger(
        			presenter.GherkinPresenter.class.getName()).log(Level.SEVERE, null, inputexception);
    		}
    	}    	
    	return stringBuffer.toString();
    }
	
}
