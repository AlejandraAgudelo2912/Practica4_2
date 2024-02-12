package Fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero2 {
	public static void main (String []arvs) {
	
		System.out.println("Inicio del programa");
		
		String []array = obtenerAlumnos();
		System.out.println("Lista de alumnos\n-------------");
		for (int i =0; i<array.length;i++) {
			System.out.println((i+1)+"º: "+array[i]);
		}
		System.out.println("Fin del programa");

	}
	public static String[] obtenerAlumnos() {
		ArrayList<String> Lista = new ArrayList<String>();
		try {
		      File myObj = new File("./archivos/Alumnos.txt");
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
		String []array=new String [Lista.size()];
		for (int i =0; i<array.length; i++) {
			array[i]= Lista.get(i);
		}
		
		return array;
	}
}
