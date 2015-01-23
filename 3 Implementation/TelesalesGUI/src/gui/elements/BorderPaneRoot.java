package gui.elements;

import javafx.geometry.Insets;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneRoot extends BorderPane {
	TabPane tabPane;
	HBox hBox;
	
	public BorderPaneRoot(TabPane tabPane, HBox hBox, Stage owner) {
		super();
		
		// tabPane must not be null
		if (tabPane == null) {
			WarningWindow tabPaneError = new WarningWindow("TabPane is null!", owner);
			tabPaneError.showAndWait();
			System.exit(1);
		}
		
		// HBox must not be null
		if (hBox == null) {
			WarningWindow tabPaneError = new WarningWindow("HBox is null!", owner);
			tabPaneError.showAndWait();
			System.exit(2);
		}
			
		// Everything is okay now
		this.tabPane = tabPane;
		this.hBox = hBox;
		this.setPadding(new Insets(10));
		this.setMinSize(980, 720);
		this.setPrefSize(980, 720);
		this.setCenter(tabPane);
		this.setBottom(hBox);
	}
}
