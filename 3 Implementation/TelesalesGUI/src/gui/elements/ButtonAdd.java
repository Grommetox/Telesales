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
public class ButtonAdd extends Button {
	private Accordion configs;

	/**
	 * prevents default constructor
	 */
	public ButtonAdd() {
		this("Add");
	}

	/**
	 * prevents default constructor
	 * @param arg0
	 */
	private ButtonAdd(String text) {
		super(text);
	}

	/**
	 * prevents default constructor
	 * @param arg0
	 * @param arg1
	 */
	private ButtonAdd(String arg0, Node arg1) {
		super(arg0, arg1);
	}
	
	/**
	 * Constructs Add button, to add new configurations into the anchor pane
	 * @param configs is the reference to the anchor pane that will be new configuration added.
	 */
	public ButtonAdd(Accordion configs) {
		this();
		this.configs = configs;
		
		this.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				ButtonAdd.this.checkAndAdd();
			}
		});
	}
	
	// checks and add new titled pane into the anchor pane
	private void checkAndAdd() {
		// TODO: implement check and add method
	}

}
