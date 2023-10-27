package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

/*
 * Clase principal del programa que carga el archivo "GUIBiblioteca.fxml" 
 * con la interfaz gráfica, además de poner el titulo de la ventana
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(Main.class.getResource("GUIBiblioteca.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Biblioteca MGB");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Application.launch(Main.class, new String[0]);
	}
}
