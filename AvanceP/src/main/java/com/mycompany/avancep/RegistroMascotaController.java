
package com.mycompany.avancep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
/**
 *
 * @author Henry
 */
public class RegistroMascotaController {
    @FXML
    void switchToAdministrarMascota(ActionEvent event) {
        App.switchScenes(event, "administrarMascota", 500, 400);          
    }
}
