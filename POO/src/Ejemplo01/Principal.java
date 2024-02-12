package Ejemplo01;

public class Principal {
	public static void main (String []args) {
		Persona p1 = new Persona ();
		p1.nombre= "David";
		p1.apellidos="Munuera Sanchez";
		Persona p2= new Persona();
		p2.nombre="Jesus";
		p2.apellidos="Palacios";
		System.out.println(p1.nombre+" "+p1.apellidos+"\n"+p2.nombre+" "+p2.apellidos);
	}

}
