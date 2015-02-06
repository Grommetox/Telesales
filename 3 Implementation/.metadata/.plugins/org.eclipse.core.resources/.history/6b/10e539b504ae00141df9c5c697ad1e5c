package gui.elements;

import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * The tab containing Elements to input login data of the user
 * @author rasgarbayli
 * @version 1.0
 */
public class TabLoginData extends Tab {

	/**
	 * preventing default constructor
	 */
	private TabLoginData() {
		// Always with text Login Data
		super("Login Data");
	}

	/**
	 * preventing default constructor
	 * @param tabName - will not be used.
	 */
	private TabLoginData(String tabName) {
		// Always with text Login Data
		super("Login Data");
	}
	
	public TabLoginData(VBox loginElemenst) {
		// creating a tab with title "Login Data"
		this();
		
		// this will contain elements in the center
		BorderPane content = new BorderPane();
		content.setCenter(loginElemenst);
		
		// tab owns the content
		this.setContent(content);
	}

}
