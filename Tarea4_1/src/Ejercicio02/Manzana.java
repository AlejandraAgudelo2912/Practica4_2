package Ejercicio02;

public class Manzana {
	private String tipo;
	private double precio;
	private double peso;
	
	
	public Manzana() {

    }

    public Manzana(String tipo, double precio, double peso) {
        this.tipo = tipo;
        this.precio = precio;
        this.peso=peso;
    }

    public String getTipo() {
        return tipo;
    }


    public double getPrecio() {
        return precio;
    }
    public double getPeso() {
        return peso;
    }
    
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
    	if (precio>=0) {
            this.precio = precio;

    	}
    }
    public void setPeso(double peso) {
    	if (precio>=0) {
            this.peso = peso;

    	}
    }
}
