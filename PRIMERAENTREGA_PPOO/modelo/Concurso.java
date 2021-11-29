package modelo;

import java.util.ArrayList;

public class Concurso{
    private String nombre; //Nombre del concurso
    private String fechaEvento; //Fecha del evento
    private String horaEvento; //hora del evento
    private String inicioInscripcion; //Fecha inicio de inscripcion
    private String cierreInscripcion; //Fecha Cierre de inscripcion
    private String ciudad; //Nombre de la ciudad
    private String lugar; //Nombre del lugar
    private ArrayList<Premio> premios; //Premios segun los puestos de los ganadores
    private String auspiciantes; //Nombre de los auspiciantes
    private Animal animal; //Si es perro o gato
    
    private boolean abierto;
    private String codigo;

    public Concurso(String nombre, String fechaEvento, String horaEvento, String inicioInscripcion, String cierreInscripcion, String ciudad, String lugar, ArrayList<Premio> premios, String auspiciantes, Animal animal, boolean abierto ) {
        this.nombre = nombre;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.inicioInscripcion = inicioInscripcion;
        this.cierreInscripcion = cierreInscripcion;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.auspiciantes = auspiciantes;
        this.animal = animal;
        
        //el codigo sera las dos primeras letras de las palabras del nombre dle concurso
        String[] palabras= nombre.split(" ");
        for(String palabra: palabras){
            this.codigo= this.codigo+ palabra.substring(0, 2);
        }
        
        this.abierto= abierto;
        
    }



    public String getNombre() {
        return nombre;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public String getInicioInscripcion() {
        return inicioInscripcion;
    }

    public String getCierreInscripcion() {
        return cierreInscripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public ArrayList<Premio> getPremios() {
        return premios;
    }


    public String getAuspiciantes() {
        return auspiciantes;
    }

    public Animal getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Concurso: \n" +
                "nombre=" + nombre + "\n"+
                "fechaEvento=" + fechaEvento + "\n"+
                " horaEvento=" + horaEvento + "\n"+"inicioInscripcion=" + inicioInscripcion + ", cierreInscripcion=" + cierreInscripcion + ", ciudad=" + ciudad + ", lugar=" + lugar + ", premios=" + premios + ", auspiciantes=" + auspiciantes + ", animal=" + animal + ", abierto=" + abierto + ", codigo=" + codigo + '}';
    }


        

}

