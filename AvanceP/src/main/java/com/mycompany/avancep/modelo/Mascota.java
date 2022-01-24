package com.mycompany.avancep.modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Mascota{
	private String nombre; //Nombre de la mascota
        private Animal animal; //es perro o gato
	private String EsPerro; //es perro o gato
	private String raza; //Raza del perro o gato
	private String fechaNacimiento; //Fecha de nacimiento de la mascota
        private static int id;//le puse static para que si se refleje el contador 
	private String foto; //Foto de la mascota
	private String duenio; //Dueño de la mascota

	//metodo getNombre retorna el nombre de la mascota
	public String getNombre(){
		return nombre;
	}
	//metodo getRaza retorna la raza de la mascota 
	public String getRaza(){
		return raza;
	}
	//metodo getFechaNacimiento retorna la fecha de nacimiento de la mascota
	public String getFechaNacimiento(){
		return fechaNacimiento;
	}
        public int getId(){
            return id;
        }

    public String getDuenio() {
        return duenio;
    }
    
    public Animal getAnimal() {
        return animal;
    }
  
  
	//Se crea El constructor
    public Mascota(int id, String nombre, Animal animal, String raza, String fechaNacimiento, String foto, String duenio) {

        this.nombre = nombre;
        this.animal = animal;
        this.raza = raza;
        this.foto = foto;
        this.duenio = duenio;
        this.fechaNacimiento = fechaNacimiento;
        this.id = id;
    }
  @Override
  public String toString(){
    return "ID: " + id + "\nNombre: "+nombre+ "\nEs perro: " + EsPerro + "\nRaza: " + raza + "\nFecha de Nacimiento: " + fechaNacimiento + "\nFoto: "+ foto + "Dueño: " + duenio; 
  }
  
  public static ArrayList<Mascota> cargarMascotas() {
        ArrayList<Mascota> mascotas = new ArrayList<>();
        //InputStream input = new FileInputStream("src/main/resources/com/mycompany/avancep/files/"+ "mascotas.csv");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/com/mycompany/avancep/files/"+ "mascotas.csv")))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] datos = line.split(";");
                int id = Integer.valueOf(datos[0]);
                Mascota m = new Mascota(id, datos[1], Animal.valueOf(datos[2].toUpperCase()), datos[3], datos[4], datos[5], datos[6]);
                //System.out.println("Mascota" + m);
                mascotas.add(m);
                line = br.readLine();
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return mascotas;

    }
  
}

