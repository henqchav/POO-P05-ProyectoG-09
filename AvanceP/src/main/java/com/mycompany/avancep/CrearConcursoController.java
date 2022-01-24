/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import com.mycompany.avancep.modelo.Animal;
import com.mycompany.avancep.modelo.Ciudad;
import com.mycompany.avancep.modelo.Premio;
import com.mycompany.avancep.modelo.Auspiciante;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Henry
 */
public class CrearConcursoController {
    
    @FXML
    private ComboBox<Animal>  comboMascota;
    
    @FXML
    private TextField nombreConcurso;
    
    @FXML
    private DatePicker fechaConcurso;
    
    @FXML
    private TextField horaConcurso;
    
    @FXML
    private Button fx_AñadirPremio;
     
    @FXML
    private DatePicker inicioInscripcion;
    
    @FXML
    private DatePicker cierreIncripcion;
    
    @FXML
    private ComboBox<String> cmbCiudadConcurso;
    
    @FXML
    private TextField lugarConcurso;
    
    @FXML
    private ListView<String> auspiciantesConcurso;
    
    @FXML
    private TableView<Premio> tablaPremio;
    
    @FXML
    private TableColumn<Premio,String> lugarColum;
    
    @FXML
    private TableColumn<Premio,String> descripcionColum;
    
    @FXML
    private TableColumn<Premio,String> auspicianteColum;
    
    
    @FXML
    private Button agregarPremio;

    @FXML
    private Button guardarConcurso;
    
    @FXML
    private Button regresarConcurso;
    
    ArrayList<Ciudad> ciudades= Ciudad.cargarCiudades(App.pathCiudades);
    ArrayList<Auspiciante> auspiciantess= Auspiciante.cargarAuspiciantes(App.pathAuspiciantes);
    
    //Hacemos un observable para listar los auspiciantes
    ObservableList<String> auspiciantes = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        comboMascota.getItems().setAll(Animal.values());
        comboMascota.setValue(Animal.PERRO);
        System.out.println("combobox inicializado");
              
        for(Ciudad c: ciudades){
            cmbCiudadConcurso.getItems().add(c.getNombre());
        }
        
        for(Auspiciante aus: auspiciantess){
            auspiciantes.add(aus.getNombre());
        }
        
        for(String aus: auspiciantes){
            System.out.println(aus);;
        }
        
        auspiciantesConcurso.setItems(auspiciantes);
        
        //para la tabla viewde premio
        lugarColum.setCellValueFactory(new PropertyValueFactory<>("nivel"));
        descripcionColum.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        //auspicianteColum.setCellValueFactory(new PropertyValueFactory<>("auspiciante"));

        tablaPremio.getItems().setAll(Premio.cargarPremios(App.pathPremios));
    }
    
    @FXML
    void switchToAdministrarConcurso(ActionEvent event) {
        App.switchScenes(event, "administrarConcurso", 558, 333);
    }

    @FXML
    void switchToAñadirPremio(ActionEvent event) {
        App.switchScenes(event, "premio", 332, 261);
    }

}
