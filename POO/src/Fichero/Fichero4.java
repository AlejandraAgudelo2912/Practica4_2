package Fichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero4 {
	public static void main (String []arvs) {
	
		System.out.println("Inicio del programa");
		
			Scanner teclado = new Scanner (System.in);
			System.out.print("Titulo: ");
			String titulo = teclado.nextLine().trim();
			System.out.print("Duracion: ");
			int duracion = Integer.parseInt(teclado.nextLine().trim());
			System.out.print("Sinopsis: ");
			String sinopsis = teclado.nextLine().trim();
			System.out.print("Genero: ");
			String genero = teclado.nextLine().trim();

			Pelicula peli = new Pelicula (titulo, duracion, sinopsis, genero);
			boolean resultado = insertar(peli);
		if (resultado) {
			System.out.println("Insertado existosamente. ");
		}else{
			System.out.println("Ha ocurrido un error... ");

		}
		teclado.close();
		System.out.println("Fin del programa");

	}
	public static boolean insertar(Pelicula peli) {
		String nuevalinea = peli.getTitulo()+"="+peli.getduracion()+"="+peli.getsinopsis()+"="+peli.getgenero();
		try {
		      FileWriter myWriter = new FileWriter("./archivos/Pelicula.txt",true);
		      myWriter.write("\n"+nuevalinea);
		      myWriter.close(); 
		    } catch (IOException e) {
		      return false;
		    }
		return true;
	}
	
}

class Pelicula {
	private String titulo;
	private int duracion;
	private String sinopsis;
	private String genero;
	
	public Pelicula() {
		
	}
	public Pelicula(String titulo, int duracion, String sinopsis, String genero ) {
		setTitulo(titulo);
		setDuracion(duracion);
		setSinopsis(sinopsis);
		setGenero(genero);

	}
	public String getTitulo() {
		return this.titulo;
	}
	public int getduracion() {
		return this.duracion;
	}
	public String getsinopsis() {
		return this.sinopsis;
	}
	public String getgenero() {
		return this.genero;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void setDuracion(int duracion) {
		this.duracion=duracion;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis=sinopsis;
	}
	public void setGenero(String genero) {
		this.genero=genero;
	}
}