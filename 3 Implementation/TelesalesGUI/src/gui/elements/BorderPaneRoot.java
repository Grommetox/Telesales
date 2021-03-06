package gui.elements;

import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Root element of the main stage. Contains a TabPaneRoot and HBoxRoot.
 * See descriptions of the TabpaneRoot and HBoxRoot. The main stage (as
 * owner of the error messages) is also required for construction.
 * @author rasgarbayli
 * @version 1.0
 */
public class BorderPaneRoot extends BorderPane {
	
	TabPaneRoot tabPaneRoot; // Container of the content
	HBoxRoot hBoxRoot; // Container of the buttons at the bottom
	
	/**
	 * Constructor of the class and requires all listed arguments. If one of the arguments is referenced to the null,
	 * than gives an error message and exits with a status 1 or 2. (Status 1 is defined for the null reference of the tabPaneRoot
	 * and Status 2 is defined for the null reference of the HBoxRoot)
	 * @param tabPaneRoot - reference to the tabPaneRoot of the main stage.
	 * @param hBoxRoot - reference to the HBoxRoot, that contains buttons New .. Exit at the bottom.
	 * @param owner - reference to the main stage of the application (main window)
	 */
	public BorderPaneRoot(TabPaneRoot tabPaneRoot, HBoxRoot hBoxRoot, Stage owner) {
		super();
		
		// tabPaneRoot must not be null
		if (tabPaneRoot == null) {
			WarningWindow tabPaneError = new WarningWindow("TabPane is null!", owner);
			tabPaneError.showAndWait();
			System.exit(1);
		}
		
		// HBoxRoot must not be null
		if (hBoxRoot == null) {
			WarningWindow tabPaneError = new WarningWindow("HBox is null!", owner);
			tabPaneError.showAndWait();
			System.exit(2);
		}
			
		// Everything is okay now
		this.tabPaneRoot = tabPaneRoot;
		this.hBoxRoot = hBoxRoot;
		this.setPadding(new Insets(10));
		this.setMinSize(980, 720);
		this.setPrefSize(980, 720);
		this.setCenter(tabPaneRoot);
		this.setBottom(hBoxRoot);
	}
}
