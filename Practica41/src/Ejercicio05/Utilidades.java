package Ejercicio05;

public class Utilidades {
	
	
	public static void main(String []arvs) {
	String	texto = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
	String encriptado = encripta(texto);
	System.out.println("Texto original: "+texto+"\nTexto encriptado: " +encriptado);


	}
	public static String encripta(String texto) {
		String s ="";
		for (int i =0; i<texto.length();i++) {
			char c = texto.charAt(i);
			int a = c;
			if (a==122||a==120||a==121) {
				if (a==122) {
					a=96;
				}else if (a==120) {
				a=94;
				}else {
					a=95;
				}
				
			}
			a =a+3;
			c = (char) a;
			
			String b =Character.toString(c);
			if (b.equals("#")) {
				b=" ";
			}
			
			s+= b;
			
		}
		return s;
	}


}
