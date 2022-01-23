package com.mycompany.avancep;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.Mascota;
import modelo.Duenio;
import modelo.Animal;

public class AdministrarMascotaController {

    @FXML
    private TableView<Mascota> tv_mascotas;
    @FXML
    private TableColumn<Mascota, Integer> col_ID;
    @FXML
    private TableColumn<Mascota, String> col_Nombre;
    @FXML
    private TableColumn<Mascota, Animal> col_Tipo;
    @FXML
    private TableColumn<Mascota, String> col_Duenio;
    
    @FXML
    private void initialize() {
        col_ID.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getId()));
        col_Nombre.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getNombre()));
        col_Tipo.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getAnimal()));
        col_Duenio.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(Duenio.getDueniobyID(Integer.valueOf(cellData.getValue().getDuenio()))));

        tv_mascotas.getItems().setAll(Mascota.cargarMascotas());
    }
    //falta que sobreescriba el archivo
    @FXML
    private void borrarMascota() {
        int indiceMascota = tv_mascotas.getSelectionModel().getSelectedIndex();
        //Hago una verificacion de que si verdaderamente quiere borrar a las mascota con una ventana
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText("¿Estas seguro de confirmar la acción?");
        Optional<ButtonType> action = alert.showAndWait();
        if ((indiceMascota >= 0)&& (action.get() == ButtonType.OK) ) {
            Mascota mascotaAborrar = tv_mascotas.getItems().remove(indiceMascota);
            ArrayList<Mascota> mascotas = Mascota.cargarMascotas();
            for (Mascota m : mascotas) {
                if (m.getId() != mascotaAborrar.getId()) {
                    mascotas.remove(m);
                    Alert alerta = new Alert(AlertType.INFORMATION);
                    alerta.setTitle("Atención");
                    alerta.setHeaderText("LA MASCOTA SE BORRO CON EXITO");
                    alerta.setContentText("Por favor, selecciona una mascota de la tabla");
                    alerta.showAndWait();
                    System.out.println("SELECCIONE UNA MASCOTA");
                } else {
                    try (PrintWriter pw = new PrintWriter(new FileWriter("src/main/resources/com/mycompany/avancep/files/" + "mascotas.csv"))) {
                        pw.write(String.valueOf(m.getId()) + ";" + m.getNombre() + ";" + Animal.valueOf(String.valueOf(m.getAnimal()).toUpperCase()) + ";" + m.getRaza() + ";" + m.getFechaNacimiento() + ";" + m.getFoto() + ";" + m.getDuenio());
                        pw.close();
                    } catch (IOException e) {
                        System.out.println("File not found");
                    } 
                }                               
            }
            System.out.println("MASCOTA BORRADA CON EXITO");
        } else {
            Alert alerta = new Alert(AlertType.WARNING);
            alerta.setTitle("Atención");
            alerta.setHeaderText("NO SE SELECCIONO A NINGUNA MASCOTA");
            alerta.setContentText("Por favor, selecciona una mascota de la tabla");
            alerta.showAndWait();
            System.out.println("SELECCIONE UNA MASCOTA");
        }

    }
     
    @FXML
    private void editMascota()  throws IOException {
        Mascota m = (Mascota) tv_mascotas.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("registrarMascota.fxml"));
        RegistroMascotaController rm = new RegistroMascotaController();
        fxmlLoader.setController(rm);
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root,475,600);
        Stage stage = (Stage)tv_mascotas.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        rm.llenarCombo(Duenio.cargarDuenios());
        rm.llenarCampos(m);
        stage.show();
    }
     @FXML
    private void cambioAregistrarMascota() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("registrarMascota.fxml"));
        RegistroMascotaController rm = new RegistroMascotaController();
        fxmlLoader.setController(rm);
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root,475,600);
        Stage stage = (Stage)tv_mascotas.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        rm.llenarCombo(Duenio.cargarDuenios());
        stage.show();    
    }
    @FXML
    private void descripcionMascota() throws IOException {
        Mascota m = (Mascota) tv_mascotas.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("descripcionMascota.fxml"));
        DescripcionMascotaController dm = new DescripcionMascotaController();
        fxmlLoader.setController(dm);
        Parent root = (Parent) fxmlLoader.load();
        Scene scene = new Scene(root,600,340);
        Stage stage = (Stage)tv_mascotas.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        dm.llenarCampos(m);
        stage.show();
    }
    @FXML
    void switchToDescripcionMascota(ActionEvent event) {
        App.switchScenes(event, "descripcionMascota", 6, 340);
    }
    @FXML
    void switchToPrincipal(ActionEvent event) {
        App.switchScenes(event, "principal", 530, 261);
    }
}
