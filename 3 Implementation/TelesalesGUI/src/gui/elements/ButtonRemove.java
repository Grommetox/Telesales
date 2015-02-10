/**
 * 
 */
package gui.elements;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * The button that checks and adds new configuration, if it is possible.
 * @author rasgarbayli
 * @version 1.0
 */
public class ButtonRemove extends Button {
	private Accordion configs;

	/**
	 * prevents default constructor
	 */
	public ButtonRemove() {
		this("Remove");
	}

	/**
	 * prevents default constructor
	 * @param arg0
	 */
	private ButtonRemove(String text) {
		super(text);
	}

	/**
	 * prevents default constructor
	 * @param arg0
	 * @param arg1
	 */
	private ButtonRemove(String arg0, Node arg1) {
		super(arg0, arg1);
	}
	
	/**
	 * Constructs Add button, to add new configurations into the anchor pane
	 * @param configs is the reference to the anchor pane that will be new configuration added.
	 */
	protected ButtonRemove(Accordion configs) {
		this();
		this.configs = configs;
		
		this.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				ButtonRemove.this.checkAndRemove();
			}
		});
	}
	
	// checks and removes titled pane or configuration from the accordion
	private void checkAndRemove() {
		// TODO: implement check and add method
	}

}
