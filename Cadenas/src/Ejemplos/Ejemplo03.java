package Ejemplos;

public class Ejemplo03 {
	public static void main (String[]arvs) {
		System.out.println("Inicio del programa");
		
		Punto p1 = new Punto (3,8);
		System.out.println("Punto actual");
		
		System.out.println(p1);

		System.out.println("Fin del programa");
	
	}
}

class Punto {
	public int x, y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Punto ["+this.x+","+this.y+"]";
	}
}