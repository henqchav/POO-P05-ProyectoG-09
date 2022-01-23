package com.mycompany.avancep.modelo;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

=======
>>>>>>> dc78a5d5c711f77c4559e6ddb93bcf089f7ca311
public class Duenio extends Persona{
  private String cedula;
  private String apellido;

  public String getCedula(){
    return cedula;
  }
  
  public String getApellido(){
    return apellido;
  }
  //Constructor de la clase hija
  public Duenio(int id, String ape,String n, String d, String t, String ciu,String e){
    super(n, d, t, ciu, e, id);
    this.apellido = ape;
  }
  @Override
  public String toString(){
    return super.toString() + "\ncedula: " + cedula ; 
  }
  
  
   public static ArrayList<Duenio> cargarDuenios() {
        ArrayList<Duenio> Duenios = new ArrayList<>();
        //InputStream input = new FileInputStream("src/main/resources/com/mycompany/avancep/files/"+ "mascotas.csv");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/com/mycompany/avancep/files/"+ "duenosP5.csv")))) {
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                String[] datos = line.split(",");
                int id = Integer.valueOf(datos[0]);
                Duenio d = new Duenio(id,datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
                //System.out.println("Duenio" + p);
                Duenios.add(d);
                line = br.readLine();
            }
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Duenios;

    }
  
  
  
}