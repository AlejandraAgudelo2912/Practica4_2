package Ejercicio01;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");

		Punto x1 = new Punto();
		x1.x = 1;
		x1.y = 0;
		Punto x2 = new Punto();
		x2.x = 0;
		x2.y = 1;
		System.out.println("1º Punto:(" + x1.x + "," + x1.y + ")" + "\n" + "2º Punto:(" + x2.x + "," + x2.y + ")");

		x1.x = 2;
		x1.y = 4;
		System.out.println("1º Punto:(" + x1.x + "," + x1.y + ")");

		System.out.println("\nFin del programa");
	}
}
