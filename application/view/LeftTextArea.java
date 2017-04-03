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
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class LeftTextArea extends Application {

	private CodeArea leftCode = new CodeArea();
	
	//CodeArea -  defining the areas for coloured text:
	 private static final String[] KEYWORDS = new String[] {
				"Given", "Then", "And", "But", "Feature", "Scenario", "When", "Background"
	 };
	 
	 private static final String[] SEMICOLON = new String[] {
			 "\\;"
	 };

	 private static final String[] STRING = new String[] {
			 "\"([^\"\\\\]|\\\\.)*\""
	 };
	 
	 private static final String[] BRACKET = new String [] {
			 "\\[|\\]"
	 };
	 
	 private static final String[] PARENTHESIS = new String [] {
			 "\\[|\\]"
	 };
	 
	 
	 //CodeArea - Defining the pattern used for the Keywords using Regex commands:
	 private static final String KEYWORD_PATTERNS = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
	 
	 //CodeArea - Compiling the pattern using the Java Regex Pattern class:
	 private static final Pattern PATTERN = Pattern.compile(
			   "(?<KEYWORD>" + KEYWORD_PATTERNS + ")"
			 + "|(?,SEMICOLON>" + SEMICOLON + ")"
			 + "|(?,STRING>" + STRING + ")"
			 + "|(?,BRACKET>" + BRACKET + ")"
			 + "|(?,PARENTHESIS" + PARENTHESIS + ")"
			 );
	 
	@Override
	public void start(Stage primaryStage) throws Exception {
		leftCode.setParagraphGraphicFactory(LineNumberFactory.get(leftCode));
        leftCode.richChanges().filter(ch -> !ch.getInserted().equals(ch.getRemoved())).subscribe(change -> {
            leftCode.setStyleSpans(0, computeHighlighting(leftCode.getText()));
        });
		
		Scene scene = new Scene(leftCode, 500, 400);
		scene.getStylesheets().add(LeftTextArea.class.getResource("GherkinView.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher patternmatcher = PATTERN.matcher(text);
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
        
        int keywordend = 0;
        
        while(patternmatcher.find()) {
            String styleClass = 
            patternmatcher.group("KEYWORD") != null ? "keyword" : null;
            
            
            assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), patternmatcher.start() - keywordend);
            spansBuilder.add(Collections.singleton(styleClass), patternmatcher.end() - patternmatcher.start());
            keywordend = patternmatcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - keywordend);
        return spansBuilder.create();
    }
	
	
}
