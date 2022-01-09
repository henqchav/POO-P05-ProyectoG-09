package modelo;
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
  

}