package Practica5;

public class Ejercicio04 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa");
		
		String trxto="Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días.";
		
		int a = obtenerNumeroVecesSubCadena(trxto,"en");
		
		System.out.println("\n"+trxto+"\n\nCoincidencias: "+a);
		System.out.println("\nFin del programa");

	}
	public static int obtenerNumeroVecesSubCadena(String a, String b) {
		return a.toLowerCase().split(b).length-1;
		/*int contador =0;
		for(int i =0; i<a.length();i++) {		
			if(a.indexOf(b,i)==i) {
				contador++;
			}	
		}	
		return contador;*/
	}
}
