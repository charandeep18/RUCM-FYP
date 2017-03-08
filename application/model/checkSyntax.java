//package model;
//
//import java.util.Collection;
//import java.util.Collections;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//import org.fxmisc.richtext.CodeArea;
//import org.fxmisc.richtext.LineNumberFactory;
//import org.fxmisc.richtext.StyleSpans;
//import org.fxmisc.richtext.StyleSpansBuilder;
//
//public class checkSyntax {
//
//	@SuppressWarnings("unused")
//	public static void checkSyntaxMethod(){
//		
//		//private static 
//		final String[] KEYWORDS = new String[] {
//				"Given", "Then", "And", "But", "Feature", "Scenario", "When", "Background"
//		};
//		
//	    final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
//
//	    final Pattern PATTERN = Pattern.compile(
//	            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
//	    );}
//	    
//		@SuppressWarnings("unused")
//		public static StyleSpans<Collection<String>> computeHighlighting(String text) {
//	        Matcher matcher = PATTERN.matcher(text);
//	        int keywordend = 0;
//	        
//	        StyleSpansBuilder<Collection<String>> spanbuilder = new StyleSpansBuilder<>();
//	        
//	        while(matcher.find()) {
//	            String styleClass = matcher.group("KEYWORD") != null ? "keyword" : null; 
//	            
//	            assert styleClass != null;
//	            spanbuilder.add(Collections.emptyList(), matcher.start() - keywordend);
//	            spanbuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
//	            keywordend = matcher.end();
//	        }
//	        
//	        spanbuilder.add(Collections.emptyList(), text.length() - keywordend);
//	        return spanbuilder.create();
//		
//	}
//
//}
