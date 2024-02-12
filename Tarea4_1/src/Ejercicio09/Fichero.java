package Ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	public static String[] obtenerFlores() {
		ArrayList<String> Lista = new ArrayList<String>();
		try {
		      File myObj = new File(".\\archivos\\Flores.txt");
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
