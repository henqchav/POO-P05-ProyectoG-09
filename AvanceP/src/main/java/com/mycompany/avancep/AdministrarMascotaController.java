package com.mycompany.avancep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class AdministrarMascotaController {

    @FXML
    private TableView<?> fx_table;

    @FXML
    void switchToDescripcionMascota(ActionEvent event) {
        App.switchScenes(event, "descripcionMascota", 470, 340);    
    }

    @FXML
    void switchToRegristrarMascota(ActionEvent event) {
        App.switchScenes(event, "registrarMascota", 475, 500);
    }
    @FXML
    void switchToPrincipal(ActionEvent event) {
        App.switchScenes(event, "principal", 530, 261);
    }
}
