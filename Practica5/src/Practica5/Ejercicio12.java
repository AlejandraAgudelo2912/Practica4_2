package Practica5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio12 {
	public static void main (String[]arvs) throws InterruptedException {
		System.out.println("Inicio del programa.\n");
		
		for(int i =0; i<10; i++) {   
			String fecha = fechaHoraActual();
			System.out.println("Fecha y hora actual: "+fecha);
			Thread.sleep(1000);//1 segundo en milisegundos
		}
				
		System.out.println("\nFin del programa.");

	}
	public static String fechaHoraActual() {
		LocalDateTime hoy = LocalDateTime.now();  
        String hora = hoy.getHour()+":"+hoy.getMinute()+":"+hoy.getSecond();
        
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String fecha2 = hoy.format(fecha);
        
        return hora+" "+fecha2;
	
	}
}
