package Supuesto4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Acceso {
	public static Scanner teclado = new Scanner (System.in);

	public static void leer() {
		ArrayList<String> Lista=new ArrayList<String>();
			    try {
			      File myObj = new File("./archivos/textos.txt");
			      Scanner myReader = new Scanner(myObj);
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        Lista.add(data);
			      }
			      myReader.close();
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
				String[]array= new String [Lista.size()];
			for (int i =0; i<Lista.size();i++) {
				array[i]=Lista.get(i);
			}
			
			
			for (int i =1; i<array.length-1;i++) {
				for (int j =0; j<array.length-i;j++) {
					if ((array[j].trim().compareToIgnoreCase(array[j+1].trim()))>0){
						String aux = array[j];
						array[j]=array[j+1];
						array[j+1]=aux;
					}
				}
			}
			System.out.println();
			for (int i =0; i<array.length;i++ ) {
				System.out.print((i+1)+"º "+array[i]+"\n");
			}
					    
			
	}
	
	public static boolean insertar(String texto) {
		
		if (texto.length()<5) {
			return false;
		}
		
			    try {
			      FileWriter myWriter = new FileWriter("./archivos/textos.txt", true);
			      myWriter.write("\n"+texto);
			      myWriter.close();
			      return true;
			    } catch (IOException e) {
			      e.printStackTrace();
			    }
			  
			
	return false;
		
	}
	
	public static int pedirInt(String texto) {
		int n =0;
		boolean valido= false;
		while(!valido) {
			try {
				System.out.print(texto);
				n=Integer.parseInt(teclado.nextLine());
				valido=true;
			}catch(Exception e) {
				System.out.println("ERROR: Introduzca numeros");
			}
		}
		return n;
	}
}


