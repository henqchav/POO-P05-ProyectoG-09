package com.mycompany.avancep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.Node;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    
    public static String pathCiudades="com/mycompany/avancep/files/ciudades.csv";
    
    public static String pathAuspiciantes="com/mycompany/avancep/files/auspiciantes.csv";

    public static String pathPremios="com/mycompany/avancep/files/premios.csv";
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("principal"), 530, 500);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    /*metodo que permite cambiar de escenas cambiando
    el tamaño de la ventana y la fija en el centro de la pantalla*/

    static void switchScenes(ActionEvent event, String fxml, int SizeX, int SizeY){
        try {
            Parent root = App.loadFXML(fxml);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root, SizeX, SizeY);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException e){
            System.out.println("File not found, Error al cargar pantalla");
        }

    }

}