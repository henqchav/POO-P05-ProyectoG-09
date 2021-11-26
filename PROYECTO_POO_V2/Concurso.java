package modelo;
public class Concurso{
	private String nombre; //Nombre del concurso
	private String fechaEvento; //Fecha del evento
	private String HoraEvento; //hora del evento
	private String inicioInscripcion; //Fecha inicio de inscripcion
	private String cierreInscrpcion; //Fecha Cierre de inscripcion
	private String ciudad; //Nombre de la ciudad
	private String lugar; //Nombre del lugar
	private String premios; //Premios segun los puestos de los ganadores
	private String auspiciantes; //Nombre de los auspiciantes
	private boolean EsPerro; //Si es perro o gato

	//metodo getNombre retorna el nombre del concurso
	public String getNombre(){
		return nombre;
	}
	//metodo getFechaEvento retorna la fecha del evento
	public String getFechaEvento(){
		return fechaEvento;
	}
	//metodo getInicioInscripcion retorna la fecha de inicio de inscripcion
        public String getInicioInscripcion(){
                return inicioInscripcion;
        }
	//metodo getCierreInscripcion retorna la fecha de cierre de Inscripcion del evento
        public String getCierreInscripcion(){
                return cierreInscripcion;
        }
	//metodo getCiudad retorna la ciudad del evento
        public String getCiudad(){
                return ciudad;
        }
	//metodo getNombre retorna la fecha del evento
        public String getFechaEvento(){
                return fechaEvento;
        }
	//metodo getLugar retorna el lugar del evento
	public String getLugar(){
		return lugar;
	}
	
	public Concurso(String nombre,String fechaEvento,String horaEvento,String inicioInscripcion,String cierreInscripcion,String ciudad,String lugar,String premios,String Auspiciantes,boolean EsPerro){
		this.nombre=nombre;
		this.fechaEvento=fechaEvento;
		this.horaEvento=horaEvento;
		this.inicioInscripcion=inicioInscripcion;
		this.cierreInscripcion=cierreInscripcion;
		this.ciudad=ciudad;
	}
}
