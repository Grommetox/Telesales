/**
 * 
 */
package gui.elements;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

/**
 * @author rasgarbayli
 *
 */
public class ScrollPaneConfig extends ScrollPane {
	private AnchorPane configurations;
	/**
	 * 
	 */
	public ScrollPaneConfig() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public ScrollPaneConfig(Node arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the configurations
	 */
	public AnchorPane getConfigurations() {
		return configurations;
	}

}
