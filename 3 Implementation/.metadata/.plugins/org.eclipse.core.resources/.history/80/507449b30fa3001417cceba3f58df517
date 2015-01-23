package gui.elements;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxRoot extends HBox {

	public HBoxRoot(Stage primaryStage, Button create, Button open, Button save, Button saveAs, Button run, Button exit) {
		super();
		
		// Buttons must not be null
		Button[] buttons = new Button[6];
		buttons[0] = create;
		buttons[1] = open;
		buttons[2] = save;
		buttons[3] = saveAs;
		buttons[4] = run;
		buttons[5] = exit;
		
		for (Button button : buttons) {
			if (button == null) {
				WarningWindow tabPaneError = new WarningWindow("One or more of the buttons in HBoxRoot is null!", primaryStage);
				tabPaneError.showAndWait();
				System.exit(3);
			}
		}
		
		
	}

}
