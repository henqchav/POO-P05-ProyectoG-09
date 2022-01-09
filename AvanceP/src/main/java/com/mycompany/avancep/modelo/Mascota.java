package modelo;
public class Mascota{
	private String nombre; //Nombre de la mascota
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
  
  
	//Se crea El constructor
	public Mascota(String nombre,String EsPerro,String raza, String fechaNacimiento,String foto,String duenio){

		this.nombre=nombre;
		this.EsPerro=EsPerro;
		this.raza=raza;
		this.foto=foto;
		this.duenio=duenio;
    //tienes razon
    id++;

	}
  @Override
  public String toString(){
    return "ID: " + id + "\nNombre: "+nombre+ "\nEs perro: " + EsPerro + "\nRaza: " + raza + "\nFecha de Nacimiento: " + fechaNacimiento + "\nFoto: "+ foto + "Dueño: " + duenio; 
  }
}

