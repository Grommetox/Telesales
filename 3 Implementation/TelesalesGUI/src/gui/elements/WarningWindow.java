package gui.elements;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Shows a warning window. Contains a label to show passed string content and a button to close the window.
 * @author rasgarbayli
 * @version 1.0
 */
public class WarningWindow extends Stage {
	
	/**
	 * Constructor of the class and requires all listed arguments. The arguments must not reference to the null
	 * @param message - Text or content of the error message
	 * @param owner - reference to the main stage of the application (main window)
	 */
	public WarningWindow(String message, Stage owner) {
		
		Insets insets = new Insets(10);
		
		// Dialog pane
		BorderPane root = new BorderPane();
		root.setMinWidth(300);
		root.setMaxWidth(300);
		root.setMinHeight(100);
		root.setMaxHeight(200);
		root.setPadding(insets);
		
		// Message to show
		Label errorMessage = new Label(message);
		root.setCenter(errorMessage);
		
		// Button to close the dialog and exit
		Button close = new Button("Close");
		close.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				WarningWindow.this.close();
			}
		});
		
		// an HBox that centers the close button
		HBox hBox = new HBox();
		hBox.getChildren().add(close);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(insets);
		root.setBottom(hBox);
		
		Scene scene = new Scene(root);
		this.setScene(scene);
		this.setTitle("Error!");
		this.initModality(Modality.WINDOW_MODAL);
	    this.initOwner(owner);
	}

	// Preventing of creation of the warning window without owner
	private WarningWindow(StageStyle arg0) {}
}
