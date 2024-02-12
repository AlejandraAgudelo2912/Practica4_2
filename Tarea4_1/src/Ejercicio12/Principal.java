package Ejercicio12;

import java.util.Scanner;

public class Principal {
	public static void main (String []arvs) {
	System.out.println("Inicio del programa");

	
	Scanner teclado = new Scanner (System.in);
	System.out.print("\nIntroduzca un vehiculo:\n ");
	System.out.print("Marca: ");

	String marca = teclado.nextLine().trim();
	System.out.print("Modelo: ");
	String modelo = teclado.nextLine().trim();
	System.out.print("Color: ");
	String color = teclado.nextLine().trim();
	System.out.print("Combustible: ");
	String combustible = teclado.nextLine().trim();
	System.out.print("Kilometraje: ");
	String kilometraje = teclado.nextLine().trim();

	Coche coche = new Coche (marca, modelo, color, combustible, kilometraje);
	boolean resultado = Archivo.insertar(coche);
if (resultado) {
	System.out.println("Insertado existosamente. ");
}else{
	System.out.println("Ha ocurrido un error... ");
}

Coche[]list= Archivo.obtenerCoche();
System.out.println("\nLista de Coches\n------------------");
for (int i =0; i<list.length;i++) {
	System.out.println((i+1)+"º Coche: \n");

	System.out.println("Marca: "+list[i].getMarca());
	System.out.println("Modelo: "+list[i].getModelo());
	System.out.println("Color: "+list[i].getColor());
	System.out.println("Combustible: "+list[i].getCombustible());
	System.out.println("Kilometraje: "+list[i].getKilometraje()+" km\n");
}

System.out.println("\nFin del programa");
teclado.close();
}
	}

