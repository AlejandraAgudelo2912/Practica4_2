package Ejercicio02;

	public class Disco {
		
		    private String album;
		    private String grupo;
		    private int numCanciones;
		    private double precio;

		    public Disco() {
		    	
		    }
		    public Disco(String album, String grupo, int numCanciones, double precio) {
		        setAlbun(album);
		        setGrupo(grupo);
		        setNumCanciones(numCanciones);
		        setPrecio(precio);

		    }

		    public String getAlbum() {
		        return album;
		    }
		    public String getGrupo() {
		        return grupo;
		    }
		    public int getNumCanciones() {
		        return numCanciones;
		    }
		    public double getPrecio() {
		        return precio;
		    }
		    
		    
		    public void setAlbun(String album) {
		        this.album = album;
		    }
		    public void setGrupo(String grupo) {
		        this.grupo = grupo;
		    }
		    public void setNumCanciones(int numCanciones) {
		    	if (numCanciones>0) {
			        this.numCanciones = numCanciones;

		    	}
		    }
		    public void setPrecio(double precio) {
				if (precio>0) {
				this.precio = precio;

				}
		    }
		}




