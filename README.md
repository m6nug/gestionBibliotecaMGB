# Documentación del Proyecto: Gestión de una Biblioteca (Biblioteca MGB)

## Descripción del Proyecto
El proyecto "Biblioteca MGB" es una aplicación de gestión de biblioteca desarrollada en Java con JavaFX. La aplicación permite a los usuarios realizar diversas acciones relacionadas con la biblioteca, como buscar libros, agregar nuevos libros a la biblioteca o registrar préstamos y devoluciones.

## Estructura del Proyecto
El proyecto está organizado en un solo paquete llamado "application" dentro de "src". La estructura del proyecto es la siguiente:
```
src/
   application/
      - Main.java
      - Controller.java
      - GUIBiblioteca.fxml
libros.txt
prestamos.txt
```

Main.java: Esta clase inicia la aplicación JavaFX y carga el archivo FXML para mostrar la GUI.

Controller.java: Esta clase actúa como el controlador de la aplicación, maneja las interacciones del usuario y contiene los métodos que realizan acciones como búsqueda de libros, registro de préstamos y devoluciones.

GUIBiblioteca.fxml: Este archivo FXML define la interfaz de usuario de la aplicación utilizando etiquetas de JavaFX.

libros.txt: Un archivo que almacena información sobre los libros en la biblioteca.

prestamos.txt: Un archivo que registra los préstamos y devoluciones de libros.

## Funcionalidades Principales
Búsqueda de Libros: Los usuarios pueden buscar libros en la biblioteca ingresando el título del libro, autor o ISBN en un campo de texto y haciendo clic en un botón de búsqueda.

Adición de Libros: Los usuarios pueden agregar nuevos libros a la biblioteca ingresando los datos del libro en el campo de texto y haciendo clic en el botón de agregar '+'.

Registro de Préstamos y Devoluciones: Los usuarios pueden registrar préstamos y devoluciones de libros utilizando los botones correspondientes.

Cierre de la Aplicación: La aplicación permite a los usuarios cerrarla de manera ordenada haciendo clic en un botón de salida.

## Requisitos
Java Development Kit (JDK)
JavaFX configurado en el entorno de desarrollo (En este caso Eclipse)
Bibliotecas de JavaFX

## Notas Adicionales
Este proyecto proporciona una estructura básica para la gestión de una biblioteca. Puede personalizarse y ampliarse según las necesidades específicas de su biblioteca.
