/**
 * 
 */
package gui.elements;

import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

/**
 * @author rasgarbayli
 *
 */
public class ScrollPaneConfig extends ScrollPane {
	private Accordion configurations;
	/**
	 * constructs a scroll pane with accordion in it.
	 */
	public ScrollPaneConfig() {
		super();
		configurations = new Accordion();
		this.setContent(configurations);
		this.setFitToWidth(true);
	}

	/**
	 * prevents default constructor
	 * @param arg0
	 */
	private ScrollPaneConfig(Node arg0) {
		super(arg0);
	}

	/**
	 * @return the configurations
	 */
	public Accordion getConfigurations() {
		return configurations;
	}

}
