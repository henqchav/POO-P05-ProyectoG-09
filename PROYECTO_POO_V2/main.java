import modelo.*;
import java.util.Scanner;
import java.util.*;

class Main {
  
  public static ArrayList<Duenio> listduenios = new ArrayList();
  public static ArrayList<Mascota> listmascotas = new ArrayList();

  static Scanner sc = new Scanner (System.in);
  public static ArrayList<Concurso> concursos = new ArrayList();
      
  public static ArrayList<Ciudad> ciudades = new ArrayList();
  public static ArrayList<Auspiciante> auspiciantes = new ArrayList();


  public static void main(String[] args) {

    //Scanner sc = new Scanner (System.in);
  int seleccion = 0;
  //creo los menus para cada una de las opciones que voy a tener que elegir
  do {
    System.out.println("\n\nU ´ᴥ` U--FUNDACION AMIGOS PELUDOS EC --ฅ^•ﻌ•^ฅ");
    System.out.println("*********MENU*********\nElija una de las opciones que se muestra en pantalla");
    System.out.println("\n 1.Administrar Concursos");
		System.out.println("\n 2.Administrar Dueños");
    System.out.println("\n 3.Administrar Mascotas");
		System.out.println("\n 4.Salir");
    System.out.print("\nIngrese Opción: ");
		seleccion = sc.nextInt();
    switch(seleccion){
      //ESTO ES PARA EL CASO DE ADMINISTRACION DE CONCURSOS
      case 1:
      int AdministrarConcursos = 0;
      do{
        System.out.println("\n ENTRANDO A LA ADMINISTRACION DE CONCURSOS.....\n\n*********ADMINISTRACION DE CONCURSOS*********");
        System.out.println("\n 1.Crear concurso");
		    System.out.println("\n 2.Inscribir participante");
        System.out.println("\n 3.Regresar al menú principal");
        System.out.print("\nIngrese Opción: ");
		    AdministrarConcursos = sc.nextInt();
        switch(AdministrarConcursos){
          case 1:
            crearCorcurso();
            System.out.print("\nXDD");
          break;
          case 2:
            inscribirParticipante();
            System.out.print("\nXDD");

          break;
          
          default: // este queda por default en plan... no lleva nada, queda por defecto
          System.out.println("\n 3.Regresando al menú principal....");
          break;
        }

      }while(AdministrarConcursos < 3);
      break;
      //esto es para la opcion de administrar a los dueños
      case 2:
      int AdministrarDuenios = 0;
      do{
        System.out.println("\n ENTRANDO A LA ADMINISTRACION DE DUEÑOS.....\n\n*********ADMINISTRACION DE DUEÑOS*********");
        System.out.print("\nLista de dueños");
        for (int l=0;l<listduenios.size();l++){
          System.out.println("\nNombre: "+listduenios.get(l).getNombre()+" Cedula: "+listduenios.get(l).getCedula());
        }

        System.out.println("\n 1.Crear dueño");
		    System.out.println("\n 2.Editar dueño");
        System.out.println("\n 3.Regresar al menú principal");
        System.out.print("\nIngrese Opción: ");
		    AdministrarDuenios = sc.nextInt();
        switch(AdministrarDuenios){
          case 1:
          System.out.println("\n*******CREACION DUEÑO*******");
          System.out.print("Ingrese el numero de cedula (ID): ");
          String ced = sc.next();
          System.out.print("Ingrese los nombres: ");
          String n = sc.next();
          System.out.print("Ingrese los apellidos: ");
          String ape = sc.next();
          System.out.print("Ingrese la direccion: ");
          String d = sc.next();
          System.out.print("Ingrese el telefono: ");
          String t = sc.next();
          System.out.print("Ingrese la ciudad: ");
          String ciu = sc.next();
          System.out.print("Ingrese el email: ");
          String e = sc.next();
          System.out.print("Ingrese el codigo: ");
          String cod = sc.next();
          Duenio duenio = new Duenio(n, d, t, ciu, e, cod, ced, ape);
          listduenios.add(duenio);
            //aqui va el codigo de lo que tiene que pasar para crear dueño
          System.out.print("\nDueño agregado :)");
          break;
          case 2:
          System.out.print("\n******EDITAR DUEÑO******");
          System.out.print("\nIngrese el ID del dueño a editar: ");
          String cedula = sc.next();
          int editarDueño = 0;
          for (int i=0;i<listduenios.size();i++){
            if ((listduenios.get(i).getCedula()).equals(cedula)){
              System.out.println("\n 1.Dirección");
              System.out.println("\n 2.Ciudad");
              System.out.println("\n 3.Email");
              System.out.println("\n 4.Telefono");
              System.out.println("\n 5.Codigo");
              System.out.print("Que desea editar: ");
              editarDueño = sc.nextInt();
              switch(editarDueño){
                case 1:
                System.out.print("\nIngrese la nueva direccion: ");
                String dir = sc.next();
                listduenios.get(i).setDireccion(dir);
                System.out.println("Se actualizo la direccion del dueño"+listduenios.get(i));
                break;
                case 2:
                System.out.print("Ingrese la nueva ciudad: ");
                String ciudad = sc.next();
                listduenios.get(i).setCiudad(ciudad);
                System.out.print("Se actualizo la ciudad del dueño"+listduenios.get(i));
                break;
                case 3:
                System.out.print("Ingrese el nuevo Email: ");
                String em = sc.next();
                listduenios.get(i).setEmail(em);
                System.out.print("Se actualizo el email del dueño"+listduenios.get(i));
                break;
                case 4:
                System.out.print("Ingrese el nuevo telefono: ");
                String tel = sc.next();
                listduenios.get(i).setTelefono(tel);
                System.out.print("Se actualizo el telefono del dueño"+listduenios.get(i));
                break;
                case 5:
                System.out.print("Ingrese el nuevo codigo: ");
                String codi = sc.next();
                listduenios.get(i).setCodigo(codi);
                System.out.print("Se actualizo el codigo del dueño"+listduenios.get(i));
                break;
              }
            }
          }
          
          //aqui va el codigo de lo que tiene que pasar para editar al dueño
            System.out.print("\nSe actualizaron los datos");

          break;
          
          default: // este queda por default en plan... no lleva nada, queda por defecto
          System.out.println("\n 3.Regresando al menú principal....");
          break;
        }

      }while(AdministrarDuenios < 3);
      break;
      //esto es para la opcion de administrar a las mascotas
      case 3:
      int AdministrarMascotas = 0;
      do{
        System.out.println("\n ENTRANDO A LA ADMINISTRACION DE MASCOTAS.....\n\n*********ADMINISTRACION DE MASCOTAS*********");
        System.out.println(listmascotas);
        System.out.println(listduenios);
        System.out.println("\n 1.Crear mascota");
		    System.out.println("\n 2.Eliminar mascota");
        System.out.println("\n 3.Regresar al menú principal");
        System.out.print("\nIngrese Opción: ");
		    AdministrarMascotas = sc.nextInt();
        switch(AdministrarMascotas){
          case 1:
          //lista de las mascotas existentes

          //Crear mascota
          
          System.out.print("\n*********CREACION DE MASCOTA*********");
          int id = 0;
          String nega = "S";
          do { 
            id += 1;
            
            System.out.print("\nel id "+ (id) + " se le a asignado autmomaticamente");
            System.out.print("\nIngrese el nombre:");
            String nombre = sc.next();
            System.out.print("\nPerro o gato:");
            String pog = sc.next();
            System.out.print("\nIngrese la raza:");
            String raza = sc.next();
            System.out.print("\nIngrese la fecha de nacimiento:");
            String fechaNacimiento = sc.next();
            System.out.print("\nIngrese foto de la mascota: ");
            String foto = "";
            String ced = "";
            for (int i=0;i<listduenios.size();i++){
              
              String num = String.valueOf(i);
              while (ced != num){
                System.out.print("\nIngrese el numero de cedula del dueño: ");
                ced = sc.next();
                if(ced == listduenios.get(i).getCedula()){
                  ced = listduenios.get(i).getNombre();
                  System.out.println(ced);
                 }
                else{
                  System.out.println("EL USUARIO NO ESTA REGISTRADO");
                  System.out.println(ced);
                }
              }                              
            }
            
            Mascota mascota = new Mascota( nombre, pog, raza, fechaNacimiento, foto, ced);
            listmascotas.add(mascota);
            System.out.print("\nDesea ingresar otra mascota?(S/N): ");
            nega = sc.next();
            
          }while(nega == "S");
           
            
          break;
          case 2:
          //aqui va el codigo de lo que tiene que pasar para eliminar la mascota
            System.out.print("\nXDD");

          break;
          
          default: // este queda por default en plan... no lleva nada, queda por defecto
          System.out.println("\n 3.Regresando al menú principal....");
          break;
        }

      }while(AdministrarMascotas < 3);
      break;
      default: // este queda por default en plan... no lleva nada, queda por defecto
          System.out.println("\n SALIENDO......\n\nSALIDA EXITOSA");
      break;


    }
  }while(seleccion <= 3);
  }

//crear concurso
  public static void crearCorcurso(){
      //1ero Se ide datos al usuario
      //String nombre, String fechaEvento, String horaEvento, String inicioInscripcion, String cierreInscripcion, String ciudad, String lugar, ArrayList<Premio> premios, String auspiciantes, Animal animal
      System.out.println("Creacion del concurso... Ingrese los siguientes datos!!");
      System.out.println("Ingrese Nombre:");
      String nombre= sc.nextLine();
      System.out.println("Ingrese Fecha Evento");
      String fechaEvento= sc.nextLine();
      System.out.println("Ingrese Hora Evento:");
      String horaEvento= sc.nextLine();
      System.out.println("Ingrese Inicio Inscripcion:");
      String inicioInscripcion= sc.nextLine();
      System.out.println("Ingrese Cierre Inscripcion:");
      String cierreInscripcion= sc.nextLine();
      
      
      //este for es para mostrar las ciudades
      for(Ciudad city: ciudades){
          System.out.println("Estan son las ciudades disponibles:");
          System.out.println(city.toString()+"\n");    
      }
      
      //se pide el codigo de la ciudad
      System.out.println("Ingrese el codigo de la ciudad a elegir:");
      String codigoCiudad= sc.nextLine();
      
      Ciudad city= null;
      //este for es para elegir la ciudad y guardarla en la variable city
      for(Ciudad ciudad: ciudades){
          if(ciudad.getCodigo().equals(codigoCiudad)){
              city= ciudad;
          }
      }
      
      
      System.out.println("Ingrese Lugar:");
      String lugar= sc.nextLine();
      
      //creamos lista de premios
      //modificador tipo               nombre = NEW tipo-Constructos();
                    ArrayList<Premio> premios = new ArrayList<>();
      
      //String nivel, float monto, String adicional
      System.out.println("Ingrese los Premios para el concurso:");
      System.out.println("Monto de premio (1er Lugar)");
      float monto= sc.nextFloat();
      sc.nextLine();
      System.out.println("Ingrese productos para 1er Lugar");
      String adicional= sc.nextLine();
      //creamos un objeto Premio y guadamo los datos aqui
      Premio primerLugar= new Premio("1er Lugar",monto,adicional);
      premios.add(primerLugar);//agregando el premio 1er lugar a la lista premios
      
      System.out.println("Monto de premio (2do Lugar)");
      float monto2= sc.nextFloat();
      sc.nextLine();
      System.out.println("Ingrese productos para 2do Lugar");
      String adicional2= sc.nextLine();
      //creamos un objeto Premio y guadamo los datos aqui
      Premio segundoLugar= new Premio("2do Lugar",monto2,adicional2);
      premios.add(segundoLugar);
      
      System.out.println("Monto de premio (3er Lugar)");
      float monto3= sc.nextFloat();
      sc.nextLine();
      System.out.println("Ingrese productos para 3er Lugar");
      String adicional3= sc.nextLine();
      //creamos un objeto Premio y guadamo los datos aqui
      Premio tercerLugar= new Premio("3er Lugar",monto3,adicional3);
      premios.add(tercerLugar);
      

      
       //este for es para mostrar los auspiciantes
      for(Auspiciante auspiciante: auspiciantes){
          System.out.println("Estan son los auspiciantes disponibles:");
          System.out.println(auspiciante.toString()+"\n");    
      }
      
      //se pide el codigo del auspiciantes a elegir
      System.out.println("Ingrese codigo de los auspiciantes a elegir:");
      String codigoAuspiciante= sc.nextLine();
      
      Auspiciante auspicia= null;
      //este for es para elegir la ciudad y guardarla en la variable city
      for(Auspiciante auspiciante: auspiciantes){
          if(auspiciante.getCodigo().equals(codigoAuspiciante)){
              auspicia= auspiciante;
          }
      }

      
      System.out.println("Indique el tipo de mascota para el concurso (Perro o Gato):");
      String animal= sc.nextLine();
      
      Animal mascota = null;
      if(animal.toUpperCase().equals(Animal.PERRO)){
          mascota= Animal.PERRO;
      }else if(animal.toUpperCase().equals(Animal.GATO)){
          mascota= Animal.GATO;
      }
     
      System.out.println("El concurso estara abierto (Si o No):");
      String siEstaAbierto= sc.nextLine();
      boolean abierto=false;
      if(siEstaAbierto.toLowerCase().equals("si")){
          abierto=true;
      }
      //creamos un objeto concurso y guadamo los datos aqui
      //tipo               nombre = NEW tipo-Constructos();
      Concurso concurso = new Concurso(nombre, fechaEvento, horaEvento, inicioInscripcion, cierreInscripcion, city, lugar, premios, auspicia, mascota, abierto);
      concursos.add(concurso);
  }
  
  public static void inscribirParticipante(){
      //mostrar los concuraos
      for (Concurso challenge : concursos){
          if(challenge.isAbierto()){
              System.out.println(challenge.toString()+"\n");
          }
      }
      
      //solicitar el codigo del concurso (descripcion del concurso enla clase concurso)
      System.out.println("Ingrese el codigo del concurso):");
      int codigoConcurso=sc.nextInt();
      sc.nextLine();
         
      System.out.println("Ingrese el codigo de la mascota):");
      int codigoMascota=sc.nextInt();
      sc.nextLine();
      /*
      Mascota pet=null;
      for(Mascota mascota: listmascotas){
          if(mascota.getId().equals(codigoMascota)){
              pet= mascota;
          }
      }
      
      //obtener el concurso y agregar participante
      for(Concurso concurso: concursos){
          if(concurso.getCodigo() == codigoConcurso){
              concurso.getMascotasInscritas().add(pet);
          }
      }
      
  }
  
  //para mostrar los ganadores de un concurso en especifico
  public static void mostrarGanadores(int codigoConcurso){
      //mostrar los concuraos
      for(Concurso concurso: concursos){
          if(concurso.getCodigo() == codigoConcurso){
              for(Mascota mascota: concurso.getGanadores()){
                  System.out.println(mascota.toString()+"\n");//mostrando las mascotas ganadoras
              }
          }
      }
  }

}
*/
