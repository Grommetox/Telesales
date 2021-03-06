/**
 * 
 */
package gui.elements;

import javafx.scene.control.Accordion;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

/**
 * @author rasgarbayli
 *
 */
public class TabConfiguration extends Tab {
	private Accordion configurations;
	
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
	
	public TabConfiguration(ScrollPaneConfig spConfig, HBoxAddRemove hbAddRemove) {
		this();
		VBox content = new VBox();
		content.getChildren().add(spConfig);
		content.getChildren().add(hbAddRemove);
		this.setContent(content);
		
		this.configurations = spConfig.getConfigurations();
	}

	/**
	 * @return the configurations
	 */
	public Accordion getConfigurations() {
		return configurations;
	}

}
