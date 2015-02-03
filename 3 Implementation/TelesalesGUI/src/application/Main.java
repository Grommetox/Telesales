package application;
	
import gui.elements.BorderPaneRoot;
import gui.elements.HBoxRoot;
import gui.elements.TabLoginData;
import gui.elements.TabPaneRoot;
import gui.elements.VBoxLogin;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Building root buttons
			Button create, open, save, saveAs, run, exit;
			create = new Button("New");
			open = new Button("Open");
			save = new Button("Save");
			saveAs = new Button("Save as");
			run = new Button("Run the configuration");
			exit = new Button("Exit");
			// building root HBox
			HBoxRoot hBoxRoot = new HBoxRoot(primaryStage, create, open, save, saveAs, run, exit);
			
			TabLoginData login = new TabLoginData(new VBoxLogin());
			TabLoginData login2 = new TabLoginData(new VBoxLogin());
			
			BorderPaneRoot root = new BorderPaneRoot(new TabPaneRoot(login2, login, primaryStage), hBoxRoot, primaryStage);
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
