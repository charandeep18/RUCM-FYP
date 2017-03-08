package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import presenter.GherkinPresenter;

import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.StyleSpans;
import org.fxmisc.richtext.StyleSpansBuilder;


public class JavaFXSplitPane extends Application {

	//Split Pane
	private SplitPane splitpane = new SplitPane();
	final StackPane left = new StackPane();
	private StackPane right = new StackPane();
	
	static public Stage menuStage = new Stage();
	
	//Left Side of Pane
	private CodeArea codearea = new CodeArea();
	
	//Right Side of Pane
	private TextArea textarea = new TextArea();

	//CodeArea Code
	
	 private static final String[] KEYWORDS = new String[] {
				"Given", "Then", "And", "But", "Feature", "Scenario", "When", "Background"
	    };

	    private static final String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";

	    private static final Pattern PATTERN = Pattern.compile("(?<KEYWORD>" + KEYWORD_PATTERN + ")"
	    );
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		codearea.setParagraphGraphicFactory(LineNumberFactory.get(codearea));
        codearea.richChanges()
        .filter(ch -> !ch.getInserted().equals(ch.getRemoved())) // XXX
        .subscribe(change -> {
            codearea.setStyleSpans(0, computeHighlighting(codearea.getText()));
        });

		left.getChildren().add(codearea);
		right.getChildren().add(textarea);
		splitpane.getItems().addAll(left,right);
		splitpane.setDividerPositions(0.3f, 0.6f, 0.9f);
			
		Scene scene = new Scene(splitpane, 500, 400);
		scene.getStylesheets().add(JavaFXSplitPane.class.getResource("GherkinView.css").toExternalForm());
		primaryStage.setScene(scene);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher patternmatcher = PATTERN.matcher(text);
        int keywordend = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
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
		
	
		

