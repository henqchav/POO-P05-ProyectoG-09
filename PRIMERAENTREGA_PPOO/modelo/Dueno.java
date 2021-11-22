package modelo;
public class Dueno{
	private cedula; //Cedula de identidad del dueño
	private nombres; //Nombres del dueño
	private apellidos; //Apellidos del dueño
	private direccion; //Direccion del dueño
	private telefono; //Telefono del dueño
	private ciudad; //ciudad en la que se encuentra el dueño
	private Email; //Email del dueño

	//metodo getCedula retorna la cedula del dueño
	public String getCedula(){
		return cedula;
	}
	//metodo setCedula asgina la cedula al dueño
	public void setCedula(String c){
		cedula=c
	}
	//metodo getNombres retorna los nombres del dueño
	public String getNombres(){
		return nombres;
	}
	// el metodo setNombres asigna unos nombres al dueño
	public void setNombres(String n){
		nombres=n
	}
	//metodo getApellidos retorna los apellidos del dueño
	public String getApellidos(){
		return apellidos;
	}
	//metodo setApellidos retorna los apellidos del dueño
	public void setApellidos(String a){
		apellidos=a
	}
	//metodo getDireccion retorna la direccion del dueño
	public String getDireccion(){
		return direccion;
	}
	//metodo setDireccion asigna una direccion al dueño
	public void setDireccion(String d){
		direccion=d;
	}
	//metodo getTelefono retorna el telefono del dueño
	public String getTelefono(){
		return telefono;
	}
	//metodo setTelefono asigna un telefono al dueño
	public void setTelefono(String t){
		telefono=t;
	}
	//metodo getCiudad retorna la ciudad del dueño
	public String getCiudad(){
		return ciudad;
	}
	//metodo setCiudad asigna una ciudad al dueño
	public void setCiudad(String ciu){
		ciudad=ciu;
	}
	//metodo getEmail retorna el email del dueño
	public String getEmail(){
		return email;
	}
	//metodo setEmail asigna un email al dueño
	public void setEmail(String e){
		email=e;
	}
	public Dueno(String cedula,String nombres,String apellidos, String direccion,String telefono,String ciudad,String email){
		this.cedula=cedula;
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.telefono=telefono;
		this.ciudad=ciudad;
		this.email=email;
	}

}

