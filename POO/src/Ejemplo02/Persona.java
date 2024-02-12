package Ejemplo02;

public class Persona {

	public String nombre;
	public String apellidos; 
	public String nombreCompleto() {
		return nombre+ " "+ apellidos;
	}
	public String apellidosNombre() {
		return apellidos+", "+nombre;
	}
}
