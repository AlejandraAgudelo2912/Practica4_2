import java.util.Scanner;

public class Main {
	public static void main (String[]arvs) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Inicio del programa\n");

		System.out.print("Introduce una frase: ");
		String frase = teclado.nextLine().trim();
		
		String fraseCambiada = cambiarVerbos(frase);
		
		System.out.println(fraseCambiada);
		
		System.out.println("\nFin del programa");

		teclado.close();
	}
	public static String cambiarVerbos(String frase) {
		String regex ="[a-zA-ZñÑ]*([aAeEiI][rR])\\b"; //la contrabarra b es para identificar el principio o final de una palabra
		frase = frase.replaceAll(regex, "(VERBO)");
		return frase;
	}
}
