package Ejercicio10;

import java.io.FileWriter;
import java.io.IOException;


public class Fichero {
	
	public static boolean insertar(Fichero cancion) {
		String nuevalinea = cancion.getTitulo()+"/"+cancion.getAutor()+"/"+cancion.getAnio();
		try {
		      FileWriter myWriter = new FileWriter(".\\archivos\\Canciones.txt",true);
		      myWriter.write("\n"+nuevalinea);
		      myWriter.close(); 
		    } catch (IOException e) {
		      return false;
		    }
		return true;
	}
	
	

		private String titulo;
		private int anio;
		private String autor;
		
		public Fichero() {
			
		}
		public Fichero(String titulo, int anio, String autor) {
			setTitulo(titulo);
			setAnio(anio);
			setAutor(autor);
		}
		public String getTitulo() {
			return this.titulo;
		}
		public int getAnio() {
			return this.anio;
		}
		public String getAutor() {
			return this.autor;
		}
	
		
		public void setTitulo(String titulo) {
			this.titulo=titulo;
		}
		public void setAnio(int anio) {
			this.anio=anio;
		}
		public void setAutor(String autor) {
			this.autor=autor;
		}
		
	}

	

