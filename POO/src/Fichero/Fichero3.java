package Fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero3 {
	public static void main (String []arvs) {
	
		System.out.println("Inicio del programa");
		
		Articulo[]list= obtenerArticulos();
		System.out.println("Lista de Articulos\n------------------");
		for (int i =0; i<list.length;i++) {
			System.out.println("Nombre: "+list[i].getNombre());
			System.out.println("Precio: "+list[i].getPrecio()+"€");

			System.out.println("Descripcion: "+list[i].getDescripcion()+"\n");

		}
		System.out.println("Fin del programa");

	}
	public static Articulo[] obtenerArticulos() {
		ArrayList<Articulo> Lista = new ArrayList<Articulo>();
		try {
		      File myObj = new File("./archivos/Articulos.txt");
		      Scanner datos = new Scanner(myObj);
		      while (datos.hasNextLine()) {
		        String linea = datos.nextLine();
		        String [] campos = linea.split("@");
		        double precio =Double.parseDouble(campos[1]);
		        Articulo actual=new Articulo (campos[0],precio,campos[2]);
		        Lista.add(actual);
		      }
		      datos.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		Articulo []array=new Articulo [Lista.size()];
		for (int i =0; i<array.length; i++) {
			array[i]= Lista.get(i);
		}
		return array;
	}
}



class Articulo{
	private String nombre;
	private double precio;
	private String descripcion;
	
	public Articulo() {
		
	
	}
	public Articulo (String nombre, double precio, String descripcion) {
		setNombre(nombre);
		setDescripcion(descripcion);
		setPrecio(precio);
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getPrecio() {
		return this.precio;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setNombre(String nombre) {
		if (nombre.trim().length()>3) {
			this.nombre=nombre;
		}
	}
	public void setPrecio(double precio) {
		if (precio>0) {
			this.precio=precio;
		}
	}
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
}
