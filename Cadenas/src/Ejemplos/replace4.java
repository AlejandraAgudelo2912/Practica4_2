package Ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class replace4 {

	public static Scanner teclado = new Scanner (System.in);
		public static void main (String[]arvs) {
			System.out.println("Inicio del programa");
			
			String texto = leerFichero();
			System.out.println(texto);

			String palabras =pedirPalabras(texto);
			
			remplazarTexto(palabras);
			
			
			
			//llama a un metodo que habra el fichero y devuelva todo su contenido y lo reocgemos en un String
		
			//pedimos en bucle al usuario que indique que palbras queremos censurar hasta que escribamos terminar
			
			//posteriormente mandamos el texto a un metodo que lo inserte en un ficheroque se genere con un nombre compuesto por la fecha u hora actual o los milisegundos de la fecha
			
			System.out.println("Fin del programa");
			teclado.close();

		}

		
		public static void remplazarTexto(String texto) {		
		
			//String ruta = "./output/"+Long.toString(System.currentTimeMillis()) + ".txt";

			
	        LocalDateTime hoy = LocalDateTime.now();  
	        
	        String ruta = "./output/"+hoy.getHour()+":"+hoy.getMinute()+":"+hoy.getSecond()+" "+hoy.getDayOfMonth()+":"+hoy.getMonth()+":"+hoy.getYear()+".txt";
		
			
			try {
	            FileWriter writer = new FileWriter(ruta);

	            writer.write(texto);

	            writer.close();

	            System.out.println("Se ha creado el archivo \"" + ruta + "\" con éxito.");

	        } catch (IOException e) {
	            System.out.println("Ocurrió un error al intentar crear el archivo: " + e.getMessage());
	        }
					
		}
				
		
		public static String leerFichero() {
			
				ArrayList<String> Lista = new ArrayList<String>();
				try {
				      File myObj = new File("./input/texto.txt");
				      Scanner datos = new Scanner(myObj);
				      while (datos.hasNextLine()) {
				        String linea = datos.nextLine();
				        Lista.add(linea);
				      }
				      datos.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				String texto="";
				for (int i =0; i<Lista.size(); i++) {
					texto+= Lista.get(i)+"\n";
				}
				return texto;
			
		}
		
		public static String  pedirPalabras(String texto) {
			
			
			String palabra=null;
				
			do {
				System.out.println("Introduce palabras prohibidas: ");
				palabra= teclado.nextLine().trim();
				
				texto = texto.replaceAll(palabra, "***");	
			}while(!palabra.equalsIgnoreCase("terminar"));
			
			
			
			return texto;
		}
}
		
