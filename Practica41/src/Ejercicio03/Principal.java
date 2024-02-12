package Ejercicio03;

public class Principal{
	public static void main (String []arvs) {
		System.out.println("Inicio del programa\n");

	Punto punto1 = new Punto();
	punto1.x = -1.2;
	punto1.y = 0.6;
	
	Punto punto2 = new Punto();
	punto2.x = 2.8;
	punto2.y = 1;
	
	Punto punto3 = new Punto();
	punto3.x = 9.8;
	punto3.y = -1.9;
	
	Punto punto4 = new Punto();
	punto4.x = 1.4;
	punto4.y = 0.3;
	
	System.out.println("1º Punto:(" + punto1.x + "," + punto1.y + ")" + "\n" + "2º Punto:(" + punto2.x + "," + punto2.y + ")\n"+"3º Punto:("+punto3.x+","+punto3.y+")\n4º Punto:("+punto4.x+","+punto4.y);

	punto2.x = 2.1;
	punto2.y = 4;
	System.out.println("1º Punto:(" + punto2.x + "," + punto2.y + ")");

	System.out.println("\nFin del programa");
	}
}
