import Dueno.java
public class Mascota{
	private String nombre; //Nombre de la mascota
	private boolean EsPerro; //es perro o gato
	private String raza; //Raza del perro
	private String fechaNacimiento; //Fecha de nacimiento de la mascota
	private String foto; //Foto de la mascota
	private String Dueno; //Dueño de la mascota

	//metodo getNombre retorna el nombre de la mascota
	public String getNombre(){
		return nombre;
	}
	//metodo setNombre asigna un nombre a la mascota
	public void setNombre(String n){
		nombre=n;
	}
	//metodo getRaza retorna la raza de la mascota 
	public String getRaza(){
		return raza;
	}
	//metodo setRaza asigna una raza a la mascota
	public void setRaza(String r){
		raza=r
	}
	//metodo getFechaNacimiento retorna la fecha de nacimiento de la mascota
	public String getFechaNacimiento(){
		return fechaNacimiento;
	}
	//metodo setFechaNacimiento asigna una fecha de nacimiento a la mascota
	public void setFechaNacimiento(String f){
		fechaNacimiento=f
	}

	//Se crea la mascota
	public Mascota(String nombre,boolean EsPerro,String raza,String foto,String dueno){
		this.nombre=nombre;
		this.EsPerro=EsPerro;
		this.raza=raza;
		this.foto=foto;
		this.dueno=dueno;
	}

}
