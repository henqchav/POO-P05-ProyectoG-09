/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

/**
 *
 * @author Henry
 */
import com.mycompany.modelo.Animal;
import com.mycompany.modelo.Auspiciante;
import com.mycompany.modelo.Ciudad;
import com.mycompany.modelo.Duenio;
import com.mycompany.modelo.Mascota;
import com.mycompany.utils.DuenioConverter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CreaarAuspicianteController {

    @FXML
    private ComboBox<Ciudad> cbciudad;

    @FXML
    private TextField txtdireccion;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txttelefono;

    @FXML
    private TextField txtwebpage;

    @FXML
    void switchToAdministrarAuspiciante(ActionEvent event) {
        App.switchScenes(event, "administrarAuspiciantes", 600, 400); 
    }
    
    public void llenarCombo(ArrayList<Ciudad> ciudad){
        cbciudad.getItems().addAll(ciudad);
    }
    @FXML
    public void guardarAuspiciante() {
        ArrayList<Auspiciante> auspiciantesag = Auspiciante.cargarAuspiciantes();
        System.out.println("Guardando Auspiciante....");
        String nombre = txtnombre.getText();
        String direccion = txtdireccion.getText();
        String telefono = txttelefono.getText();
        String ciudad = String.valueOf(cbciudad.getValue().getNombre());
        String email = txtemail.getText();
        String webpage = txtwebpage.getText();
        int id = ((auspiciantesag.get(auspiciantesag.size()- 1).getId())+1);
        Auspiciante a = new Auspiciante(id, nombre, direccion, telefono, ciudad, email, webpage);
        auspiciantesag.add(a);
        System.out.println("El Auspiciante se a guardado con exito");
        try (PrintWriter pw = new PrintWriter(new FileWriter("src/main/resources/com/mycompany/avancep/files/" + "mascotas.csv", true))) {
            pw.println(String.valueOf(id) + ";" + nombre + ";" + direccion + ";" + telefono + ";" + ciudad + ";" + email + ";" + webpage);
            pw.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    public void llenarCampos(Auspiciante a) {
        txtnombre.setText(a.getNombre());
        txtdireccion.setText(a.getDireccion());
        txttelefono.setText(a.getTelefono());
        cbciudad.setValue(Ciudad.getCiudadbyName(a.getCiudad()));
        txtemail.setText(a.getEmail());
        txtwebpage.setText(a.getWebpage());
        txtnombre.setDisable(true);
        txtemail.setDisable(true);
        txtwebpage.setDisable(true);
    }
}
