package gui.elements;

import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;

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
		this("Login Data");
	}

	/**
	 * preventing default constructor
	 * @param tabName - String that represents name of the tab.
	 */
	private TabLoginData(String tabName) {
		super(tabName);
	}
	
	public TabLoginData(VBoxLogin loginElemenst) {
		// creating a tab with title "Login Data"
		this();
		
		// this will contain elements in the center
		BorderPane content = new BorderPane();
		content.setCenter(loginElemenst);
		
		// tab owns the content
		this.setContent(content);
	}

}
