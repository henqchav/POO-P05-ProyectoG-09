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
public class AdministrarDueñoController {
     @FXML
    private Button fx_registrar;

    @FXML
    private Button primaryButton;
    @FXML
    void switchtoAgregarDueño(ActionEvent event) {
         App.switchScenes(event, "agregarDueño", 523, 470);
    }
    @FXML
    void switchToPrincipal(ActionEvent event) {
        App.switchScenes(event, "principal", 530, 261);
    }

}
