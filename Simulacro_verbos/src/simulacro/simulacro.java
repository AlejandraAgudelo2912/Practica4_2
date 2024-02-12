package simulacro;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class simulacro {

	public static Scanner teclado = new Scanner (System.in);
	public static void main (String[]arvs) {
	
	}
	public static String  pedirPalabras(String texto) {
		
		
		String palabra=null;
			
		do {
			System.out.println("Introduce un texto: ");
			palabra= teclado.nextLine().trim();
			
			texto = texto.replaceAll(palabra, "***");	
		}while(!palabra.equalsIgnoreCase("terminar"));
		
		
		
		return texto;
	}
	
	public static void remplazarTexto(String texto) {		
		
		String ruta = "./output/"+Long.toString(System.currentTimeMillis()) + ".txt";

		
        //LocalDateTime hoy = LocalDateTime.now();  
        
        //String ruta = "./output/"+hoy.getHour()+":"+hoy.getMinute()+":"+hoy.getSecond()+" "+hoy.getDayOfMonth()+":"+hoy.getMonth()+":"+hoy.getYear()+".txt";
	
		
		try {
            FileWriter writer = new FileWriter(ruta);

            writer.write(texto);

            writer.close();

            System.out.println("Se ha creado el archivo \"" + ruta + "\" con éxito.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar crear el archivo: " + e.getMessage());
        }
				
	}
	
	
}
