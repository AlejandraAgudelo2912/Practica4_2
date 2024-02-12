package Ejercicio02;

public class Libro {
	    private String titulo;
	    private String autor;
	    private String genero;
	    
	    public Libro () {
	    }

	    public Libro(String titulo, String autor, String genero) {
	        setTitulo(titulo);
	        setAutor(autor);
	        setGenero(genero);
	    }

	    public String getTitulo() {
	        return titulo;
	    }
	    public String getAutor() {
	        return autor;
	    }
	    public String getGenero() {
	        return genero;
	    }
	    
	    
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }
	    public void setAutor(String autor) {
	        this.autor = autor;
	    }
	    public void setGenero(String genero) {
	        this.genero = genero;
	    }
	}


