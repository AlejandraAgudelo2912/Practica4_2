package Practica5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio10 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa.\n");

		String fecha = fechaActual();
		System.out.println("Fecha actual: "+fecha);
		System.out.println("\nFin del programa.");

	}
	public static String fechaActual() {
		LocalDateTime hoy = LocalDateTime.now();  
		
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatea la fecha
        
        String fecha2 = hoy.format(fecha);
        
        return fecha2;
	}
}
