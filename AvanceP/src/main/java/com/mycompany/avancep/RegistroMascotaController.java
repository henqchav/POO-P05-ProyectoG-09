
package com.mycompany.avancep;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import modelo.Duenio;
import modelo.Mascota;
import utils.DuenioConverter;
import modelo.Animal;

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
    private RadioButton btngato;

    @FXML
    private RadioButton btnperro;

    @FXML
    private ComboBox<Duenio> cb_Duenios;

    @FXML
    private DatePicker fechanac;

    @FXML
    private ToggleGroup pg;

    @FXML
    private TextArea txtNombre;

    @FXML
    private TextArea txtraza;

    @FXML
    private void initialize() {
        cb_Duenios.getItems().addAll(Duenio.cargarDuenios());
        cb_Duenios.setConverter(new DuenioConverter());
    }

    public void llenarCombo(ArrayList<Duenio> duenios) {
        cb_Duenios.getItems().addAll(duenios);
        cb_Duenios.setConverter(new DuenioConverter());
    }

    @FXML
    void switchToAdministrarMascota(ActionEvent event) {
        App.switchScenes(event, "administrarMascota", 650, 400);
    }

    @FXML
    public void guardarMascota() {
        ArrayList<Mascota> mascotas = Mascota.cargarMascotas();
        System.out.println("Guardando Mascota....");
        String nombre = txtNombre.getText();
        String raza = txtraza.getText();
        String fecha = fechanac.getValue().toString();
        String[] afoto = IV.getImage().getUrl().split("/");
        String foto = afoto[afoto.length - 1];
        String duenio = String.valueOf(cb_Duenios.getValue().getId());
        RadioButton selectedRadioButton = (RadioButton) pg.getSelectedToggle();
        String tipo = selectedRadioButton.getText();
        int id = ((mascotas.get(mascotas.size()- 1).getId())+1);
        Mascota m = new Mascota(id, nombre, Animal.valueOf(tipo.toUpperCase()), raza, fecha, foto, duenio);
        mascotas.add(m);
        System.out.println("La mascota se a guardado con exito");
        try (PrintWriter pw = new PrintWriter(new FileWriter("src/main/resources/com/mycompany/avancep/files/" + "mascotas.csv", true))) {
            pw.println(String.valueOf(id) + ";" + nombre + ";" + Animal.valueOf(tipo.toUpperCase()) + ";" + raza + ";" + fecha + ";" + foto + ";" + duenio);
            pw.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

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
            Files.copy(from, to);//marca coso aqui
        }
        App.setRoot("administatMascota");
    }

    @FXML
    void saveMascota(ActionEvent event) {
        guardarMascota();
    }

    @FXML
    public void llenarCampos(Mascota m) {
        txtNombre.setText(m.getNombre());
        if (m.getAnimal().equals(Animal.GATO)) {
            btngato.setSelected(true);
        } else {
            btnperro.setSelected(true);
        }
        btnperro.setDisable(true);
        btngato.setDisable(true);
        fechanac.setEditable(false);
        fechanac.setDisable(true);
        fechanac.setValue(LocalDate.parse(m.getFechaNacimiento()));
        txtraza.setEditable(false);
        txtraza.setText(m.getRaza());
        cb_Duenios.setEditable(true);
        cb_Duenios.setValue(Duenio.getDueniobyID(Integer.valueOf(m.getId())));
        cargafoto(m.getFoto());
        cb_Duenios.setDisable(true);
    }

    //cargar una foto
    public void cargafoto(String photo) {
        if(photo != null){
            Image image = new Image(getClass().getResource("files/" + photo).toExternalForm(), 200, 150, false, false);
            IV.setImage(image);
        }else{
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Atención");
            alerta.setHeaderText("NO SE ENCONTRO NINGULA FOTO DE LA MASCOTA");
            alerta.setContentText("Por favor, selecciona una mascota de la tabla");
            alerta.showAndWait();
            System.out.println("SELECCIONE UNA MASCOTA");
        }
        
    }
}
