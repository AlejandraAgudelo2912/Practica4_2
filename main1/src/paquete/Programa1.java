package paquete;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduce un texto: ");
		String texto = teclado.nextLine();
		System.out.println("Introduce un número entero: ");
		int n1 = teclado.nextInt();
		System.out.println("Introduce otro número entero: ");
		int n2 = teclado.nextInt();
		System.out.println("Introduce un último número entero: ");
		int n3 = teclado.nextInt();
		System.out.println("Introduce un número decimal: ");
		double n4 = teclado.nextDouble();
		
		if (n1<0) {
			n1= Math.abs(n1);
		}
		if (n2<0) {
			n2 = Math.abs(n2);
		}
		if (n3<0) {
			n3 = Math.abs(n3);
		}
		int resultado = n2*n3+n1;
		
		System.out.println("Introduce otro número decimal para mostrar su entero por abajo: ");
		double n5 = teclado.nextDouble();
		double num5 = Math.ceil(n5);
		System.out.println("Introduce un último número decimal para mostrar su entero por arriba: ");
		double n6 = teclado.nextDouble();
		double num6 = Math.floor(n6);
		
		System.out.println("El texto introducido es: "+texto);
		System.out.println("El valor absoluto del primer número introducido es: "+n1);
		System.out.println("El valor absoluto del segundo número introducido es: "+n2);
		System.out.println("El valor absoluto del tercer número introducido es: "+n3);
		System.out.println("El decimal introducido es: "+n4);
		System.out.println("El resultado de la operación es: "+resultado);
		System.out.println("El entero del décimal (por abajo) es: "+num6);
		System.out.println("El entero del decimal (por arriba) es: "+num5);
		
		System.out.println("Fin de programa");
		teclado.close();
	}

}
