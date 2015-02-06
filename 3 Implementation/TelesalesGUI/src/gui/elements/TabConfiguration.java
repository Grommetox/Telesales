/**
 * 
 */
package gui.elements;

import javafx.scene.control.Tab;

/**
 * @author rasgarbayli
 *
 */
public class TabConfiguration extends Tab {

	/**
	 * preventing default constructor
	 */
	private TabConfiguration() {
		this("Test Configuration");
	}

	/**
	 * preventing default constructor with different text
	 * @param tabName - String that represents name of the tab.
	 */
	private TabConfiguration(String tabName) {
		super(tabName);
	}

}
