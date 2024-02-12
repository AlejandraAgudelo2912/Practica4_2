package Ejemplos;

import java.util.Scanner;

public class replace {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa");
		
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine();
		
		String resultado = remplazarTexto(texto);
		System.out.println("El texto procesado es:\n"+resultado);

		
		System.out.println("Fin del programa");
		teclado.close();

	}

	
	public static String remplazarTexto(String texto) {		
		String buscar = "puta";
		String remplazar = "****";
		
		texto = texto.replaceAll(buscar, remplazar);
		return texto;
	}
}
