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
public class PrincipalController {
     @FXML
    private Button fx_concurso;

    @FXML
    private Button fx_mascotas;

    @FXML
    private Button fx_owner;

    @FXML
    void switchToAdministrarConsurso(ActionEvent event) {
        App.switchScenes(event, "administrarConcurso", 558, 333);
    }

    @FXML
    void switchToAdministrarDueño(ActionEvent event) {
        App.switchScenes(event, "administrarDueño", 558, 333);
    }

    @FXML
    void switchToAdministrarMascota(ActionEvent event) {
        App.switchScenes(event, "administrarMascota", 500, 400); 
    }
}
