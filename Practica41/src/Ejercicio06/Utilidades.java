package Ejercicio06;

public class Utilidades {
	
	
	public static void main(String []arvs) {
	String	texto = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
	String encriptado = encripta(texto);
	System.out.println("Texto encriptado: " +encriptado);
	
	String	texto1 = "d e f g h i j k l m n o p q r s t u v w x y z a b c";
	String encriptado1 = desencripta(texto1);
	System.out.println("Texto desencriptado: "+encriptado1);

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

	public static String desencripta(String texto) {
		String s ="";
		for (int i =0; i<texto.length();i++) {
			char c = texto.charAt(i);
	if (texto.charAt(i)==' ') {
		String b =Character.toString(c);
		s+= b;	
			}else {
			int a = c;
			if (a==99||a==98||a==97) {
				if (a==99) {
					a=125;
				}else if (a==98) {
				a=124;
				}else {
					a=123;
				}				
			}
			a =a-3;
			c = (char) a;;
			String b =Character.toString(c);
			s+= b;
			}
		}
		return s;
	}
}
