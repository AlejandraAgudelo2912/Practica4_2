package Practica5;

public class Ejercicio05 {
	public static void main (String []arvs) {
		System.out.println("Inicio del programa.\n");
		
		String a ="Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
		
		
		String b =  pasarMayusculaSubCadena(a);
		System.out.println("Texto normal: "+a+"\n\nTexto formateado: "+b);
		System.out.println("\nFin del programa.");
	}
	public static String  pasarMayusculaSubCadena(String a) {
		StringBuilder s = new StringBuilder();
		
		s.append(a);
		System.out.println(s.indexOf("<mayus>"));
		while (s.indexOf("<mayus>")!=-1&&s.indexOf("</mayus>") != -1) {
            String c = s.substring(s.indexOf("<mayus>")+"<mayus>".length(), s.indexOf("</mayus>"));
            c = c.toUpperCase();
            s.replace(s.indexOf("<mayus>"), s.indexOf("</mayus>")+"</mayus>".length(), c);
        }
				
		return s.toString();
	
	}
}
