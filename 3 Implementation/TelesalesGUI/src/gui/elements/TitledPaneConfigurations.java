package gui.elements;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;

/**
 * Contains the input fields for the each configuration with respect to the country.
 * @author rasgarbayli
 * @version 1.0
 */
public class TitledPaneConfigurations extends TitledPane {
	private String country;
	private TextField url;
	private TextField customerID;
	private TextField tariff;
	private TextField tariffCamp;
	private TextField domain;
	private CheckBox domainBundle;
	private TableView<String> tariffAddOns;
	/**
	 * 
	 */
	public TitledPaneConfigurations(String country) {
		// first things first
		super();
		this.country = country;
		this.setText("Configuration for " + this.country);
		GridPane content = new GridPane();
		content.setPadding(new Insets(5));
		this.setContent(content);
		
		// creating input elements
		url = new TextField();
		url.setPromptText("Ex.: https://hosting-telesales-de.telesales-hosting.gem1.websales.united.domain:9613/");
		
		customerID = new TextField();
		customerID.setPromptText("Ex.: 7156019");
		
		tariff = new TextField();
		tariff.setPromptText("Ex.: tariff-basic");
		
		tariffCamp = new TextField();
		tariffCamp.setPromptText("Ex.: tariff-toggle");
		
		domain = new TextField();
		domain.setPromptText("Ex.: yourdomain.com");
		
		domainBundle = new CheckBox("Domain bundle");
		domainBundle.setSelected(false);
		
		// TODO: TableView
		
		// adding them into the TitledPane
		content.add(new Label("Telesales URL:"), 0, 0);
		content.add(url, 1, 0);
		
		content.add(new Label("Customer's number:"), 0, 1);
		content.add(customerID, 0, 2);
		
		content.add(new Label("Tariff:"), 1, 1);
		content.add(tariff, 1, 2);
		
		content.add(new Label("Tariff-Campaign-Control:"), 2, 1);
		content.add(tariffCamp, 2, 2);
		
		content.add(new Label("Domain:"), 3, 1);
		content.add(domain, 3, 2);
		
		content.add(domainBundle, 4, 2);
		
		
		
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	private TitledPaneConfigurations(String title, Node content) {
		super(title, content);
	}

}
