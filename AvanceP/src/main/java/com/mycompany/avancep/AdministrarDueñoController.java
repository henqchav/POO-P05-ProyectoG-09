/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import com.mycompany.avancep.modelo.*;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.control.TableView;
/**
 *
 * @author Henry
 */
public class AdministrarDueñoController {
    @FXML
    TableView<Duenio> tv_Duenios; 
    @FXML
    private TableColumn<Duenio, Integer> col_ID;
    @FXML
    private TableColumn<Duenio, String> col_Nombre;
    @FXML
    private TableColumn<Duenio, String> col_Apellido;
    @FXML
    private TableColumn<Duenio, String> col_Telefono;
    @FXML
    private TableColumn<Duenio, String> col_Ciudad;
    
     @FXML
    private Button fx_registrar;

    @FXML
    private Button primaryButton;
    
    
    
    
    @FXML
    private void initialize(){
        col_ID.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getId()));
        col_Nombre.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getNombre()));
        col_Apellido.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getApellido()));
        col_Telefono.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getTelefono()));
        col_Ciudad.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getCiudad()));
        
        tv_Duenios.getItems().setAll(Duenio.cargarDuenios());
        
    }
    
    
    private void agregarOpciones() {

        Callback<TableColumn<Duenio, Void>, TableCell<Duenio, Void>> cellFactory = (final TableColumn<Duenio, Void> param) -> {
            TableCell<Duenio, Void> cell = new TableCell<Duenio, Void>() {
                
                @Override
                public void updateItem(Void item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                    } else {
                        //hbox para ubicar los botones
                        HBox hbOpciones = new HBox(5);
                        //recuperar el empleado de la fila
                        Duenio duen = getTableView().getItems().get(getIndex());
                        //boton editar
                        Button btnEd = new Button("Editar");
                        btnEd.setOnAction(e ->editarDuenios(duen));
                        
                        //boton eliminar
                        Button btnEl = new Button("Eliminar");
                       
                        btnEl.setOnAction(e -> eliminarDuenios(duen));
                        //se agregan botones al hbox
                        hbOpciones.getChildren().addAll(btnEd,btnEl);
                        //se ubica hbox en la celda
                        setGraphic(hbOpciones);
                    }
                }
            };
            return cell;
       
        };
        
        
    }
    private void editarDuenios(Duenio d) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("nuevo.fxml"));//no tiene el controlador especificado
            AgregarDueñoController ad = new AgregarDueñoController();

            fxmlLoader.setController(ad);//se asigna el controlador

            VBox root = (VBox) fxmlLoader.load();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private void eliminarDuenios(Duenio d) {

        System.out.println("Dueño : " + d);

    }
    
    @FXML
    void switchtoAgregarDueño(ActionEvent event) {
         App.switchScenes(event, "agregarDueño", 523, 470);
    }
    @FXML
    void switchToPrincipal(ActionEvent event) {
        App.switchScenes(event, "principal", 530, 261);
    }
    

}
