package Ejercicio02;

public class Movil {
	    private String marca;
	    private String modelo;
	    private String so;//sistema operativo
	    private double precio;
	    
	    public Movil() {
	    }

	    public Movil(String marca, String modelo, String so, double precio) {
	    	setMarca(marca);
	    	setModelo(modelo);
	    	setSo(so);
	    	setPrecio(precio);
	    }

	    public String getMarca() {
	        return marca;
	    }
	    public String getModelo() {
	        return modelo;
	    }
	    public String getSo() {
	        return so;
	    }	   
	    public double getPrecio() {
	        return precio;
	    }

   
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	    
	    public void setSo(String so) {
	        this.so = so;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }
	   
	}
