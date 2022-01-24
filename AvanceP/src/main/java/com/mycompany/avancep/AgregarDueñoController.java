/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import com.mycompany.avancep.modelo.Ciudad;
import com.mycompany.avancep.modelo.Duenio;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Henry
 */
public class AgregarDueñoController {

    @FXML
    private Button fx_return;

    @FXML
    private TextArea txtapellidos;

    @FXML
    private TextArea txtdireccion;

    @FXML
    private TextArea txtemail;

    @FXML
    private TextArea txtnombres;

    @FXML
    private TextArea txttelefono;
    
    @FXML
    private ComboBox<Ciudad> cmbCiudadConcurso;
    @FXML
    private ComboBox<String> cmbCiudad;
    ArrayList<Ciudad> ciudades= Ciudad.cargarCiudades(App.pathCiudades);
    
    
    private void initialize() {
        for(Ciudad c: ciudades){
            cmbCiudad.getItems().add(c.getNombre());
        }
    }
    
    public void llenarCombo(ArrayList<Ciudad> ciudades){
        cmbCiudadConcurso.getItems().addAll(ciudades);
    }
    
    public void llenarCampos(Duenio d) {
        txtnombres.setText(d.getNombre());
        txtapellidos.setText(d.getApellido());
        txtdireccion.setText(d.getDireccion());
        txttelefono.setText(d.getTelefono());
        cmbCiudadConcurso.setValue(Ciudad.getCiudadbyName(d.getCiudad()));
        txtemail.setText(d.getEmail());
        txtnombres.setDisable(true);
        txtemail.setDisable(true);
    }
    
    
    public void guardarDuenio(){
        ArrayList<Duenio> duenios = Duenio.cargarDuenios();
        System.out.println("Guardando Dueño....");
        String nombre = txtnombres.getText();
        String apellido = txtapellidos.getText();
        String direccion = txtdireccion.getText();
        String telefono = txttelefono.getText();
        String email = txtemail.getText();
        String ciudad = String.valueOf(cmbCiudadConcurso.getValue());
        int id = (duenios.size()+1);
        Duenio d = new Duenio(id,apellido,nombre,direccion,telefono,ciudad,email);
        duenios.add(d);
        System.out.println("El dueño se a guardado con exito");
        
        try(PrintWriter pw = new PrintWriter(new FileWriter("src/main/resources/com/mycompany/avancep/files/"+ "duenosP5.csv",true))){
            pw.println(String.valueOf(id)+";"+apellido+";"+nombre+";"+direccion+";"+telefono+";"+ciudad+";"+email);
        }catch(IOException e){
         System.out.println("File not found");       
        }
        
    }
    


    @FXML
    void switchToAdministarDueño(ActionEvent event) {
        App.switchScenes(event, "administrarDueño", 558, 333);

    }

}
