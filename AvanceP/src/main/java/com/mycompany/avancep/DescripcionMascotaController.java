package com.mycompany.avancep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class DescripcionMascotaController {

     @FXML
    private Label fx_born;

    @FXML
    private ImageView fx_foto;

    @FXML
    private Label fx_name;

    @FXML
    private Label fx_owner;

    @FXML
    private Label fx_raza;

    @FXML
    void switchToAdministrarMascota(ActionEvent event) {  
        App.switchScenes(event, "administrarMascota", 500, 400);
    }

}
