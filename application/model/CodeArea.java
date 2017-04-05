package model;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.LeftTextArea;

public class CodeArea  {
	
private CodeArea leftCode;	

private static final String[] KEYWORDS = new String[] {
		"Given", "Then", "And", "But", "Feature", "Scenario", "When", "Background"
};

private static final String KEYWORD_PATTERNS = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
private static final String SEMICOLON = "\\;";
private static final String STRING = "\"([^\"\\\\]|\\\\.)*\"";
private static final String BRACKET =  "\\[|\\]";
private static final String PARENTHESIS = "\\(|\\)";


private static final Pattern PATTERN = Pattern.compile(
		   "(?<KEYWORD>" + KEYWORD_PATTERNS + ")"
		 + "|(?<SEMICOLON>" + SEMICOLON + ")"
		 + "|(?<STRING>" + STRING + ")"
		 + "|(?<BRACKET>" + BRACKET + ")"
		 + "|(?<PARENTHESIS>" + PARENTHESIS + ")"
		 );


private static StyleSpans<Collection<String>> computeHighlighting(String text) {
    Matcher patternmatcher = PATTERN.matcher(text);
    StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
    
    int keywordend = 0;
    
    while(patternmatcher.find()) {
        String styleClass = 
        patternmatcher.group("KEYWORD") != null ? "keyword" :
        patternmatcher.group("SEMICOLON") != null ? "semicolon" : 
        patternmatcher.group("STRING") != null ? "string" : 
        patternmatcher.group("BRACKET")!= null ? "bracket" : 
        patternmatcher.group("PARENTHESIS")!= null ? "parenthesis" :
        null;
        assert styleClass != null;
        spansBuilder.add(Collections.emptyList(), patternmatcher.start() - keywordend);
        spansBuilder.add(Collections.singleton(styleClass), patternmatcher.end() - patternmatcher.start());
        keywordend = patternmatcher.end();
    }
    spansBuilder.add(Collections.emptyList(), text.length() - keywordend);
    return spansBuilder.create();
}




}
