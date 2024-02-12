package Ejemplo02;

public class Principal {
	public static void main (String []args) {
		Persona p1 = new Persona ();
		p1.nombre= "Martinez";
		p1.apellidos="Munuera Sanchez";
		Persona p2= new Persona();
		p2.nombre="Dioni";
		p2.apellidos="Patri";
		System.out.println(p1.nombreCompleto()+"\n"+p2.apellidosNombre());
	}

}
