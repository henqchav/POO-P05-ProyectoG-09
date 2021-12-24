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
public class AgregarDueñoController {
     @FXML
    private Button fx_return;

    @FXML
    void switchToAdministarDueño(ActionEvent event) {
        App.switchScenes(event, "administrarDueño", 558, 333);

    }

}
