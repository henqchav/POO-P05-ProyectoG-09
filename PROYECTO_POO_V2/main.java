import modelo.*;
import java.util.Scanner;
import java.util.*;
class Main {
	public static ArrayList<Duenio> listduenios = new ArrayList();
	public static ArrayList<Mascota> listmascotas = new ArrayList();
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
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
            //aqui va el codigo de lo que tiene que pasar para crear concurso
            System.out.print("\nXDD");
          break;
          case 2:
          //aqui va el codigo de lo que tiene que pasar para inscribir participante
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
        System.out.println("\n 1.Crear mascota");
		    System.out.println("\n 2.Eliminar mascota");
        System.out.println("\n 3.Regresar al menú principal");
        System.out.print("\nIngrese Opción: ");
		    AdministrarMascotas = sc.nextInt();
        switch(AdministrarMascotas){
          case 1:
            //aqui va el codigo de lo que tiene que pasar para crear mascota
            System.out.print("\nXDD");
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

}
