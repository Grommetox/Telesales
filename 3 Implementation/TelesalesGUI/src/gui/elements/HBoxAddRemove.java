package gui.elements;

import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * HBox that contains Add and remove buttons to add and remove configurations.
 * @author rasgarbayli
 * @version 1.0
 */
public class HBoxAddRemove extends HBox {

	/**
	 * preventing default constructor
	 */
	private HBoxAddRemove() {
		this(10);
	}

	/**
	 * preventing default constructor
	 * @param spacing is the spacing between children
	 */
	private HBoxAddRemove(double spacing) {
		super(spacing);
	}

	/**
	 * preventing default constructor
	 * @param arg0
	 */
	private HBoxAddRemove(Node... arg0) {
		super(arg0);
	}

	/**
	 * preventing default constructor
	 * @param spacing
	 * @param children
	 */
	private HBoxAddRemove(double spacing, Node... children) {
		super(spacing, children);
	}
	
	/**
	 * Constructs an HBox with 2 buttons: Add and Remove
	 * @param add
	 * @param remove
	 */
	protected HBoxAddRemove(ButtonAdd add, ButtonRemove remove, Stage primaryStage) {
		this(); // with spacing = 10
		
		// Add button must not reference to the null
		if (add == null) {
			WarningWindow errorAdd = new WarningWindow("Add button references to the null", primaryStage);
			errorAdd.showAndWait();
			System.exit(5);
		}
		
		// Remove button must not reference to the null
		if (remove == null) {
			WarningWindow errorAdd = new WarningWindow("Remove button references to the null", primaryStage);
			errorAdd.showAndWait();
			System.exit(5);
		}
		
		// now it is okay
		this.getChildren().add(add);
		this.getChildren().add(remove);
	}

}
