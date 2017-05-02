package view;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CodeAreaExample extends Application {

	@FXML
	private CodeArea leftCode = new CodeArea();
	

	
	//CodeArea -  defining the areas for coloured text:
	 private static final String[] KEYWORDS = new String[] {
				"Given", "Then", "And", "But", "Feature", "Scenario", "When", "Background", "Scenario Outline", "Examples"
	 };
	 
	 private static final String KEYWORD_PATTERNS = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
	 private static final String SEMICOLON = "\\;";
	 private static final String STRING = "\"([^\"\\\\]|\\\\.)*\"";
	 private static final String BRACKET =  "\\[|\\]";
	 private static final String PARENTHESIS = "\\(|\\)";
	
	 
	 //CodeArea - Defining the pattern used for the Keywords using Regex commands:
	 
	 //CodeArea - Compiling the pattern using the Java Regex Pattern class:
	 private static final Pattern PATTERN = Pattern.compile(
			   "(?<KEYWORD>" + KEYWORD_PATTERNS + ")"
			 + "|(?<SEMICOLON>" + SEMICOLON + ")"
			 + "|(?<STRING>" + STRING + ")"
			 + "|(?<BRACKET>" + BRACKET + ")"
			 + "|(?<PARENTHESIS>" + PARENTHESIS + ")"
			 );

	public static void main(String[] args) {
		launch(args);
	}
	
    private static StyleSpans<Collection<String>> Highlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
        
        int end = 0;
        while(matcher.find()) {
            String styleClass = 
            matcher.group("KEYWORD") != null ? "keyword" :
            matcher.group("SEMICOLON") != null ? "semicolon" : 
            matcher.group("STRING") != null ? "string" : 
            matcher.group("BRACKET")!= null ? "bracket" : 
            matcher.group("PARENTHESIS")!= null ? "parenthesis" :
            null;
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - end);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            end = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - end);
        return spansBuilder.create();
    }
	
		public void start(Stage primaryStage) throws Exception {
		leftCode.setParagraphGraphicFactory(LineNumberFactory.get(leftCode));
        leftCode.richChanges().filter(ch -> !ch.getInserted().equals(ch.getRemoved())).subscribe(change -> {
        leftCode.setStyleSpans(0, Highlighting(leftCode.getText()));
        });
		
		Scene scene = new Scene(leftCode, 500, 400);
		scene.getStylesheets().add(CodeAreaExample.class.getResource("MainGUI.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
