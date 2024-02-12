package ParteA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String []arvs) {
		
		System.out.println("Inicio del programa");
		
	
		for (int k =1; k<=9;k++) {
			Modulo []array1 = obtenerModulo(Integer.toString(k));
			Alumno []array = obtenerAlumnos(Integer.toString(k));
		
			System.out.println("Modulo\n-------------");
			
			System.out.println((k)+"º Modulo: "+array1[k-1].getName());
			
			System.out.println("Lista de alumnos\n-------------");
			for (int i =0; i<array.length;i++) {
				System.out.println(array[i].getId()+"º: "+array[i].getName()+" , "+array[i].getApellidos()+" , "+array[i].getNif()+" , "+array[i].getEmail()+" , "+array[i].getDireccion()+" , "+array[i].getTelefono());	
			}
		}
	
		System.out.println("Fin del programa");

	}
	
	
	public static Alumno[] obtenerAlumnos(String n) {
		ArrayList<Alumno> Lista = new ArrayList<Alumno>();
		
		try {
		      File myObj = new File("./files/modulo_alumno.txt");
		      File file = new File("./files/alumnos.txt");
		      Scanner datos = new Scanner(myObj);
		      
		      while (datos.hasNextLine()) {
		    	  
		        String linea = datos.nextLine();
		        String [] campos = linea.split(",");
		        
		        String  alumnos = campos[1];
		        
		        Scanner datos1 = new Scanner(file);
		        if(n.equals(campos[0])) {
				      while (datos1.hasNextLine()) {
					        linea = datos1.nextLine();
					        String [] partes = linea.split("&");
					       	               
					        if(partes[0].equals(alumnos)) {
					        	Alumno alumno = new Alumno(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6]);
					        	Lista.add(alumno);
					        }
				      }
		        }
				      
				      datos1.close();
 
		      }
		      datos.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
			Alumno[]array = new Alumno [Lista.size()];
			for (int i =0; i<array.length; i++) {
				array[i]= Lista.get(i);
			}
			
		
		return array;	
		
	}
	public static Modulo[] obtenerModulo(String n) {
		ArrayList<Modulo> Lista = new ArrayList<Modulo>();
		
		try {
		      File myObj = new File("./files/modulo_alumno.txt");
		      File file = new File("./files/modulos.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        String [] campos = linea.split(",");
		        
		        Scanner datos1 = new Scanner(file);
		        
		        if(n.equals(campos[0])) {
			        while (datos1.hasNextLine()) {
				        linea = datos1.nextLine();
				        String [] partes = linea.split("&");
				        if(campos[0].equals(campos[0])) {
				        	Modulo modulo1 = new Modulo(partes[0],partes[1],partes[2],partes[3],partes[4]);
				        	
				        	Lista.add(modulo1);
				        }
			        }
		        }
		        datos1.close();
		        
		      }
		      datos.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		Modulo[]array = new Modulo [Lista.size()];
		for (int i =0; i<array.length; i++) {
			array[i]= Lista.get(i);
		}
	
	return array;	
	}
}
