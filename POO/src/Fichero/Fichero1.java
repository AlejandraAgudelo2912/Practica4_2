package Fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero1 {
	public static void main (String []arvs) {
	
		System.out.println("Inicio del programa");
		
		leerFichero();
		
		System.out.println("Fin del programa");

	}
	public static void leerFichero() {
		try {
		      File myObj = new File("./archivos/Alumnos.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
