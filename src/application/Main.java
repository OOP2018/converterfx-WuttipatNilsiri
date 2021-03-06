package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent)FXMLLoader.load(
					getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			stage.setResizable(false);
			stage.setScene(scene);
			stage.sizeToScene( );
			
			stage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scene: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}