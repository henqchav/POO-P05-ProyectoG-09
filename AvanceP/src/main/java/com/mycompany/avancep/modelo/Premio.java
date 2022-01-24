/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.avancep.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author linco
 */
public class Premio {
    private String nivel;//1ro, 2do o 3ro 
    private String descripcion;
    private String auspiciante;//son productos de comidas
    

    public Premio(String nivel, String descripcion, String adicional) {
        this.nivel = nivel;
        this.descripcion = descripcion;
        this.auspiciante = adicional;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAuspiciante() {
        return auspiciante;
    }

    public void setAuspiciante(String auspiciante) {
        this.auspiciante = auspiciante;
    }

    @Override
    public String toString() {
        return "Premio{" + "nivel=" + nivel + ", descripcion=" + descripcion + ", auspiciante=" + auspiciante + '}';
    }

    public String escribirLinea(){
        return nivel + "," + descripcion + "," + auspiciante;
    }
    
    public static ArrayList<Premio> cargarPremios(String ruta) {
        ArrayList<Premio> premios = new ArrayList<>();
        InputStream input = Premio.class.getClassLoader().getResourceAsStream(ruta);

        try(BufferedReader br = new BufferedReader(new InputStreamReader(input)))
         {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] datos = line.split(",");
                Premio p = new Premio(datos[0], datos[1], datos[2]);
                System.out.println("Premio" + p);
                premios.add(p);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return premios;
    }
}
