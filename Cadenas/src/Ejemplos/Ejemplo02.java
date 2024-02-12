package Ejemplos;

public class Ejemplo02 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa");
	
		char caracteres[] = {'M','u','n','d','o',' ','J','a','v','a'};
		System.out.println("\nArray de char");
		for (int i =0; i<caracteres.length; i++) {
			System.out.print(caracteres[i]);
		}
		System.out.println("\n\nCadena de caracteres");
								// 6 es el indice y 4 la cantidad
		String cadena = new String(caracteres,6,4); 
		for (int i =0; i<cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
		}
		System.out.println("\n\nFin del programa");

	}
}
