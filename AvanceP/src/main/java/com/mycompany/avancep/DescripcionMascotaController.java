package com.mycompany.avancep;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.mycompany.avancep.modelo.*;
//import modelo.Animal;
//import modelo.Duenio;
//import modelo.Mascota;

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
    public void cargafoto(String photo) {
        if(photo != null){
            Image image = new Image(getClass().getResource("files/" + photo).toExternalForm(), 200, 150, false, false);
            fx_foto.setImage(image);
        }else{
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Atención");
            alerta.setHeaderText("NO SE ENCONTRO NINGULA FOTO DE LA MASCOTA");
            alerta.setContentText("Por favor, selecciona una mascota de la tabla");
            alerta.showAndWait();
            System.out.println("SELECCIONE UNA MASCOTA");
        }
        
    }
    public void llenarCampos(Mascota m) {
        fx_name.setText(m.getNombre());
        fx_born.setText(m.getFechaNacimiento());
        fx_owner.setText(String.valueOf(Duenio.getDueniobyID(m.getId())));
        fx_raza.setText(m.getRaza());
        fx_name.setDisable(true);
        fx_born.setDisable(true);
        fx_owner.setDisable(true);
        fx_raza.setDisable(true);
        cargafoto(m.getFoto());
        
    }

    @FXML
    void switchToAdministrarMascota(ActionEvent event) {  
        App.switchScenes(event, "administrarMascota", 500, 400);
    }

}
