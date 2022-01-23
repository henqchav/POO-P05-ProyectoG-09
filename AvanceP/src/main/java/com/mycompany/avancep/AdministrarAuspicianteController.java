/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import com.mycompany.modelo.Animal;
import com.mycompany.modelo.Auspiciante;
import com.mycompany.modelo.Ciudad;
import com.mycompany.modelo.Duenio;
import com.mycompany.modelo.Mascota;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 *
 * @author Henry
 */
public class AdministrarAuspicianteController {

    @FXML
    private TableColumn<Auspiciante, String> col_ciudad;

    @FXML
    private TableColumn<Auspiciante, Integer> col_codigo;

    @FXML
    private TableColumn<Auspiciante, String> col_nombre;

    @FXML
    private TableColumn<Auspiciante, String> col_telefono;

    @FXML
    private TableView<Auspiciante> tv_auspiciantes;

    
    private void initialize() {
        col_codigo.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getId()));
        col_nombre.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getNombre()));
        col_telefono.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getTelefono()));
        col_ciudad.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getCiudad()));

        tv_auspiciantes.getItems().setAll(Auspiciante.cargarAuspiciantes());

    }
    @FXML
    private void borrarMascota() {
        int indiceMascota = tv_auspiciantes.getSelectionModel().getSelectedIndex();
        //Hago una verificacion de que si verdaderamente quiere borrar a las mascota con una ventana
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText("¿Estas seguro de confirmar la acción?");
        Optional<ButtonType> action = alert.showAndWait();
        if ((indiceMascota >= 0)&& (action.get() == ButtonType.OK) ) {
            Auspiciante Auspicianteab = tv_auspiciantes.getItems().remove(indiceMascota);
            ArrayList<Auspiciante> auspiciantesa = Auspiciante.cargarAuspiciantes();
            for (Auspiciante a : auspiciantesa) {
                if (a.getId() != Auspicianteab.getId()) {
                    auspiciantesa.remove(a);
                    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("Atención");
                    alerta.setHeaderText("LA MASCOTA SE BORRO CON EXITO");
                    alerta.setContentText("Por favor, selecciona una mascota de la tabla");
                    alerta.showAndWait();
                    System.out.println("SELECCIONE UNA MASCOTA");
                } else {
                    try (PrintWriter pw = new PrintWriter(new FileWriter("src/main/resources/com/mycompany/avancep/files/" + "auspiciantes.csv"))) {
                        pw.write(String.valueOf(a.getId()) + ";" + a.getNombre() + ";" + a.getNombre() + ";" + a.getDireccion() + ";" + a.getTelefono() + ";" + a.getCiudad() + ";" + a.getWebpage());
                        pw.close();
                    } catch (IOException e) {
                        System.out.println("File not found");
                    } 
                }                               
            }
            System.out.println("MASCOTA BORRADA CON EXITO");
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Atención");
            alerta.setHeaderText("NO SE SELECCIONO A NINGUNA MASCOTA");
            alerta.setContentText("Por favor, selecciona una mascota de la tabla");
            alerta.showAndWait();
            System.out.println("SELECCIONE UNA MASCOTA");
        }

    }
    @FXML
    void switchToPrincipal(ActionEvent event) {
        App.switchScenes(event, "principal", 530, 261);
    }
    @FXML
    private void editAuspiciante()  throws IOException {
        Auspiciante a = (Auspiciante) tv_auspiciantes.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("crearAuspiciante.fxml"));
        CreaarAuspicianteController ca = new CreaarAuspicianteController();
        fxmlLoader.setController(ca);
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root,500,472);
        Stage stage = (Stage)tv_auspiciantes.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        ca.llenarCombo(Ciudad.cargarCiudades());
        ca.llenarCampos(a);
        stage.show();
    }
    @FXML
    private void crearAuspiciante()  throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("crearAuspiciante.fxml"));
        CreaarAuspicianteController ca = new CreaarAuspicianteController();
        fxmlLoader.setController(ca);
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root,500,472);
        Stage stage = (Stage)tv_auspiciantes.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        ca.llenarCombo(Ciudad.cargarCiudades());
        stage.show();
    }
}
