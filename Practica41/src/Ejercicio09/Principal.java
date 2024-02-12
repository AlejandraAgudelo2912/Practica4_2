package Ejercicio09;

public class Principal {
	
		public static void main (String []arvs) {
		
			System.out.println("Inicio del programa\n");
			
			String []array = Fichero.obtenerFlores();
			System.out.println("Lista\n-------------");
			
			for (int i =0; i<array.length;i++) {
				System.out.println((i+1)+"º: "+array[i]);
			

			}
			System.out.println("\nFin del programa");
		}
}
