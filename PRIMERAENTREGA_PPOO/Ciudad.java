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

}
