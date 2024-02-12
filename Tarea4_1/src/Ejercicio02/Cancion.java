package Ejercicio02;

public class Cancion {
	
	    private String titulo;
	    private String artista;
	    private int anio;

	    public Cancion() {
	    	
	    }
	    public Cancion(String titulo, String artista, int anio) {
	        this.titulo = titulo;
	        this.artista = artista;
	        this.anio = anio;
	    }

	    public String getTitulo() {
	        return titulo;
	    }
	    public String getArtista() {
	        return artista;
	    }
	    public int getAnio() {
	        return anio;
	    }
	    
	    
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	    public void setArtista(String artista) {
	        this.artista = artista;
	    }
	    public void setAnio(int anio) {
	    	if (anio>0) {
		        this.anio = anio;

	    	}
	    }
	}


