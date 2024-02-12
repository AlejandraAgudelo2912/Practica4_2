package Ejercicio11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	public static void main (String []arvs) {

	System.out.println("Inicio del programa");
	
	Coche[]list= obtenerCoche();
	System.out.println("\nLista de Coches\n------------------");
	for (int i =0; i<list.length;i++) {
		System.out.println((i+1)+"º Coche: \n");

		System.out.println("Marca: "+list[i].getMarca());
		System.out.println("Modelo: "+list[i].getModelo());
		System.out.println("Color: "+list[i].getColor());
		System.out.println("Combustible: "+list[i].getCombustible());
		System.out.println("Kilometraje: "+list[i].getKilometraje()+" km\n");

	}
	System.out.println("Fin del programa");

}
	public static Coche[] obtenerCoche() {
		ArrayList<Coche> Lista = new ArrayList<Coche>();
		try {
		      File myObj = new File("./archivos/Coches.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        String [] campos = linea.split(",,");
		        Coche actual=new Coche (campos[0],campos[1],campos[2],campos[3],campos[4]);
		        Lista.add(actual);
		      }
		      datos.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Coche []array=new Coche [Lista.size()];
		for (int i =0; i<array.length; i++) {
			array[i]= Lista.get(i);
		}
		return array;
	}
}



class Coche{
	private String marca;
	private String modelo;
	private String color;
	private String kilometraje;
	private String combustible;
	
	public Coche() {
	}
	public Coche (String marca, String modelo, String color, String combustible,String kilometraje) {
		setMarca(marca);
		setModelo(modelo);
		setColor(color);
		setKilometraje(kilometraje);
		setCombustible(combustible);
	}
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getColor() {
		return this.color;
	}
	public String getKilometraje() {
		return this.kilometraje;
	}
	public String getCombustible() {
		return this.combustible;
	}
	
	public void setModelo(String modelo) {	
			this.modelo=modelo;	
	}
	public void setMarca(String marca) {
			this.marca=marca;
		
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setCombustible(String combustible) {
		this.combustible=combustible;
	}
	public void setKilometraje(String kilometraje) {
		
			this.kilometraje=kilometraje;
	
		
	}
}


