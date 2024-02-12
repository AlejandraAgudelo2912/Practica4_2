package Practica5;

public class Ejercicio01 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa.");
		String a = "Introduccion";
		System.out.println("Texto sin invertir: "+a);
		String b = invertirTexto(a);
		System.out.println("Texto invertido: "+b);
		System.out.println("Fin del programa.");
	}
	public static String invertirTexto(String a) {
		StringBuilder s = new StringBuilder();
		s.append(a);
		s.reverse();
		return s.toString();
	}
}
