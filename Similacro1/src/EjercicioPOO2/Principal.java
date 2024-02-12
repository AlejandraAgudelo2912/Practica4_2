package EjercicioPOO2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	public static void main (String []arvs) {
		
		System.out.println("Inicio del programa");
		Coordenada []list =obtenerCoordenadas();
		calcularDistancias(list);
		System.out.println("Fin del programa");
	}
	public static Coordenada[] obtenerCoordenadas() {
		ArrayList<Coordenada> Lista = new ArrayList<Coordenada>();
		try {
		      File myObj = new File("./Archivos/coordenadas.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        String [] campos = linea.split(",");
		        double x =Double.parseDouble(campos[0]);
		        double y =Double.parseDouble(campos[1]);

		        Coordenada actual=new Coordenada (x,y);
		        Lista.add(actual);
		      }
		      datos.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Coordenada []array=new Coordenada [Lista.size()];
		for (int i =0; i<array.length; i++) {
			array[i]= Lista.get(i);
		}
		return array;
	}
	public static void calcularDistancias (Coordenada []lista) {
		double distanciaTotal=0;
		System.out.println("Distancia entre puntos\n-------------------");
		for (int i =0; i<lista.length-1;i++) {
			double distancia = lista[i].distancia(lista[i+1]);
			distanciaTotal+=distancia;
			System.out.println((i+1)+"º: "+lista[i]+"---->"+lista[i+1]+" Distancia: "+distancia);
		}
		System.out.println("\nDISTANCIA TOTAL: "+distanciaTotal);
	}
	
}
