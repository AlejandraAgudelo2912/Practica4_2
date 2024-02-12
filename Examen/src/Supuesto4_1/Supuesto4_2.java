package Supuesto4_1;


import java.util.Scanner;

public class Supuesto4_2 {
	public static Scanner teclado = new Scanner (System.in);

	public static void main (String[]arvs) {
		System.out.println("\nInicio del programa");

		int opcion =-1;
		do {
			System.out.print("\nMENU\n----------\n1-Ver contenido del archivo\n2-Insertar frase\n0-Salir\n");
			 opcion = Acceso.pedirInt("Seleccione una opcion:");
			 if(opcion==1) {
				 Acceso.leer();
			 }else if(opcion==2) {
				 System.out.print("Introduzca el texto: ");
				 String texto = teclado.nextLine();
				 boolean insertar = Acceso.insertar(texto);
				 if(insertar) {
					 System.out.println("Insertado correctamente.");
				 }else {
					 System.out.println("Ha ocurrido un error. Intentelo de nuevo");

				 }
			 }else if (opcion!=0){
				 System.out.println("Opcion no válida");
			 }
		}while (opcion!=0);
		
		System.out.println("\nFin del programa");

	}
}
