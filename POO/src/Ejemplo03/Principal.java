package Ejemplo03;

public class Principal {
	public static void main (String []args) {
		Persona p1 = new Persona ("David", "Munuera");
		
		Persona p2= new Persona();
		
		System.out.println(p1.nombreCompleto()+"\n"+p2.apellidosNombre());
	}

}
