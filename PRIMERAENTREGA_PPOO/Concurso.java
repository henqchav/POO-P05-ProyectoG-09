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
	//metodo setNombre asgina un nombre al concurso
	public void setNombre(String n){
		nombre=n
	}

	//metodo getFechaEvento retorna la fecha del evento
	public String getFechaEvento(){
		return fechaEvento;
	}
	//metodo setFechaEvento asigna la fecha del evento al concurso
	public void setFechaEvento(String f){
		fechaEvento=f
	}
	//metodo getInicioInscripcion retorna la fecha de inicio de inscripcion
        public String getInicioInscripcion(){
                return inicioInscripcion;
        }
        //metodo setInicioInscrpcion asigna la fecha de inicio de incripcion al concurso
        public void setFechaEvento(String i){
                inicioInscripcion=i
        }
	//metodo getCierreInscripcion retorna la fecha de cierre de Inscripcion del evento
        public String getCierreInscripcion(){
                return cierreInscripcion;
        }
        //metodo setCierreInscripcion asigna la fecha de cierre de inscrpciones del concurso
        public void setCierreInscripcion(String c){
                cierreInscripcion=c
        }
	//metodo getCiudad retorna la ciudad del evento
        public String getCiudad(){
                return ciudad;
        }
        //metodo setCiudad asigna la ciudad del concurso
        public void setCiudad(String ciu){
                ciudad=ciu
        }
	//metodo getNombre retorna la fecha del evento
        public String getFechaEvento(){
                return fechaEvento;
        }
        //metodo setFechaEvento asigna la fecha del evento al concurso
        public void setFechaEvento(String f){
                fechaEvento=f
        }
	//metodo getLugar retorna el lugar del evento
	public String getLugar(){
		return lugar;
	}
	//metodo setLugar asigna el lugar del concurso
	public void setLugar(String l){
		lugar=l
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
