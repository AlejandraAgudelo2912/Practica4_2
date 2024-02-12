package Practica5;

public class Ejercicio07 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa.\n");

		String palabras="JVM,Java,Oracle";
		String texto="Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		
		String resultado = reemplazaPalabras(texto,palabras);
		System.out.println("Enunciado: "+texto+"\n\nTérminos prohibidos: "+palabras+"\n\nResultado: "+resultado);
		System.out.println("\nFin del rpopgrama.");

	}
	public static String reemplazaPalabras(String texto,String palabras) {
		
		String []palabra = palabras.split(",");
		
		 for (int i =0; i<palabra.length;i++) {
			 String a =palabra[i];
	         String censura = "*".repeat(a.length());
	         texto =texto.replaceAll(a,censura );
	     }
		
		
		return texto;
	}
}
