package com.mycompany.avancep.modelo;

public class Duenio extends Persona{
  private String cedula;
  private String apellido;

  public String getCedula(){
    return cedula;
  }
  //Constructor de la clase hija
  public Duenio(String n, String d, String t, String ciu,String e, String cod, String ced, String ape){
    super(n, d, t, ciu, e, cod);
    this.cedula = ced;
    this.apellido = ape;
  }
  @Override
  public String toString(){
    return super.toString() + "\ncedula: " + cedula ; 
  }
  
  
  
}