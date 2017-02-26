package model;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;

public class checkSyntax {

	public static void checkSyntaxMethod(){
		
		//private static 
		final String[] KEYWORDS = new String[] {
				"Given, Then, And, But, Feature, Scenario, When, Background"
		};
		
	    final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";

	    final Pattern PATTERN = Pattern.compile(
	            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
	    );}
	    
	    private static StyleSpans<Collection<String>> computeHighlighting(String text, Pattern PATTERN) {
	        Matcher matcher = PATTERN.matcher(text);
	        int lastKwEnd = 0;
	        
	        StyleSpansBuilder<Collection<String>> spansBuilder
	                = new StyleSpansBuilder<>();
	        
	        while(matcher.find()) {
	            String styleClass =
	                    matcher.group("KEYWORD") != null ? "keyword" :
	                    null; 
	            		
	            assert styleClass != null;
	            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
	            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
	            lastKwEnd = matcher.end();
	        }
	        
	        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
	        return spansBuilder.create();
		
	}

}
