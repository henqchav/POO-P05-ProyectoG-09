package com.mycompany.avancep.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ciudad{
	private String nombre; //Nombre de la ciudad
	private String provincia; //Provincia de la ciudad
	private String codigo;

	public Ciudad(String nombre,String provincia,String codigo){
		this.nombre=nombre;
		this.provincia=provincia;
		this.codigo=codigo;
	}
  
	public String getNombre(){
		return nombre;
	}
	public String getProvincia(){
		return provincia;
	}
	public String getCodigo(){
		return codigo;
	}
  @Override
  public String toString(){
    return "Nombre: "+nombre+"\nProvincia: "+provincia+"\nCodigo: "+codigo;
  }
  
  /*
    @Override
    public int compareTo(Ciudad ciudad) {
        //0 si son iguales
        //-1 si el primero es menor que el segundo
        //1 PRIMERO ES MAYOR QUE el segundo
        int resultado=0;

        if(this.codigo > ciudad.codigo){
            resultado=1;
        }else if(this.codigo < ciudad.codigo){
            resultado = -1;
        }else{
            resultado=0;
        }
        return resultado;
    }
  */
  
  public static ArrayList<Ciudad> cargarCiudades(String ruta) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        InputStream input = Ciudad.class.getClassLoader().getResourceAsStream(ruta);

        try(BufferedReader br = new BufferedReader(new InputStreamReader(input)))
         {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] datos = line.split(",");
                Ciudad ciudad = new Ciudad(datos[1], datos[2],datos[0]);
                ciudades.add(ciudad);
                line = br.readLine();
            }
            

        } catch (IOException e) {
            e.printStackTrace();
        } 
        return ciudades;
    }


  
}