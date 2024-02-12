package EjercicioPOO;

import java.util.Scanner;

public class Principal {
	public static void main (String []args) {
	System.out.println("Inicio del programa");
	Scanner teclado = new Scanner(System.in);
	System.out.print("Introduce una cantidad de alumnos: ");

	int cantidad = Integer.parseInt(teclado.nextLine().trim());
	
	Alumno[]alumnos = pedirAlumnos(cantidad);
	
	for (int i =0; i<alumnos.length;i++) {
		System.out.println((i+1)+"º alumno");
		System.out.println("----------");
		System.out.println("Nombre: "+alumnos[i].getNombre());
		System.out.println("Apellidos: "+alumnos[i].getApellidos());
		System.out.println("NRE: "+alumnos[i].getNre());
		System.out.println("Email: "+alumnos[i].getEmail());
		System.out.println("Direccion: "+alumnos[i].getDireccion());

	}
	System.out.println("Fin del programa");
	
	teclado.close();
	}
	
	public static Alumno[] pedirAlumnos(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		Alumno[] alumnos= new Alumno [cantidad];
		
		for (int i =0; i<cantidad; i++) {
			
			Alumno actual = new Alumno();
			System.out.println((i+1)+"º alumno");
			System.out.print("Nombre: ");
			actual.setNombre(teclado.nextLine());
			System.out.print("Apellidos: ");
			actual.setApellidos(teclado.nextLine());
			System.out.print("Nre: ");
			actual.setNre(teclado.nextLine());
			System.out.print("Email: ");
			actual.setEmail(teclado.nextLine());
			System.out.print("Direccion: ");
			actual.setDireccion(teclado.nextLine());
			alumnos[i]= actual;

		}
		teclado.close();
		
		return alumnos;
		
	}
}
