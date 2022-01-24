package com.mycompany.modelo;

import com.mycompany.avancep.modelo.Persona;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import java.io.FileInputStream;

public class Auspiciante extends Persona {

    private String webpage;
    //Constructor de la clase hija
    public String getWebpage(){
        return webpage;
    }

    public Auspiciante(int id, String n,String d, String t, String ciu, String e, String web) {
        super(n, d, t, ciu, e, id);
        this.webpage = web;

    }

    @Override
    public String toString() {
        return super.toString() + "\npagina web: " + webpage;
    }

    //Formato de Archivo
    //cod, nombre, direccion, telefono, ciudad, email, webpage
    public static ArrayList<Auspiciante> cargarAuspiciantes() {
        ArrayList<Auspiciante> auspiciantes = new ArrayList<>();
        //InputStream input = new FileInputStream("src/main/resources/com/mycompany/avancep/files/"+ "mascotas.csv");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/com/mycompany/avancep/files/"+ "auspiciantes.csv")))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] datos = line.split(";");
                int id = Integer.valueOf(datos[0]);
                Auspiciante a = new Auspiciante(id, datos[1],datos[2], datos[3], datos[4], datos[5], datos[6]);
                //System.out.println("Mascota" + m);
                auspiciantes.add(a);
                line = br.readLine();
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return auspiciantes;

    }}
