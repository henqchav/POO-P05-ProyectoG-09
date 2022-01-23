/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 *
 * @author Henry
 */
public class AdministrarConcursoController {
    
    @FXML
    private TableView tablaAdminConcurso;
    
    @FXML
    private TableColumn codigoAdminConcurso;
    
    @FXML
    private TableColumn nombreAdminConcurso;
    
    @FXML
    private TableColumn fechasAdminConcurso;
    
    @FXML
    private TableColumn ciudadAdminConcurso;
    
    @FXML
    private TableColumn opcionesAdminConcurso;
    
    @FXML
    private Button crearConcurso;
    
    @FXML
    private Button enviarConcurso;
    
    @FXML
    private Button regresarConcurso;
    
   
    @FXML
    void switchToCrearConcurso(ActionEvent event) {
        App.switchScenes(event, "crearConcurso", 423, 691);
    }

    @FXML
    void switchToPrincipal(ActionEvent event) {
        App.switchScenes(event, "principal", 530, 261);
    }


}
