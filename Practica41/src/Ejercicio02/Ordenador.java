package Ejercicio02;

public class Ordenador {
	    private String marca;
	    private String modelo;
	    private String tipo;
	    private int ram;

	    
	    public Ordenador () {
	    	
	    }
	    public Ordenador(String marca, String modelo, String tipo, int ram) {
	        setMarca(marca);
	        setModelo(modelo);
	        setRam(ram);
	    }

	    public String getMarca() {
	        return marca;
	    }
	    public String getModelo() {
	        return modelo;
	    }
	    public String getTipo() {
	        return tipo;
	    }
	    public int ram() {
	        return ram;
	    }
	    
	    
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }
	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }
	    public void setRam(int ram) {
	    	if (ram>0) {
		        this.ram = ram;

	    	}
	    }
	}


