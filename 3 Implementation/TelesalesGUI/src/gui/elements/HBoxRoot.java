package gui.elements;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

/**
 * Contains buttons at the bottom of the application.
 * The 6 buttons (New, Open, Save, Save as, Run the configuration, Exit) are required for construction.
 * The main stage (as owner of the error messages) is also required for construction.
 * @author rasgarbayli
 * @version 1.0
 */
public class HBoxRoot extends HBox {

	/**
	 * Constructor of the class and requires all listed arguments. If one of the arguments is referenced to the null,
	 * than gives an error message and exits with a status 3. (Status 3 is defined for the null reference of the 6 root
	 * buttons)
	 * @param primaryStage - reference to the main stage of the application (main window)
	 * @param create - reference to the button named New on the stage. (new is reserved word, that is why create instead of new)
	 * @param open - reference to the button named Open
	 * @param save - reference to the button named Save
	 * @param saveAs - reference to the button named Save as
	 * @param run - reference to the button named Run the configuration
	 * @param exit - reference to the button named Exit
	 */
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
		
		// Run button in the center
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
