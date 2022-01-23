package com.mycompany.avancep.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Auspiciante extends Persona{
  private String webpage;
  //Constructor de la clase hija
  
  public Auspiciante(String n, String d, String t, String ciu,String e, String cod, String web){
    super(n, d, t, ciu, e, cod);
    this.webpage = web;
    
  }
  @Override
  public String toString(){
    return super.toString() + "\npagina web: " + webpage; 
  }
  
  
  //Formato de Archivo
  //cod, nombre, direccion, telefono, ciudad, email, webpage
  
  public static ArrayList<Auspiciante> cargarAuspiciantes(String ruta) {
        ArrayList<Auspiciante> auspiciantes = new ArrayList<>();
        InputStream input = Auspiciante.class.getClassLoader().getResourceAsStream(ruta);

        try(BufferedReader br = new BufferedReader(new InputStreamReader(input)))
         {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] datos = line.split(",");
                Auspiciante auspiciante = new Auspiciante(datos[1], datos[2], datos[3], datos[4], datos[5], datos[0],datos[6]);
                auspiciantes.add(auspiciante);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } 
        return auspiciantes;
    }

  
}