package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	// Atributos de JavaFX
	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	@FXML
	private Button btnSalirApp;
	@FXML
	private Button btnAnyadirLibro;
	@FXML
	private Button btnRealizarPrestamo;
	@FXML
	private Button btnRealizarDevolucion;
	@FXML
	private Label lblSubtitulo;
	@FXML
	private ListView<String> listaMostrarLibros;
	@FXML
	private ListView<String> listaMostrarPrestamos;
	@FXML
	private TextField buscadorLibros;
	private StringProperty parametroBusqueda = new SimpleStringProperty("");

	// Metodo cerrarApp() utilizado para cerrar definitivamente la aplicacion
	@FXML
	public void cerrarApp(ActionEvent event) {
		Platform.exit();
	}

	@FXML
	public void initialize() {
		// Vincula la propiedad del campo de busqueda con el valor ingresado
		buscadorLibros.textProperty().bindBidirectional(parametroBusqueda);
	}

	// Metodo para buscar libros en el archivo "libros.txt" mediante un BufferedReader
	@FXML
	public void buscarLibro(ActionEvent event) {
		String parametroABuscar = parametroBusqueda.get();
		listaMostrarLibros.getItems().clear();

		try (BufferedReader br = new BufferedReader(new FileReader("libros.txt"))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				if (linea.contains(parametroABuscar)) {
					listaMostrarLibros.getItems().add(linea);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Metodo para agregar un nuevo libro al archivo "libros.txt" mediante un BufferedWriter
	@FXML
	public void anyadirLibro(ActionEvent event) {
		String nuevoLibro = buscadorLibros.getText();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("libros.txt", true))) {
			bw.write(nuevoLibro);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		buscadorLibros.clear();
	}

	 /*
	  * Metodo para registrar un prestamo en el archivo "prestamos.txt"
	  * Este metodo solo funciona si el nombre del libro a buscar se
	  * encuentra en el Buscador de Libros (Parte izq de la interfaz)
	  */
	@FXML
	public void realizarPrestamo(ActionEvent event) {
		String libroPrestado = buscadorLibros.getText();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("prestamos.txt", true))) {
			bw.write("Préstamo: " + libroPrestado);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		buscadorLibros.clear();
	}

	// Metodo para registrar una devolucion en el archivo "prestamos.txt"
	@FXML
	public void realizarDevolucion(ActionEvent event) {
		String libroDevuelto = buscadorLibros.getText();
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("prestamos.txt", true))) {
			bw.write("Devolución: " + libroDevuelto);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		buscadorLibros.clear();
	}
}
