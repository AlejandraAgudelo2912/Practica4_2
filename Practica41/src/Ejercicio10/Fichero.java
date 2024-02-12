package Ejercicio10;

import java.io.FileWriter;
import java.io.IOException;


public class Fichero {
	
	public static boolean insertar(String flor) {
		String nuevalinea = flor;
		try {
		      FileWriter myWriter = new FileWriter("./archivos/Flores.txt",true);
		      myWriter.write("\n"+nuevalinea);
		      myWriter.close(); 
		    } catch (IOException e) {
		      return false;
		    }
		return true;
	}
}

	

