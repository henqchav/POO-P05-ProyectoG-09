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
public class PremioController {
    @FXML
    private Button fx_regresar;

    @FXML
    void switchToCrearConcurso(ActionEvent event) {
        App.switchScenes(event, "crearConcurso", 423, 691);
    }
}
