package Ejercicio05;

public class Utilidades {
	
	
	public static void main(String []arvs) {
	String	texto = "hola me llamo jesus";
	String encriptado = encripta(texto);
	System.out.println(encriptado);
	
	String	texto1 = "defgh";
	String encriptado1 = desencripta(texto1);
	System.out.println(encriptado1);

	}
public static String encripta(String texto) {
	String s ="";
	for (int i =0; i<texto.length();i++) {
		char c = texto.charAt(i);
		int a = c;
		a =a+3;
		c = (char) a;;
		s+= Character.toString(c);
	}
	return s;
}
public static String desencripta(String texto) {
	String s ="";
	for (int i =0; i<texto.length();i++) {
		char c = texto.charAt(i);
		int a = c;
		a =a-3;
		c = (char) a;;
		s+= Character.toString(c);
	}
	return s;
}
}
