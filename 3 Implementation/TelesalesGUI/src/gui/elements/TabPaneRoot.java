package gui.elements;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;

/**
 * Root element of the 2 Tabs that represents 2 section:
 * 1. Test Configuration - to input information to generate XML-File
 * 2. Login Data - to input login information of the user
 * @author rasgarbayli
 * @version 1.0
 */
public class TabPaneRoot extends TabPane {

	/**
	 * Constructor of the class and requires all listed arguments. If one of the arguments is referenced to the null,
	 * than gives an error message and exits with a status 4, 5 or 6.
	 * Status 4 is defined for the null reference of the Tab1 - Test Configuration
	 * Status 5 is defined for the null reference of the Tab2 - Login Data
	 * Status 6 is defined for the null reference of the HBox, that contains Add and Remove buttons
	 * @param config - reference to the Tab, that contains elements to input Test Configuration
	 * @param login - reference to the Tab, that contains elements to input Login Data
	 * @param buttons - reference to the container of the Add/Remove buttons
	 */
	public TabPaneRoot(Tab config, Tab login, HBox buttons) {
		super();
		
	}

}
