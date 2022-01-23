package com.mycompany.avancep.modelo;

import java.util.ArrayList;

public class Concurso{
    private String nombre; //Nombre del concurso
    private String fechaEvento; //Fecha del evento
    private String horaEvento; //hora del evento
    private String inicioInscripcion; //Fecha inicio de inscripcion
    private String cierreInscripcion; //Fecha Cierre de inscripcion
    private Ciudad ciudad; //Nombre de la ciudad
    private String lugar; //Nombre del lugar
    private ArrayList<Premio> premios; //Premios segun los puestos de los ganadores
    private Auspiciante auspiciante; //Nombre de los auspiciantes
    private Animal animal; //Si es perro o gato
    
    private boolean abierto;
    private static int codigo; // es secuancial el codigo

    private ArrayList<Mascota> mascotasInscritas;
    private ArrayList<Mascota> ganadores;
            
    public Concurso(String nombre, String fechaEvento, String horaEvento, String inicioInscripcion, String cierreInscripcion, Ciudad ciudad, String lugar, ArrayList<Premio> premios, Auspiciante auspiciante, Animal animal, boolean abierto ) {
        this.nombre = nombre;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.inicioInscripcion = inicioInscripcion;
        this.cierreInscripcion = cierreInscripcion;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.premios = premios;
        this.auspiciante = auspiciante;
        this.animal = animal;
        
        //el codigo es secuancial
        codigo++;
        
        
        this.abierto= abierto;
        mascotasInscritas= new ArrayList();
        
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public ArrayList<Premio> getPremios() {
        return premios;
    }


    public Auspiciante getAuspiciantes() {
        return auspiciante;
    }

    public Animal getAnimal() {
        return animal;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Mascota> getMascotasInscritas() {
        return mascotasInscritas;
    }

    public Auspiciante getAuspiciante() {
        return auspiciante;
    }

    public ArrayList<Mascota> getGanadores() {
        return ganadores;
    }

    
    
    @Override
    public String toString() {
        String cadena= "Concurso: \n" +
                "nombre=" + nombre + "\n"+
                "fechaEvento=" + fechaEvento + "\n"+
                " horaEvento=" + horaEvento + "\n"+
                "inicioInscripcion=" + inicioInscripcion +  "\n"+
                "cierreInscripcion=" + cierreInscripcion +  "\n"+
                " ciudad=" + ciudad.toString() + "\n"+ 
                " lugar=" + lugar + "\n"+
                " auspiciantes=" + auspiciante.toString() +"\n"+
                " animal=" + animal +  "\n"+
                " abierto=" + abierto +  "\n"+
                " codigo=" + codigo;

        for (Premio premio: premios){
             cadena= cadena+ premio.toString() + "\n";
        }

        return cadena;
        
    }


    public void mostrarMarcotas(){
        for(Mascota mascota: mascotasInscritas){
            System.out.println(mascota.toString()+"\n");
        }
    }  

    
}
