package Ejercicio10;

import java.util.Scanner;

public class Principal {
	
		public static void main (String []arvs) {
		
			System.out.println("Inicio del programa\n\nInserte una flor que usted desee\n-----------");
			
			Scanner teclado = new Scanner (System.in);
			System.out.print("Flor: ");
			String flor = teclado.nextLine().trim();
	
			boolean resultado = Fichero.insertar(flor);
			
			if (resultado) {
				System.out.println("Insertado existosamente. ");
			}else{
			System.out.println("Ha ocurrido un error... ");

			}
			System.out.println("\nFin del programa");
			teclado.close();
		}	
	
}
