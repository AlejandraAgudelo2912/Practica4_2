package Ejercicio07;

public class Principal{
	public static void main (String []arvs) {
		System.out.println("Inicio del programa\n");

		Punto punto = new Punto();
		punto.setX(0);
		punto.setY(0);
		String cuadrante = Punto.cuadrante(punto.x,punto.y);
		System.out.println("1º Punto:(" + punto.getX() + "," + punto.getY() + ")\nDistancia al eje: "+punto.distancia()+"\n"+cuadrante);
		
		punto.setX(-2);
		punto.setY(4);
		cuadrante = Punto.cuadrante(punto.x,punto.y);
		System.out.println("\n2º Punto:(" + punto.getX() + "," + punto.getY() + ")\nDistancia al eje: "+punto.distancia()+"\n"+cuadrante);
	
		punto.setX(1);
		punto.setY(1);
		cuadrante = Punto.cuadrante(punto.x,punto.y);
		System.out.println("\n3º Punto:(" + punto.getX() + "," + punto.getY() + ")\nDistancia al eje: "+punto.distancia()+"\n"+cuadrante);
	
	
		System.out.println("\nFin del programa");
	}
}
