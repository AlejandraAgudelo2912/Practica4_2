package Practica5;

public class Ejercicio06 {
	 public static void main(String[] arvs) {
	        System.out.println("Inicio del programa"); 

	        String texto = "Introducción";
	       
	        String result = padRight(texto, '*', 20);
	        System.out.println("\nTexto: "+texto+"\nResultado: "+result); 
	        System.out.println("\nFin del programa"); 

	    }
	    
	 public static String padRight(String texto, char c, int n) {
	        
		 StringBuilder stringBuilder = new StringBuilder(texto);
		 if (texto.length() >= n) {
			 return texto;
	     }
	        
	     for (int i = 0; i <n - texto.length(); i++) {
	    	 stringBuilder.append(c);
	     }
	        
	     return stringBuilder.toString();
	 }
}
