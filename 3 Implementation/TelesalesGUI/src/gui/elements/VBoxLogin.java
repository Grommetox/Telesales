package gui.elements;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * @author rasgarbayli
 * @version 1.0
 */
public class VBoxLogin extends VBox {
	private TextField login; // reference to the login field
	private PasswordField password; // reference to the password field
	
	/**
	 * 
	 */
	public VBoxLogin() {
		// creating login field
		final Label lLogin = new Label("Login:");
		this.getChildren().add(lLogin);
		this.login = new TextField();
		this.login.setPromptText("Enter login here.");
		this.getChildren().add(login);
		
		// now password field
		final Label lpass = new Label("Password:");
		this.getChildren().add(lpass);
		this.password = new  PasswordField();
		this.password.setPromptText("Enter password here.");
		this.getChildren().add(password);
		
		this.setMaxSize(300, 400);
		
		// setting gaps among children
		VBox.setMargin(lLogin, new Insets(0, 0, 5, 0));
		VBox.setMargin(login, new Insets(0, 0, 25, 0));
		VBox.setMargin(lpass, new Insets(0, 0, 5, 0));
		VBox.setMargin(password, new Insets(0, 0, 5, 0));
		
	}

	/**
	 * preventing constructor
	 */
	private VBoxLogin(double arg0) {}

	/**
	 * preventing constructor
	 */
	private VBoxLogin(Node... arg0) {}

	/**
	 * preventing constructor
	 */
	private VBoxLogin(double arg0, Node... arg1) {}

	/**
	 * @return the login
	 */
	public TextField getLogin() {
		return login;
	}

	/**
	 * @return the password
	 */
	public PasswordField getPassword() {
		return password;
	}

}
