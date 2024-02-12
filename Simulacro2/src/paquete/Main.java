package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static Scanner teclado = new Scanner (System.in);
	public static void main (String[]arvs ) {
		System.out.println("Inicio del programa");

		System.out.print("Introduce un dominio: ");	
		String dominio = teclado.nextLine();
		
		User[] resultado =obtenerCorreos(dominio);
		String plantilla = obtenerPlantilla();
		for (int i =0; i<resultado.length;i++) {
			enviarEmail(resultado[i], plantilla);
		}
		System.out.println("Fin del programa");
	}
	public static User[] obtenerCorreos(String dominio) {	
		String regex = ".*@" + dominio +".*";
		ArrayList<User> lista = new ArrayList<User>();
		
		try {
		      File myObj = new File("./archivos/usuarios(1).txt");
		      Scanner datos = new Scanner(myObj);
		      
		      while (datos.hasNextLine()) {
		    	  
		        String linea = datos.nextLine();
	
				String [] campos = linea.split("&");
				if(campos[4].matches(regex)) {
				
					User actual = new User (campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6]);
					lista.add(actual);
				}
				
		      }

	      datos.close();
	    } catch (FileNotFoundException e) {
	    }
		
		User[] usuarios = new User[lista.size()];
		for (int i =0; i<usuarios.length; i++) {
			usuarios[i]= lista.get(i);
		}
	
		return usuarios;	
	
	}
	public static String obtenerPlantilla() {
		String plantilla ="";
		try {
		      File myObj = new File("./archivos/plantilla.html");
		      Scanner datos = new Scanner(myObj);
		      
		      while (datos.hasNextLine()) {
		    	  
		        String linea = datos.nextLine();
		        plantilla+=linea;
		      }

	      datos.close();
	    } catch (FileNotFoundException e) {

	    }
		return plantilla;
	}
	public static void enviarEmail(User usuario, String plantilla) {
		String email =plantilla;
		email = email.replaceAll("=nombre=", usuario.getName());
		email = email.replaceAll("=apellidos=", usuario.getApellidos());
		email = email.replaceAll("=direccion=", usuario.getDireccion());
		email = email.replaceAll("=dni=", usuario.getNif());
		email = email.replaceAll("=telefono=", usuario.getTelefono());
		email = email.replaceAll("=email=", usuario.getEmail());
		
		//generar el nombre
		String [] partes=usuario.getEmail().split("@");
		String fichero = partes[0]+"_"+System.currentTimeMillis()+".html";
		
		//enviar emails
		try {
            FileWriter writer = new FileWriter("./output/"+fichero);
            writer.write(email);
            writer.close();

        } catch (IOException e) {
        }
		
	}
	
}