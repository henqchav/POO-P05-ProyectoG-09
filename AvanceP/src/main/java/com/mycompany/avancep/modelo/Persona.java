package modelo;

public abstract class Persona{
  private String nombre;
  private String direccion;
  private String telefono;
  private String ciudad;
  private String email;
  private String codigo;
  //getters
  public String getNombre(){
    return nombre;
  }
  public String getDireccion(){
    return direccion;
  }
  public void setDireccion(String d){
		direccion=d;
	}
  public String getTelefono(){
    return telefono;
  }
  public void setTelefono(String t){
		telefono=t;
	}
  public String getCiudad(){
    return ciudad;
  }
  public void setCiudad(String ciu){
		ciudad=ciu;
	}
  public String getEmail(){
    return email;
  }
  public void setEmail(String e){
		email=e;
	}
  public String getCodigo(){
    return codigo;
  }
  public void setCodigo(String cod){
		codigo=cod;
	}
  //constructor de Persona
  public Persona(String n, String d, String t, String ciu,String e, String cod){
    this.nombre = n;
    this.direccion = d;
    this.telefono = t;
    this.ciudad = ciu;
    this.email = e;
    this.codigo = cod;
  }
  @Override
  public String toString(){
    return "nombre: " + nombre + "\ndirección: " + direccion + "\ntelefono: " + telefono +"\n ciudad: "+ ciudad + "\n email: "+ email + "\n codigo" + codigo;
    

  }


}