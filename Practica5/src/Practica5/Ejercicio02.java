package Practica5;

public class Ejercicio02 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa\n");

		String a ="((a + b) / 5-d) ";
		boolean b = parentesisCorrectos(a);
		System.out.println("Expresion --> "+a+"\nResultado: "+b);
		
		a =")(a + b))(( ";
		b = parentesisCorrectos(a);
		System.out.println("\nExpresion --> "+a+"\nResultado: "+b);
		System.out.println("\nFin del programa");
	


	}
	public static boolean parentesisCorrectos(String a) {
		int contador =0;
		for (int i =0;i<a.length();i++) {
			if(a.charAt(i)=='(') {
				contador++;
			}else if(a.charAt(i)==')') {
				contador--;
				if(contador<0) {
					return false;
				}
			}
		}
		if(contador==0) {
			return true;
		}else {
			return false;
		}
	}
}
