package Ejercicio02;

public class Poligono {
	private int numLados;
    private double angulos;
    private String nombre;
    private double area;


    public Poligono() {
    	
    }
    public Poligono(int numLados, double angulos, String nombre, double area) {
        setNumLados(numLados);
        setAngulos(angulos);
        setNombre(nombre);
        setArea(area);
    }

    public int getNumLados() {
        return numLados;
    }
    public double getAngulos() {
        return angulos;
    }
    public String getNombre() {
        return nombre;
    }
    public double getArea() {
        return area;
    }
    
    
    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    public void setAngulos(double angulos) {
        this.angulos = angulos;
    }
    public void setNombre(String nombre) {	
	        this.nombre = nombre;

    }
    public void setArea(double area) {	
        this.area = area;

    }
}




