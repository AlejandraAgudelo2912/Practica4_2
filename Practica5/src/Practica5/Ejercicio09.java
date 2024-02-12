package Practica5;

public class Ejercicio09 {
	public static void main (String []arvs) {

		String texto = "Hola me llamo david";
		String clave = "clave";

		String textoEncriptado = encriptar(texto, clave);
		System.out.println("Texto encriptado: " + textoEncriptado);

	}
	public static String encriptar(String texto, String clave) {
		String encriptado ="";
		int longitud=clave.length();
		int j=0;
        for (int i = 0; i < texto.length(); i++) {
        	encriptado+=texto.charAt(i)^clave.charAt(j);
        	j++;
        	if(j>=longitud) {
        		j=0;
        	}
            
        }
        return encriptado;
    }

	
}
