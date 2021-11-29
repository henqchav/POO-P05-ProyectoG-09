import modelo.*;
import java.util.Scanner;

class Main {


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
        System.out.println("\n 1.Crear dueño");
		    System.out.println("\n 2.Editar dueño");
        System.out.println("\n 3.Regresar al menú principal");
        System.out.print("\nIngrese Opción: ");
		    AdministrarDuenios = sc.nextInt();
        switch(AdministrarDuenios){
          case 1:
            //aqui va el codigo de lo que tiene que pasar para crear dueño
            System.out.print("\nXDD");
          break;
          case 2:
          //aqui va el codigo de lo que tiene que pasar para editar al dueño
            System.out.print("\nXDD");

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
