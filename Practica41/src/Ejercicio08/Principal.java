package Ejercicio08;

public class Principal{
	public static void main (String []arvs) {
		System.out.println("Inicio del programa\n");

	Punto punto = new Punto();
	punto.setX(-4);
	punto.setY(3);
	String cuadrante = Punto.cuadrante(punto.x,punto.y);
	System.out.println("1º Punto:(" + punto.getX() + "," + punto.getY() + ")\nDistancia al eje: "+punto.distancia()+"\n"+cuadrante);
	punto.moverA1();

	punto.setX(-2.9);
	punto.setY(4);
	 cuadrante = Punto.cuadrante(punto.x,punto.y);
	System.out.println("\n2º Punto:(" + punto.getX() + "," + punto.getY() + ")\nDistancia al eje: "+punto.distancia()+"\n"+cuadrante);
	punto.moverA1();

	punto.setX(1.9);
	punto.setY(-2.1);
	 cuadrante = Punto.cuadrante(punto.x,punto.y);
	System.out.println("\n3º Punto:(" + punto.getX() + "," + punto.getY() + ")\nDistancia al eje: "+punto.distancia()+"\n"+cuadrante);
	punto.moverA1();


	System.out.println("\nFin del programa");
	}
}
