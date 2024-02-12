package Ejercicio02;

public class Segmento {

		private double coordInicio;
	    private double coordFin;
	    private double longitud;


	    public Segmento() {
	    	
	    }
	    public Segmento(double coordInicio, double coordFin, double longitud) {
	        setCoordInicio(coordInicio);
	        setCoordFin(coordFin);
	        setLongitud(longitud);
	    }

	    public double getCoordInicio() {
	        return coordInicio;
	    }
	    public double getCoordFin() {
	        return coordFin;
	    }
	    public double getLongitud() {
	        return longitud;
	    }
	   
	    
	    
	    public void setCoordInicio(double coordInicio) {
	        this.coordInicio = coordInicio;
	    }
	    public void setCoordFin(double coordFin) {
	        this.coordFin = coordFin;
	    }
	    public void setLongitud(double longitud) {	
		        this.longitud = longitud;

	    }
	}






