
package com.mycompany.avancep;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

/**
 *
 * @author Henry
 */
public class RegistroMascotaController {
    @FXML
    private ImageView IV;

    @FXML
    private Button btn_IV;
    
    @FXML
    void switchToAdministrarMascota(ActionEvent event) {
        App.switchScenes(event, "administrarMascota", 500, 400);          
    }
    @FXML
    private void buscarArchivo() throws IOException {
       
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar archivo");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
        File imgFile = fileChooser.showOpenDialog(null);

        if (imgFile != null) {
            Image image = new Image("file:" + imgFile.getAbsolutePath());
            System.out.println(imgFile.getAbsolutePath());
            IV.setImage(image);
            Path from = Paths.get(imgFile.toURI());
            Path to = Paths.get("archivos/" + imgFile.getName());
            Files.copy(from, to);
        }
    }
}
