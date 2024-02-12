package Ejemplos;

import java.util.Scanner;

public class replace3 {

	public static Scanner teclado = new Scanner (System.in);
		public static void main (String[]arvs) {
			System.out.println("Inicio del programa");
			
			System.out.print("Introduce un texto: ");
			String texto = teclado.nextLine();
			
			
			String resultado = remplazarTexto(texto);
			System.out.println("El texto procesado es:\n"+resultado);
		
			
			System.out.println("Fin del programa");
			teclado.close();

		}

		
		public static String remplazarTexto(String texto) {		
			String terminos ="pirata@marketing@amnistia";
			
			String [] palabras = terminos.split("@");
			
			for (int i =0; i<palabras.length;i++) {
				texto = texto.replaceAll(palabras[i], "***");				
			}
			
			return texto;
		}
	}
