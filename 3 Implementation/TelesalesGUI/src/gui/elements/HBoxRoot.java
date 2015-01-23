package gui.elements;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxRoot extends HBox {

	public HBoxRoot(Stage primaryStage, Button create, Button open, Button save, Button saveAs, Button run, Button exit) {
		super();
		
		// Buttons must not be null
		if (create == null) {
			WarningWindow tabPaneError = new WarningWindow("Button New is null referenced!", primaryStage);
			tabPaneError.showAndWait();
			System.exit(3);
		}
		if (open == null) {
			WarningWindow tabPaneError = new WarningWindow("Button Open is null referenced!", primaryStage);
			tabPaneError.showAndWait();
			System.exit(3);
		}
		if (save == null) {
			WarningWindow tabPaneError = new WarningWindow("Button Save is null referenced!", primaryStage);
			tabPaneError.showAndWait();
			System.exit(3);
		}
		if (saveAs == null) {
			WarningWindow tabPaneError = new WarningWindow("Button Save as is null referenced!", primaryStage);
			tabPaneError.showAndWait();
			System.exit(3);
		}
		if (run == null) {
			WarningWindow tabPaneError = new WarningWindow("Button Run the configuration is null referenced!", primaryStage);
			tabPaneError.showAndWait();
			System.exit(3);
		}
		if (exit == null) {
			WarningWindow tabPaneError = new WarningWindow("Button Exit is null referenced!", primaryStage);
			tabPaneError.showAndWait();
			System.exit(3);
		}
		
		// All buttons are now ready to be placed on the HBoxRoot
		this.setPadding(new Insets(5));
		this.setSpacing(5);
		
		this.getChildren().add(create);
		this.getChildren().add(open);
		this.getChildren().add(save);
		this.getChildren().add(saveAs);
		
		// run button in the center
		HBox runHBox = new HBox();
		HBox.setHgrow(runHBox, Priority.ALWAYS);
		runHBox.setAlignment(Pos.CENTER);
		runHBox.getChildren().add(run);
		
		this.getChildren().add(runHBox);
		
		// Exit button at the right
		HBox exitHBox = new HBox();
		HBox.setHgrow(exitHBox, Priority.ALWAYS);
		exitHBox.setAlignment(Pos.CENTER_RIGHT);
		exitHBox.getChildren().add(exit);
		
		this.getChildren().add(exitHBox);
	}

}
