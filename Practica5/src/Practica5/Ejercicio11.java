package Practica5;

import java.time.LocalDateTime;

public class Ejercicio11 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa.\n");

		String hora = horaActual();
		System.out.println("Hora actual: "+hora);
		System.out.println("\nFin del programa.");

	}
	public static String horaActual() {
		LocalDateTime hoy = LocalDateTime.now();  
        
        return hoy.getHour()+":"+hoy.getMinute()+":"+hoy.getSecond();
	
	}
}
