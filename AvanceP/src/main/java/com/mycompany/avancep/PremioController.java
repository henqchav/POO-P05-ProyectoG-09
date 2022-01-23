/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Henry
 */
public class PremioController {
    
    @FXML
    private TextField lugarPremio;
    
    @FXML
    private TextField descripcionPremio;
    
    @FXML
    private ComboBox auspiciantePremio;
    
    @FXML
    private Button guardarPremio;
    
    @FXML
    private Button regresarPremio;
    
    @FXML
    void switchToCrearConcurso(ActionEvent event) {
        App.switchScenes(event, "crearConcurso", 423, 691);
    }
}
