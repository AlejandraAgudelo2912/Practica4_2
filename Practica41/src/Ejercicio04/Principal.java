package Ejercicio04;

public class Principal{
	public static void main (String []arvs) {
		System.out.println("Inicio del programa\n");

	Punto punto1 = new Punto();
	punto1.x = -1.2;
	punto1.y = 0.6;
	String cuadrante = Punto.cuadrante(punto1.x, punto1.y);

	Punto punto2 = new Punto();
	punto2.x = 2.8;
	punto2.y = 1;
	String cuadrante2 = Punto.cuadrante(punto2.x, punto2.y);

	Punto punto3 = new Punto();
	punto3.x = 9.8;
	punto3.y = -1.9;
	String cuadrante3 = Punto.cuadrante(punto3.x, punto3.y);
	
	Punto punto4 = new Punto();
	punto4.x = 0;
	punto4.y = 0;
	String cuadrante4 = Punto.cuadrante(punto4.x, punto4.y);

	System.out.println("1º Punto:(" + punto1.x + "," + punto1.y + ")" + "\n"+cuadrante + "\n\n2º Punto:(" + punto2.x + "," + punto2.y + ")\n"+cuadrante2+"\n\n3º Punto:("+punto3.x+","+punto3.y+")\n"+cuadrante3+"\n\n4º Punto:("+punto4.x+","+punto4.y+")"+"\n"+cuadrante4);

	punto2.x = 2.1;
	punto2.y = 4;
	cuadrante = Punto.cuadrante(punto2.x, punto2.x);

	System.out.println("\n5º Punto:(" + punto2.x + "," + punto2.y + ")\n"+cuadrante);

	System.out.println("\nFin del programa");
	}
}
