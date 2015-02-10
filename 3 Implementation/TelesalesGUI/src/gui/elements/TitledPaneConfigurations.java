package gui.elements;

import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

/**
 * Contains the input fields for the each configuration with respect to the country.
 * @author rasgarbayli
 * @version 1.0
 */
public class TitledPaneConfigurations extends TitledPane {
	private String county;
	private TextField url;
	private TextField customerID;
	private TextField tariff;
	private TextField tariffComp;
	private TextField domain;
	private ChoiceBox<String> domainBundle;
	private TableView<String> tariffAddOns;
	/**
	 * 
	 */
	public TitledPaneConfigurations(String country) {
		// first things first
		super();
		this.county = country;
		this.setText("Configuration for " + country);
		
		// 
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	private TitledPaneConfigurations(String title, Node content) {
		super(title, content);
	}

}
