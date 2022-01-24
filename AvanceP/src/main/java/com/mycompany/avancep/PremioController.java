/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avancep;

import com.mycompany.avancep.modelo.Premio;
import com.mycompany.modelo.Auspiciante;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Henry
 */
public class PremioController {
    
    @FXML
    private TextField lugarPremio;
    
    @FXML
    private TextField descripcionPremio;
    
    @FXML
    private ComboBox<String> auspiciantePremio;
    
    @FXML
    private Button btnGuardar;
    
    @FXML
    private Button regresarPremio;
    
    
    ArrayList<Auspiciante> auspiciantes= Auspiciante.cargarAuspiciantes(App.pathAuspiciantes);
    

    @FXML
    private void initialize() {
      
        for(Auspiciante c: auspiciantes){
            auspiciantePremio.getItems().add(c.getNombre());
        }

    }
    
    @FXML
    private void guardarPremio() {
               
        Premio p = new Premio(lugarPremio.getText(),descripcionPremio.getText(),auspiciantePremio.getValue());
        System.out.println("Nuevo Premio:" + p);
        
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            //File file = new File("archivo.txt");
            File file = new File( getClass().getClassLoader().getResource(App.pathPremios).getFile() );
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(p.escribirLinea());
            System.out.println("información agregada!");
            
            bw.newLine();
            bw.close();
            App.setRoot("crearConcurso");
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                            //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    @FXML
    void switchToCrearConcurso(ActionEvent event) {
        App.switchScenes(event, "crearConcurso", 423, 691);
    }
}