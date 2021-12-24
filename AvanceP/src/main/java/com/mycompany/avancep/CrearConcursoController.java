/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 *
 * @author Henry
 */
public class CrearConcursoController {
     @FXML
    private Button fx_AñadirPremio;

    @FXML
    private Button fx_regresar;

    @FXML
    void switchToAdministrarConcurso(ActionEvent event) {
        App.switchScenes(event, "administrarConcurso", 558, 333);
    }

    @FXML
    void switchToAñadirPremio(ActionEvent event) {
        App.switchScenes(event, "premio", 332, 261);
    }
}
