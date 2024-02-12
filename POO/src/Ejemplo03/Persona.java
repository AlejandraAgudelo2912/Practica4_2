package Ejemplo03;

public class Persona {

	public String nombre;
	public String apellidos;
	
	//constructor
	public Persona() {
		System.out.println("Persona creada!");
		nombre = "Sin nombre";
		apellidos = "Sin apellidos";
	}
	public Persona(String nombre, String surname) {
		this.nombre = nombre;
		apellidos = surname;
	}
	public String nombreCompleto() {
		return nombre+ " "+ apellidos;
	}
	public String apellidosNombre() {
		return apellidos+", "+nombre;
	}
}
